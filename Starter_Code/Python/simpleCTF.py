
# I'm forcing specific types 
# the hexStr must be a string/str type
# and the function must return a bytes object
def readHexStr(hexStr : str) -> bytes:
    return bytes.fromhex(hexStr)
def bytesToASCII(hex : bytes) -> str:
    return hex.decode("utf-8")