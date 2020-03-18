package encryptdecrypt;

import java.io.*;

import static encryptdecrypt.shift.Decryption;
import static encryptdecrypt.shift.Encryption;
import static encryptdecrypt.unicode.*;

public class main {


    public static void main(String[] args) throws IOException {
        String mode = "enc";
        int key = 0;
        String data = "";
        String in="";
        String out="";
        String res="";
        String alg="shift";
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-mode")) {
                mode = args[i+1];

            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i+1]);

            } else if (args[i].equals("-data")) {
                data = args[i+1];
            }
            else if (args[i].equals("-in")) {
                in=args[i+1];
            }
            else if(args[i].equals("-out")) {
                out=args[i+1];
            }
            else if(args[i].equals("-alg")) {
                alg=args[i+1];
            }
        }

        if(data.equals("")){
            BufferedReader input = new BufferedReader(new FileReader(in));
            String temp="";
            while ((temp = input.readLine()) != null)
            {
                data+=temp;
                // System.out.println (data);
            }
            input.close();
        }
        switch (alg) {
            case "unicode":
                    switch (mode) {
                        case "enc":
                        res = getEncryption(data, key);
                        break;

                    case "dec":
                        res = getDecryption(data, key);
                        break;
            }
            break;
            case "shift":
                switch (mode) {
                    case "enc":
                        res = Encryption(data, key);
                        break;

                    case "dec":
                        res = Decryption(data, key);
                        break;

        }
            break;
        }
        if(out.equals("")){
            System.out.println(res);
        }
        else {
            BufferedWriter output= new BufferedWriter(new FileWriter("output.txt"));
            output.write(res);
            output.close();
        }

    }

}
