package UDP;
import java.net.*;
import java.io.*;

public class Sender {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket ds= new DatagramSocket();
        /* use to receive and send datagrams */
        String str ="HELLO MY WORLD"; /* str that contains message */

        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"),1234);

        /* getBytes -> call -> str -> that converts string to a byte array because
        DatagramPacket should accept msg in a form of byte.

        length -> call -> str-> no. of character in the string

        127.0.0.1 -> destination ip
        1234 -> destination port
         */

        ds.send(dp);
        ds.close();

    }


}
