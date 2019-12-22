if __name__ == '__main__':
    N = int(input())
    a=[]
    b={
        "insert": a.insert,
        "append": a.append,
        "remove": a.remove,
        "sort": a.sort,
        "pop": a.pop,
        "reverse": a.reverse
    }
    
    for i in range(N):
        line = input().split()
        if line[0] == "insert":
            b[line[0]](int(line[1]),int(line[2]))
        elif line[0] == "append" or line[0] == "remove":
            b[line[0]](int(line[1]))
        elif line[0] == "print":
          print(a)
        else:
          b[line[0]]()
