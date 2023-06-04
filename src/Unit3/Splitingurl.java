package Unit3;
import java.net.*;
public class Splitingurl {
    public static  void main(String args[])
    {
        try{
            URL obj=new URL("https://www.example.com:443/anything/thispage.html/?param1=value1#here");
            System.out.println("protocal:"+obj.getProtocol());
            System.out.println("host:"+obj.getHost());
            System.out.println("authority:"+obj.getAuthority());
            System.out.println("port:"+obj.getPort());
    }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
