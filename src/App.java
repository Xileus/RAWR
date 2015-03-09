/**
 * Created by Xileus on 9/03/2015.
 */
public class App {
    public static void main(String[] args) {
        String text = "This is a simple test\nOneTwoThree\nHello world!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}