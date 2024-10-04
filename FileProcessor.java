
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileProcessor {

    public static void main(String[] args) {

       
        try {
         
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            Scanner scan = new Scanner(fr);

            //print text file
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
               System.out.println(data);
            }           

            scan.close();

        } catch (FileNotFoundException e) {
           System.out.println("No file to read. ");
           e.printStackTrace();
        }
    
           
    }

   



}
