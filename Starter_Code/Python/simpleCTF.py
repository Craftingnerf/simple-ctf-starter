
# I'm forcing specific types 
# the hexStr must be a string/str type
# and the function must return a bytes object
def convertHex(hexStr : str) -> bytes:
    return bytes.fromhex(hexStr)