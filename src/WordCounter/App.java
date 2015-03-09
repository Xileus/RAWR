package WordCounter;

/**
 * Created by Xileus on 9/03/2015.
 */
public class App {
    public static void main(String[] args) {
        String text = TextReader.load("simplr.txt");
        System.out.println(text);
    }
}
