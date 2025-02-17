//Write a java program to spit different components of an URL

import java.net.*;

public class Lab1 {
    public static void main(String[] args) throws Exception{
        URL url1= new URL("https://www.example.com:8080/path/to/resource?key1=value1&key2=value2#section2");
        System.out.println(url1.toString());
        System.out.println();
        System.out.println("Different Components of the URL1-");
        System.out.println("Protocol:" +url1.getProtocol());
        System.out.println("Hostname:-"+url1.getHost());
        System.out.println("Default port: "+ url1.getDefaultPort());

        System.out.println("Query:"+url1.getQuery());

        System.out.println("Path:"+url1.getPath());

        System.out.println("File:"+url1.getFile());

        System.out.println("References:" +url1.getRef());
    }
}
