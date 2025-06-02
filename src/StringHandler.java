import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringHandler {

    // Methods
    public ArrayList<String> replaceText(ArrayList<String> originalText, ArrayList<String> studentNames) {
        ArrayList<String> anonymizedText = new ArrayList<>();
        String anonAsFirst = "Den studerende";
        String anonNotAsFirst = "den studerende";

        // Iterate through original text
        for (String line : originalText) {

            // Iterate through studentNames
            for (String name : studentNames) {

                // Check if name is first word
                Pattern pattern = Pattern.compile("(^\\s*|[.:]\\s*)(" + name + "\\b)");
                Matcher matcher = pattern.matcher(line);

                // Replace if instance of name is first word on the line
                if (matcher.find()){
                    line = matcher.replaceFirst(matcher.group(1) + anonAsFirst);
                }

                // Replace other instances of name
                line = line.replaceAll("\\b" + name + "\\b", anonNotAsFirst);
            }

            // Add line to list
            anonymizedText.add(line);
        }

        return anonymizedText;
    }
}

