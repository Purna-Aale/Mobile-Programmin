package Unit6;
//write a program to find the port number running on your mechine(localhost)
import java.net.*;
import java.io.*;
import  java.net.Socket;
public class Portrunninglocalhost {
    public static void  main(String args[]) throws UnknownHostException
    {
            String host="localhost";
                for(int port=1024; port<=65535; port++) {
                    try {
                        Socket obj = new Socket(host, port);
                        System.out.print("there are " + port + "\n"+"running on the mechine");
                        obj.close();

                    } catch (IOException e) {

                    }
                }
    }

}
