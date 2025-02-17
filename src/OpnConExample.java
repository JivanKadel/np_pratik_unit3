import java.net.*;
import java.io.*;

public class OpnConExample {
    public static void main(String[] args) throws Exception{
        StringBuilder content = new StringBuilder();
        try{
            URL u = new URL("https://www.example.com");
            URLConnection uc = u.openConnection();
            InputStream in = uc.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                content.append(line+ "\n");

            }
            System.out.println(content);
            bufferedReader.close();
            in.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
