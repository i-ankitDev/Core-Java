import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        File file = new File("Array_List.txt");
//        try{
//            file.createNewFile();
//            System.out.println("File Created");
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//        try{
//            FileWriter fileWriter = new FileWriter("Array_List.txt");
//            fileWriter.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
//            fileWriter.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                sc.close();
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }


    }
}
