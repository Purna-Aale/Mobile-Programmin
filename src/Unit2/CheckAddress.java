package Unit2;
import java.net.*;
public class CheckAddress {
    public  static  void main(String args[])
    {
        try{
            InetAddress obj1= InetAddress.getByName("www.example.com");
            InetAddress obj2= InetAddress.getByName("example.com");

            if(obj1.equals(obj2))
            {
                System.out.println("both are same");
            }
            else{
                System.out.println("both are not  same");

            }
        }catch(UnknownHostException exp)

        {
            System.out.println("host lookup failed");
        }

    }

}
