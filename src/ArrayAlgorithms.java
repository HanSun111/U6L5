import java.util.Arrays;
public class ArrayAlgorithms {

    public static int longestString(String[] stringList) {
        int daLongest = 0;
        for(String veryLong : stringList){
            if(veryLong.length() > daLongest ){
                daLongest = veryLong.length();
            }
        }
        return daLongest;
    }
    public static void makeUppercase(String[] wordList)
    { /* implement this method! */
    for(int i = 0; i < wordList.length; i ++){
        wordList[i] = wordList[i].toUpperCase();
    }
    System.out.println(Arrays.toString(wordList));
    }

}