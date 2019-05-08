package homework_03;

import java.io.File;
import java.io.FileNotFoundException;

public class TestTokenizer {

    public static void main(String[] args) throws FileNotFoundException {

        File dataFile = new File("test.txt");
        System.out.println(dataFile.exists());

        Tokenizer tz = new Tokenizer("test.txt");
        tz.printWords();

    }

}