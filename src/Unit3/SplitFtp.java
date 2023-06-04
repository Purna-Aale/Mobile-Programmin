package Unit3;
import java.net.*;
public class SplitFtp {
    public static  void main(String args[])
    {
        try{
            URL obj=new URL("ftp://mp3:secret@ftpexample.com:21");
            System.out.println("protocal:"+obj.getProtocol());
            System.out.println("host:"+obj.getHost());
            System.out.println("user:"+obj.getUserInfo());
            System.out.println("authority:"+obj.getAuthority());
            System.out.println("port:"+obj.getPort());
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
