def count_substring(string, sub_string):
    count = 0
    for i in range(0, len(string)):
        if (i + len(sub_string) > len(string)):
            break

        match = 0
        for y in range(0, len(sub_string)):
            if string[i + y] != sub_string[y]:
                break
            match += 1
        if (match == len(sub_string)):
            count += 1
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)