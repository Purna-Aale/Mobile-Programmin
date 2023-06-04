package unit5;
import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HttpHeader {
    public static void main(String args[]) {
        try {
            URL url = new URL("http://www.example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println("request method:" + conn.getRequestMethod());
            System.out.println("respose code:" + conn.getResponseCode());
            System.out.println("contetnt type:" + conn.getContentType());
            System.out.println("content length:" + conn.getContentLength());

            long timestamp1 = conn.getDate();
            Date date1 = new Date(timestamp1);
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String actualTime1 = sdf1.format(date1);
            System.out.println("Date: "+actualTime1);

            long timestamp = conn.getExpiration();
            Date date = new Date(timestamp1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String actualTime = sdf.format(date1);
            System.out.println("Expiration Date: "+actualTime);

            System.out.println("content encoding:" + conn.getContentEncoding());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
