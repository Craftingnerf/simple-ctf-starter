import sys
from simpleCTF import readHexStr, bytesToASCII
for arg in sys.argv[1:]:
    hex = readHexStr(arg)
    print(f"Hex String : {arg}")
    print(f"Bytes array : ", end="")
    for ch in hex:
        print(ch, end= " ")
    print("") # hex newline
    try:
        print(f"ASCII : {bytesToASCII(hex)}")
    except:
        print("Error while converting to ASCII")