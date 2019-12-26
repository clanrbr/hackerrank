def changeTextFormat(s):
    if s.islower():
        return s.upper()
    return s.lower()

def swap_case(s):
    convertStringToList = list(s)
    newList = map(changeTextFormat, convertStringToList)
    return "".join(newList)

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)