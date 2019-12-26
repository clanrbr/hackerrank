def getSecondLowestScore(dictionaryList):
    scores = list(dictionaryList.keys())
    lowestNumber = max(scores) + 1
    secondLowestNumber = lowestNumber
    for i in range(0, len(scores)):
        if scores[i] < lowestNumber: 
            secondLowestNumber = lowestNumber 
            lowestNumber = scores[i]
        elif (scores[i] < secondLowestNumber and scores[i] != lowestNumber): 
            secondLowestNumber = scores[i]; 

    if secondLowestNumber == max(scores) + 1:
        secondLowestNumber = lowestNumber

    return dictionaryList[secondLowestNumber]

if __name__ == '__main__':
    dictionaryList = {}
    for _ in range(int(input())):
        name = input()
        score = float(input())
        if score in dictionaryList:
            dictionaryList[score].append(name)
            continue
        dictionaryList[score] = [name]

    secondLowestRecord = getSecondLowestScore(dictionaryList)
    for name in sorted(secondLowestRecord):
        print(name)


