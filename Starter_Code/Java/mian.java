
public class mian {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            SimpleCTF ctf = new SimpleCTF(args[i]);
            
            System.out.print("Hex Str: ");
            System.out.println(ctf.getHexString());
            System.out.print("ASCII: ");
            System.out.println(ctf.getASCII());
            byte[] bytes = ctf.getByteArray();
            System.out.print("Bytes: ");
            for (int j = 0; j < bytes.length; j++) {
                if (j != 0)
                    System.out.print(" ");
                // forces the printout to ignore negative numbers
                // as far as we are concerned its unsigned
                System.out.print(bytes[j] & 0xFF); 
            }
            // bytes newline
            System.out.println();
        }
    }
}
