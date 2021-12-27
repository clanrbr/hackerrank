'use strict'

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
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

function bonAppetit(bill, k, b) {
    const billPrice = bill.reduce((acc, curr, index) => {
      if (index !== k) {
        acc += curr
      }

      return acc
    }, 0)
    
    const halfBill = billPrice/2
    return halfBill === b ? 'Bon Appetit' : b - halfBill
}

function main() {
    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ')

    const n = parseInt(firstMultipleInput[0], 10)

    const k = parseInt(firstMultipleInput[1], 10)

    const bill = readLine().replace(/\s+$/g, '').split(' ').map(billTemp => parseInt(billTemp, 10))

    const b = parseInt(readLine().trim(), 10)

    console.log(bonAppetit(bill, k, b))
}
