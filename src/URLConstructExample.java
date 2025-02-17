import java.io.*;
import java.net.*;

public class URLConstructExample{
    public static void main(String[] args) throws IOException {
        try{

            URL u= new URL("https://example.com/");
    
            BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));

            String c;
            while ((c=in.readLine())!=null) {
                System.out.println(c);
               
            }
            in.close();
        }

        catch(IOException ex){
            System.err.println(ex);
        }
    }
}
