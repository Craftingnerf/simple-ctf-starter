from simpleCTF import readHexStr, bytesToASCII

KEYS = ["73696d706c655f6374667b434834524143543352535f3452335f4e554d383352537d", "796f7376726b65697a6c8149394759365865494f564e4b58654f5965595b48595a4f5a5b5a4f555483", "62787c617d744e7265776a4921434e58424e5f2250456c", "731a77076b0e513246205b0232672b673876451356045b083b7e21753d74413c"]

for key in KEYS:
    hex = readHexStr(key)
    print(f"Hex String : {key}")
    print(f"Bytes array : ", end="")
    for ch in hex:
        print(ch, end= " ")
    print("") # hex newline
    try:
        print(f"ASCII : {bytesToASCII(hex)}")
    except:
        print("Error while converting to ASCII")