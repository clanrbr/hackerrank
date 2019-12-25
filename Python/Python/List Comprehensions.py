if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    result = []

    for i in range(x + 1):
        for p in range(y+1):
            for t in range(z+1):
                if i + p + t != n:
                    result.append([i, p, t])
    print(result)