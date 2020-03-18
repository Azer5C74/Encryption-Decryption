package encryptdecrypt;
import org.jetbrains.annotations.NotNull;

import java.lang.Character.*;
public class shift {

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

public static String Encryption(String data,int key){
    String res="";
    for(char item :data.toCharArray()){
        if(java.lang.Character.isLowerCase(item)){
            int index=alphabet.indexOf(item);

            if(index+key>26){
                index=index+key-26;


            }
            else {
                index=index+key ;
            }
            res += alphabet.charAt(index);


        }
        else if(item==' '){
            res+=item ;
        }
        else {
            int index=ALPHABET.indexOf(item);
            if(index+key>26){
                index=index+key-26;
            }
            else {
                index=index+key ;
            }
            res+=ALPHABET.charAt(index);
        }
    }
        System.out.println(res);
    return res;
}

public static String Decryption(String data,int key){
    String res="";

    for(char item :data.toCharArray()){
        if(java.lang.Character.isLowerCase(item)){
            int index=alphabet.indexOf(item);
            System.out.println(item+": item"+"| index: "+index);
            if(index-key<0){
                index=index-key+26;

            }
            else {
                index=index-key ;
            }

            res+=alphabet.charAt(index);


        }
        else if(item==' '){
            res+=item ;
        }
        else {
            int index=ALPHABET.indexOf(item);
            if(index-key<1){
                index=index-key+26;
            }
            else {
                index=index-key ;

            }
            res+=ALPHABET.charAt(index);

        }
    }
    System.out.println(res);

    return res ;
}

}

