package Unit2;
import java.net.*;
public class Ipaddress {
    public static void main(String args[]) throws UnknownHostException {
        try {
            InetAddress add = InetAddress.getLocalHost();
            String ipAddress = add.getHostAddress();
            System.out.println("ip address:" + ipAddress);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
