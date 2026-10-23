
public class main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            simpleCTF ctf = new simpleCTF(args[i]);
            Byte[] arry = ctf.getByteArray();
            for (int j = 0; j < arry.length; j++) {
                System.out.print(arry[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
