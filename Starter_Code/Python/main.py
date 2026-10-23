import sys
from simpleCTF import convertHex
for arg in sys.argv[1:]:
    hex = convertHex(arg)
    for i in range(len(hex)):
        print(hex[i], end=" ")
    print()