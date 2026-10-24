# simple-ctf-starter
Small CTF repo with starter code primarially to convert hex strings to bytes and back to hex or ASCII.

There are currently 4 flags.\
They are saved as a Hex String, so make sure to use the starter code to convert it to bytes
- [ASCII](#ASCII)
- [Caesar Cipher](#Caesar)
- [XOR or XNOR](#XOR)
- [Rolling XOR](#RollingXOR)

Each flag follows the same formula `simple_ctf{...}`.\
The space inside the `{}` is where the flags differ.

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
  
  ## Python

  Use the `readHexStr` function to read the flag to bytes, and then use the `bytesToASCII` function to convert the bytes to ASCII.

  ## Java

  Construct a `SimpleCTF` object (`new SimpleCTF(hexFlag)`) and use it to convert the hex string to ASCII (`ctfObject.getASCII()`).
</details>

# Caesar Cipher
<a name="Caesar"></a>

The flag has been offset by some number.\
Thankfully, that number doesn't change!\
Knowing the flag format will help!

Flag `796f7376726b65697a6c8149394759365865494f564e4b58654f5965595b4883`

<details>
  <Summary>Hint 1</Summary>
  
  You can find the offset by subtracting the first character of the flag with `s` as its the first character in the flag format.\

</details>
<details>
  <Summary>Hint 2</Summary>
  
  ## Python

  You'll need to use a seperate array to store the updated bytes and then convert it back using `bytes(array)`.

  ## Java

  You'll likely need to cast the resulting value back to bytes, and you may need to `%` by `255` or `0xFF` to properly wrap it around.

</details>


# XOR or XNOR
<a name="XOR"></a>

Someone took the flag and XOR'd it with a random number!\
Thankfully XOR is a symmetrical operation. try XORing the flag with a known character.

Flag `62787c617d744e7265776a4921434e58424e5f2250456c`

<details>
  <Summary>Hint 1</Summary>

   You can XOR the first character of the flag with `s` as its the first character in the flag format.\
   The resulting value will be the value used in the XOR operation.
</details>

# Rolling XOR
<a name="RollingXOR"></a>

I've hidden this flag using XOR in a way you'll never guess!

Flag `731a77076b0e513246205b0232672b673876451356045b083b7e21753d74413c`

<details>
  <Summary>Hint</Summary>

  Each character has been XOR'd with the byte before it, excluding the first character, which has been left alone
</details>