import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final String path = "data/non_anon_text.txt";
        ArrayList<String> originalText = FileIO.readFile(path);

        ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Anders", "Katrine", "Joakim", "Stine"));

        StringHandler stringHandler = new StringHandler();
        ArrayList<String> anonymizedText = stringHandler.replaceText(originalText, studentNames);


        // Display original text
        for (String s : originalText){
            System.out.println(s);
        }


        System.out.println(); // Empty line


        // Display anonymized text
        for (String s : anonymizedText){
            System.out.println(s);
        }
    }
}
