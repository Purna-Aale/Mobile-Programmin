package Unit2;
import java.net.*;
public class Hostname {
    public static void main(String args[]) throws UnknownHostException{
        String hostAddress = "182.50.64.100";

        try {
            InetAddress inetAddress = InetAddress.getByName(hostAddress);
            String hostName = inetAddress.getCanonicalHostName();

            System.out.println("Host Address: " + hostAddress);
            System.out.println("Host Name: " + hostName);
        } catch (UnknownHostException ex) {
            System.err.println("Could not retrieve host name for " + hostAddress);
            ex.printStackTrace();
        }
    }
}
