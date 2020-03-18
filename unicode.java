package encryptdecrypt;

public class unicode {
    public static String getDecryption(String data, int key) {
        String res="";
        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item - key);
            res+=shiftItem;
        }
        return res;
    }

    public static String getEncryption(String data, int key) {
        String res="";
        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item + key);
            res+=shiftItem;
        }
        return res ;
    }
}
