package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String args[]) throws Exception {

        DatagramSocket dsocket = new DatagramSocket(1234);
        byte[] buf = new byte[1024];

        /* created a byte array of length 1024 which is used to stored data

         */

        DatagramPacket dppacket = new DatagramPacket(buf, 1024);
        /* buf(size 1024) use to store incoming datagrams

         */

        dsocket.receive(dppacket);
        /* receive method is called on the datagram socket to wait for incoming datagram, when arrived stored in buf

         */

        String str = new String(dppacket.getData(), 0, dppacket.getLength());
        /* getData-> called dppacket from the received datagram and store in str variable

         */

        System.out.println(str);
        dsocket.close();
    }
}
