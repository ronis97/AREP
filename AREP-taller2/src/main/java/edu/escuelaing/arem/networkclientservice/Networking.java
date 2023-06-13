package edu.escuelaing.arem.networkclientservice;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class Networking 
{
    public static void main(String[] args){
        try{
            URL personalSite = new URL("https://github.com/ronis97/ARSWT3/blob/main/src/main/java/edu/escuelaing/arsw/networking/taller/URLLector.java");
            System.out.println("Protocol: " + personalSite.getProtocol());
            System.out.println("Authority: "+ personalSite.getAuthority());
            System.out.println("Host: "+ personalSite.getHost());
            System.out.println("Port: " +personalSite.getPort());
            System.out.println("Path: " +personalSite.getPath());
            System.out.println("Query: " +personalSite.getQuery());
            System.out.println("File: " +personalSite.getFile());
            System.out.println("Ref: " +personalSite.getRef());
        } catch (MalformedURLException e){

        }
    }
}
