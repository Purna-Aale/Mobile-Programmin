package Unit6;
/*write a program to display socket information[address,port ,local address,local port ]-5 marks* imp question*/
import java.net.*;
import java.io.*;
public class Socketaddress {
    public static void main (String args[])
    {
        try {


            Socket obj = new Socket("www.southwestern.edu.np", 443);
            /*created a new socket object (toSocket) and connect to the www.example.com
            connected to a fixed host and port so doesn't need any command line argument*/
            System.out.println("connected to:"+obj.getInetAddress()+"\n"+
                    "on port :"+obj.getPort()+"\n"+
                    "form port:"+obj.getLocalPort()+"\n"+
                    "of:"+obj.getLocalAddress()
            );
        }catch(IOException e)
        {
            System.err.println(e);
        }

    }
}
