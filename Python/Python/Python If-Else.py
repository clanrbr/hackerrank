#!/bin/python

import math
import os
import random
import re
import sys

def isOdd(n):
  return n % 2 != 0

if __name__ == '__main__':
    n = int(raw_input().strip())
    if isOdd(n) :
      print('Weird')
    elif n >=2 and n<=5 :
      print('Not Weird')
    elif n>=6 and n<=20 :
      print('Weird')
    else:
      print('Not Weird')