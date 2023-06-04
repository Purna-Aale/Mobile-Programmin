package Unit2;
import java.net.*;
public class MyAddress {
    //important question for exam
    public static void main(String args[]) throws UnknownHostException {
        try {
            //implementing the try catch methods
            InetAddress add = InetAddress.getLocalHost();
            //printing the host ip address by usng getLocalAddress
            String hostAddress = add.getHostAddress();
            System.out.println("hostadress:"+hostAddress);
            //print host name buy using getHostName
            String hostname = add.getHostName();
            System.out.println("hostname:" + hostname);


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
