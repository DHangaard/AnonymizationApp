import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    // ---------- Methods ----------
    public static ArrayList<String> readFile(String path) {

        ArrayList<String> text = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                text.add(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return text;
    }
}
