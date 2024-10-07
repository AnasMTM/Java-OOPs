import java.util.ArrayList;
import java.util.StringTokenizer;

public class LW2Q5 {
    public static void main(String[] args) {
        String sentence = "A man, a plan, a canal, Panama!";

        //remove punctuation
        sentence = sentence.replaceAll("\\p{Punct}", "");

        //creating StringTokenizer
        StringTokenizer words = new StringTokenizer(sentence," ");

        //variable for separate the letters
        String word;
        ArrayList<String> letters = new ArrayList<>();

        //declaring letter to array
        while (words.hasMoreTokens()){
            word = words.nextToken().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                letters.add(String.valueOf(word.charAt(i)));
            }
        }

        // variable for output
        String palindromes = "";

        // for loop for check sentence is palindromes or not
        for (int i = 0; i < letters.size(); i++){
            if (!(letters.get(i).equals(letters.get(letters.size() - (i + 1))))) {
                palindromes = "This sentence is not palindromes";
                break;
            }else {
                palindromes = "This sentence is palindromes";
            }
        }

        //output
        System.out.println(palindromes);
    }
}
