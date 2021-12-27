'use strict'

const fs = require('fs')

process.stdin.resume()
process.stdin.setEncoding('utf-8')

let inputString = ''
let currentLine = 0

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin
})

process.stdin.on('end', function() {
    inputString = inputString.split('\n')

    main()
})

function readLine() {
    return inputString[currentLine++]
}

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

function gcdTwoNumbers(a, b) {
  if (!b) return b === 0 ? a : b
  return gcdTwoNumbers(b, a%b)
}

function gcdList(array) {
  let n = 0
  array.forEach((number) => {
    n = gcdTwoNumbers(number, n)
  })
  return n
}

function lcmTwoNumbers(a, b) {
  return (a * b) / gcdTwoNumbers(a, b)
}

function lcmList(array) {
  let n = 1
  array.forEach((number) => {
    n = lcmTwoNumbers(number, n)
  })
  return n
}

function getTotalX(a, b) {
  const aLCM = lcmList(a)
  const bGCD = gcdList(b)

  let count = 0
  for(let i = aLCM, j = 2 ; i <= bGCD; i = aLCM * j,j++){
    if ( bGCD % i == 0 ) {
      count++
    }
  }

  return count

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH)

    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ')

    const n = parseInt(firstMultipleInput[0], 10)

    const m = parseInt(firstMultipleInput[1], 10)

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10))

    const brr = readLine().replace(/\s+$/g, '').split(' ').map(brrTemp => parseInt(brrTemp, 10))

    const total = getTotalX(arr, brr)

    ws.write(total + '\n')

    ws.end()
}
