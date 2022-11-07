package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterStreamInput {
    public static void main(String args[])throws FileNotFoundException, IOException {
        FileInputStream in = null;
        try{
            in = new FileInputStream("C:\\Users\\HP\\Documents\\coding\\java-coding\\udemy-java-class\\out\\input.txt");
            int i = 0;
            while((i = in.read()) != -1){
                System.out.print((char)i);
            }
        }finally {
            if (in != null){
                in.close();
            }
        }
    }
}
