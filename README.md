# simple-ctf-starter
Small CTF repo with starter code primarially to convert hex strings to bytes and back to hex or ASCII.

There are currently 4 flags.\
They are saved as a Hex String, so I included starter code in `Starter_Code/<Python/Java>` to help with conversions. See [below](#StarterCode) for relevant documentation.\
- [ASCII](#ASCII)
- [Caesar Cipher](#Caesar)
- [XOR or XNOR](#XOR)
- [Rolling XOR](#RollingXOR)

Each flag follows the same formula `simple_ctf{...}`.\
The space inside the `{ }` is where the flags differ.

# Common terms

- ciphertext
  - Refers to information that has been encoded
- plaintext
  - Text that has not been encoded/encrypted
- ASCII
  - A character encoding standard (i.e. `'s' == 115`)
- XOR
  - A bitwise operation (operates at the bit level) which is symmetrical ( A XOR B XOR B == A)
  - See its truth table [below](#XORTruthTable)

<a name="XORTruthTable"></a>
**XOR Truth table**

A = input A\
B = input B\
O = Output

| A | B | O |
|---|---|---|
| 0 | 0 | 0 |
| 1 | 0 | 1 |
| 0 | 1 | 1 |
| 1 | 1 | 0 |

<a name="StarterCode"></a>
# Starter code 
<details>
  <Summary>Python</Summary>
  
  I've written two functions to handle the main conversions.

  ```Python
  # Reads in the hex string and returns a bytes object (its an array)
  def readHexStr(hexStr : str) -> bytes:
  # converts a bytes object to a ASCII string
  def bytesToASCII(hex : bytes) -> str: 

  # if you dont already know
  # this is typed enforced python
  def funcName(arg : Arg_Type) -> Function_Return_Type:
  ```
  
</details>

<details>
  <Summary>Java</Summary>
  
  I've written a class to help convert the types so you can focus on the challenges.\
  Here is the UML for the class
  ```mermaid
  classDiagram
    class SimpleCTF {
      SimpleCTF(String hexString)
      SimpleCTF(byte[] byteArry)

      String getHexString()
      byte[] getByteArray()
      String getASCII()
    }
  ```
  This class handles all the conversions that you'll need to perform.\
  It has two constructors so you can pass in either the hex string or a byte array.\
  Keep that in mind when working on the challenges.
</details>


# ASCII
<a name="ASCII"></a>

The flag is hex encoded

Flag `73696d706c655f6374667b434834524143543352535f3452335f4e554d383352537d`

<details>
  <Summary>Hint 1</Summary>
  
  Try using the helper functions/class to convert the flag from a hex string or bytes to a ASCII.
</details>
<details>
  <Summary>Hint 2</Summary>
  
  **Python**

  Use the `readHexStr` function to read the flag to bytes, and then use the `bytesToASCII` function to convert the bytes to ASCII.

  **Java**

  Construct a `SimpleCTF` object (`new SimpleCTF(hexFlag)`) and use it to convert the hex string to ASCII (`ctfObject.getASCII()`).
</details>

# Caesar Cipher
<a name="Caesar"></a>

The flag has been offset by some number.\
Thankfully, that number doesn't change!\
Knowing the flag format will help!

Flag `796f7376726b65697a6c8149394759365865494f564e4b58654f5965595b48595a4f5a5b5a4f555483`

<details>
  <Summary>Hint 1</Summary>
  
  You can find the offset by subtracting the first byte of the ciphertext with `s`, or its ASCII value of `115`, as its the first character in the flag format.
  
  **Python**
  
  You can convert characters to ASCII using `ord(char)` and convert ASCII numbers to characters through `chr(num)`

  **Java**

  You can convert characters to numbers via casting i.e. `(byte)'s'`

</details>
<details>
  <Summary>Hint 2</Summary>
  
  **Python**

  You'll need to use a different array to store the updated bytes and then convert it back using `bytes(array)`.

  **Java**

  You'll likely need to cast the resulting value back to bytes, and you may need to `%` by `256` or `&` by `0xFF` to properly wrap it around.\
  `%` is the modulo operator. I would describe it as the remainder from long devision. `%` by `256` will return a range of `0-255`.\
  `&` is bitwise AND, it allows you to filter what bits you see in the resulting value. `&` by `0xFF` will only keep the first byte of the number.\

</details>


# XOR or XNOR
<a name="XOR"></a>

Someone took the flag and XOR'd it with a random number!\
Thankfully XOR is a symmetrical operation. Try XOR-ing the flag with a known character.

Flag `62787c617d744e7265776a4921434e58424e5f2250456c`

<details>
  <Summary>Hint</Summary>

   You can XOR the first character of the flag with `s`, or its ASCII value of `115`, as its the first character in the flag format.\
   The resulting value will be the value used in the XOR operation.

   **NOTE**
   This challenge has nothing to do with XNOR
</details>

# Rolling XOR
<a name="RollingXOR"></a>

I've hidden this flag using XOR in a way you'll never guess!

Flag `731a77076b0e513246205b0232672b673876451356045b083b7e21753d74413c`

<details>
  <Summary>Hint</Summary>

  Each byte has been XOR'd with the ciphertext byte before it, excluding the first character, which has been left alone.
</details>