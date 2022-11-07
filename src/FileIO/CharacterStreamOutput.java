package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStreamOutput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\HP\\Documents\\coding\\java-coding\\udemy-java-class\\out\\input.txt");
            out = new FileOutputStream("C:\\Users\\HP\\Documents\\coding\\java-coding\\udemy-java-class\\out\\input.txt");
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write((char) i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (in != null) {
                out.close();
            }

        }
    }
}