if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arrList = list(arr)
    maxValue = max(arrList)
    secondLargest = min(arrList)
    for i in arrList:
        if i > secondLargest and i < maxValue:
            secondLargest = i
    print(secondLargest)
