package WordCounter;

/**
 * Created by Xileus on 9/03/2015.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter\n" +
                "\"simplr.txt\" has 5 \"words\"");
        int tally = CountWords("simplr");
        System.out.println("Actual number of \"words\" " + tally);

        System.out.println("Manual unit test of WordCounter\n" +
                "\"muliline.txt\" has 12 \"words\"");
        int tally2 = CountWords("muliline");
        System.out.println("Actual number of \"words\" " + tally2);
    }
    private static int CountWords(String string)

    {
        String text = TextReader.load(string +".txt");
        int tally = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' | text.charAt(i) == '\n') {
                tally++;
            }
        }
        return tally;
    }
}
