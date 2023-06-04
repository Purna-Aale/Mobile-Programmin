package unit5;
// important 5 marks question
import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class HTTPheaderfield {
    public static void main(String args[]) throws  IOException
    {
        URL url=new URL("https://southwestern.edu.np/bca/");
        URLConnection uc=url.openConnection();
        System.out.println("content type:"+uc.getContentType());

        System.out.println("content encoding:"+uc.getContentEncoding());
        System.out.println("content length:"+uc.getContentLength());
        System.out.println("content expired:"+uc.getExpiration());

        long timestamp = uc.getDate(); // Unix timestamp in milliseconds
        Date date = new Date(timestamp); // create a new Date object from the timestamp
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // create a SimpleDateFormat object
        String actualTime = sdf.format(date); // format the date as a string
        System.out.println("current date: "+actualTime); // output the actual time

        long timestamp1 = uc.getLastModified();
        Date date1 = new Date(timestamp1);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String actualTime1 = sdf1.format(date1);
        System.out.println("lastmodifieddate: "+actualTime1);

    }
}
