
public class mian {
    static final String[] keys = new String[] {
        "73696d706c655f6374667b434834524143543352535f3452335f4e554d383352537d", // ASCII
        "796f7376726b65697a6c8149394759365865494f564e4b58654f5965595b48595a4f5a5b5a4f555483", // Ceasar Cipher
        "62787c617d744e7265776a4921434e58424e5f2250456c", // XOR or XNOR
        "731a77076b0e513246205b0232672b673876451356045b083b7e21753d74413c" // Rolling XOR
    };
    public static void main(String[] args) {
        for (int i = 0; i < keys.length; i++) {
            SimpleCTF ctf = new SimpleCTF(keys[i]);
            
            System.out.print("Hex Str: ");
            System.out.println(ctf.getHexString());
            byte[] bytes = ctf.getByteArray();
            System.out.print("Bytes Array: ");
            for (int j = 0; j < bytes.length; j++) {
                if (j != 0)
                    System.out.print(" ");
                // forces the printout to ignore negative numbers
                // as far as we are concerned its unsigned
                System.out.print(bytes[j] & 0xFF); 
            }
            // bytes newline
            System.out.println();

            System.out.print("ASCII: ");
            System.out.println(ctf.getASCII());
        }
    }
}
