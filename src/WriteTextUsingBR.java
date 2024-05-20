import java.io.*;
public class WriteTextUsingBR {
    public static void main(String[] args) throws IOException {
        File f = new File("Br.txt");
        f.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("Hello World");
        bw.write("\nHello Nurse");
        bw.close();
        System.out.println("Data pushed");
    }
}
