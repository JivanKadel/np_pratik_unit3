//Write a program to download a HTML Page
import java.io.*;
import java.net.*;

public class Lab2 {
    public static void main(String[] args) throws Exception{
        String page = "index.html";
        try{
            URL url= new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(page));
            String line;
            while ((line= reader.readLine())!=null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Page Download Successfully "+ page);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
