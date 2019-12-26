def print_formatted(number):
  spaceWidth = len("{0:b}".format(number))
  for i in range(1, number + 1):
    print ("{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=spaceWidth))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)