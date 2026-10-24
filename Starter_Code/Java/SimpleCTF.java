import java.nio.charset.StandardCharsets;

public class SimpleCTF {
    private String hexStr;
    private byte[] byteArry;
    private String ascii;
    
    public SimpleCTF(String hex) {
        this.hexStr = new String(hex);
        this.byteArry = new byte[this.hexStr.length() / 2];
        for (int i = 0; i < this.byteArry.length; i++) {
            // 0-255 is two hex characters, so we need to convert the byte array index into the string index
            int index = i * 2;
            // parse two characters of the string (given the current string index) as hexadecimal (base 16)
            this.byteArry[i] = (byte)(Integer.parseUnsignedInt(this.hexStr.substring(index, index+2), 16));
        }
        this.ascii = new String(this.byteArry, StandardCharsets.UTF_8);
    }
    public SimpleCTF(byte[] bytes) {
        this.byteArry = bytes.clone();
        this.ascii = new String(this.byteArry, StandardCharsets.UTF_8);
        this.hexStr = "";
        // convert the bytes array to hex (should work)
        for (int i = 0; i < this.byteArry.length; i++)
            this.hexStr += Integer.toHexString(this.byteArry[i]);
    }

    public String getHexString() { return new String(this.hexStr); }
    public byte[] getByteArray() { return this.byteArry.clone(); }
    public String getASCII() { return new String(ascii); }
}