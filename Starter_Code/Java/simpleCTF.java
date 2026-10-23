public class simpleCTF {
    private String hexStr;
    private Byte[] byteArry;
    public simpleCTF(String hex) {
        this.hexStr = hex;
        byteArry = new Byte[hexStr.length() / 2];
        for (int i = 0; i < byteArry.length; i++) {
            int index = i * 2;
            byteArry[i] = (byte)(Integer.parseInt(hexStr.substring(index, index+2), 16));
        }
    }
    public String getHexString() { return hexStr; }
    public Byte[] getByteArray() { return byteArry.clone(); }
}