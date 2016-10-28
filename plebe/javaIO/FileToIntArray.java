import java.util.*;
import java.io.*;

public class FileToIntArray{

     public static void main(String []args){
        
        try{
            String text = new Scanner( new File("textfile.txt") ).useDelimiter("\\A").next();
            System.out.println(text);
        } catch (FileNotFoundException e) {System.err.println("IndexOutOfBoundsException: " + e.getMessage());} 
    
    }
}
