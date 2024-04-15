package VirtualPicnic;

import java.io.IOException;
import java.util.List;

public class Program {

    public static void main(String[] args) throws IOException {
        
        try {
            List<String> words = GetData.readTextFromFile("input.txt");   
            
            
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
    

}
