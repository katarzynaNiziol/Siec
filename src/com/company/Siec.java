package com.company;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Siec {

    public static void main(String[] args) throws Exception {
        URL u = new URL("http://google.com");
        URLConnection urlConnection = u.openConnection();

        long data = urlConnection.getDate();
        System.out.println(new Date(data));
        System.out.println(urlConnection.getContentType());
        System.out.println("*****");

        data = urlConnection.getExpiration();
        System.out.println(new Date(data));

        data = urlConnection.getLastModified();
        System.out.println(new Date(data));

        int Y = urlConnection.getContentLength();
        System.out.println(Y);
        System.out.println("*****");


        URL url = new URL("http://wielkanocnepalmy.pl");
        System.out.println("Protokół: " + url.getProtocol());
        System.out.println("Komputer: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Plik: " + url.getFile());
        System.out.println("Całość: " + url.toExternalForm());
        System.out.println("*****");

        InetAddress adres = InetAddress.getLocalHost();
        System.out.println(adres);

        adres = InetAddress.getByName("onet.pl");
        System.out.println(adres);

//      InetAddress adresy[] = InetAddress.getAllByName("wielkanocnepalmy.pl");
//     for (int x = 0; x < adresy.length; x++) {
//    System.out.println(adresy[x]);

        InetAddress adresy[] = InetAddress.getAllByName("redtube.com");
        for (int x = 0; x < adresy.length; x++) {
            System.out.println(adresy[x]);

            adres = InetAddress.getLoopbackAddress();
            System.out.println(adres);
        }
    }

}
