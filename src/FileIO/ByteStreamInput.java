package FileIO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ByteStreamInput  {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("C:\\Users\\HP\\Documents\\coding\\java-coding\\udemy-java-class\\out\\input.txt");
            out = new FileWriter("C:\\Users\\HP\\Documents\\coding\\java-coding\\udemy-java-class\\out\\input.txt");
            int i = 0;
            while((i = in.read()) != -1){
                out.write((char)i);
            }
        } finally {
            if (in != null){
                in.close();
                out.close();
            }
        }
    }
}
