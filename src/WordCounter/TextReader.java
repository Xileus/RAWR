package WordCounter;

/**
 * Created by Xileus on 9/03/2015.
 */
import java.io.*;
import java.util.Scanner;
public class TextReader {
    public static String load(String filename){
        try {
            Scanner scanner=new Scanner(new File(filename));
            StringBuilder builder=new StringBuilder();
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                builder.append(line+"\n");
            }
            return builder.toString().trim();
        } catch(IOException e){
            return "";
        }
    }

}
