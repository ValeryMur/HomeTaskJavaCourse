package homeTask4Massiv;

/**
 * Created by ASUS PC on 09.10.2016.
 */
public class Task89 {
    public static void main(String[] args) {
        char[] rusChars = {'Р','Т','И','П','В','Е' };
        char[] engChars = {'R','T','I','P','V','E'};

        char[] word = {'P','R','I','V','E','T'};

        for (int i=0;i<word.length;i++){
            for(int j=0;j<engChars.length;j++){
                if (word[i]==engChars[j]){
                    System.out.print(rusChars[j]);
                }
            }
        }
    }
}
