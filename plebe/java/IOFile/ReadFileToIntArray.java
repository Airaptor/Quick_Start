import java.util.*;
import java.io.*;

public class ReadFileToIntArray{

     public static void main(String []args){

        try
            String text = new Scanner( new File("filePath.txt") ).useDelimiter("\\A").next(); //Get the File
            String[] fileInputWithOnlyNumbers = text.replaceAll("[a-zA-Z]", "").replaceAll("\\s"," ").split(" "); //From the file only extract number strings

            int[] inputNumberArray = new int[fileInputWithOnlyNumbers.length]; //Integer Array
            
            for(int i = 0; i < fileInputWithOnlyNumbers.length; i++){
                if(fileInputWithOnlyNumbers[i].matches("^(?!0*(\\.0+)?$)(\\d+|\\d*\\.\\d+)$")){ // if the number does not equal 0
                    inputNumberArray[i] = Integer.parseInt(fileInputWithOnlyNumbers[i]); // put all the numbers into the int array
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
     }
}
