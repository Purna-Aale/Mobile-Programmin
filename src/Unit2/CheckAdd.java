package Unit2;
import java.net.*;
public class CheckAdd {
    public  static  void main(String args[]) throws  UnknownHostException {

        InetAddress obj1 = InetAddress.getByName("www.southwestern.edu.np");//inatialize the host name
        InetAddress obj2 = InetAddress.getByName("southwestern.edu.np");
        boolean x=obj1.equals(obj2);//using boolean methods to comperaing the object1 and object2
        System.out.println("both host  are equals:"+x);// printinf the results

    }

}
