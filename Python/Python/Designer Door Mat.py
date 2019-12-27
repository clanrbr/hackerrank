def drawDoorMap(n, m):
    middleText = ('WELCOME').center(m, "-")
    newList = []
    for i in range(int((n-1)/2)):
        s = "|.." * i + '|.'
        formattedList = (s[1:len(s)][::-1] + s).center(m, "-")
        newList.append(formattedList)
    print('\n'.join(newList + [middleText] + newList[::-1]))

if __name__ == '__main__':
    sizes = list(map(int, input().split()))
    drawDoorMap(sizes[0], sizes[1])
