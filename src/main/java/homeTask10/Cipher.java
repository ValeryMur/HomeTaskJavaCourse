package homeTask10;

import java.util.Scanner;

/**
 * Created by ASUS PC on 31.10.2016.
 */
public class Cipher {
    public static char [] plainText = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ','1','2','3','4','5','6','7','8','9','0' };
    public static char [] chiperText = {'1','2','3','4','5','6','7','8','9','0',' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Put word: ");
        String yourWord = in.nextLine();
        String NewEncodeWord = encodeWord(yourWord);
        System.out.println("Encode:" + encodeWord(yourWord));
        System.out.println("Decode:" + decodeWord(NewEncodeWord));
    }

    public static String encodeWord(String word){
        char[] newWord = word.toCharArray();
        for (int i=0; i<newWord.length; i++){
            for (int j =0; j<plainText.length; j++){
                if (newWord[i] == plainText[j]){
                    newWord[i] = chiperText[j];
                    break;
                }
            }
        }
        return(new String (newWord));
    }

    public static String decodeWord(String word){
        char[] newWord = word.toCharArray();
        for (int i=0; i<newWord.length; i++){
            for (int j =0; j<chiperText.length; j++){
                if (newWord[i] == chiperText[j]){
                    newWord[i] = plainText[j];
                    break;
                }
            }
        }
        return(new String (newWord));
        //return(newWord.toString());
    }
}
