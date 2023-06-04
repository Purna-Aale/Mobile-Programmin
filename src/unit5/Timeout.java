package unit5;
import java.net.URL;
import java.net.URLConnection;

public class Timeout {
    public static void main(String args[]) {
        try {
            URL u = new URL("http://www.example.com");
            URLConnection conn = u.openConnection();
            /*conn.setConnectTimeout(30000);
            conn.setReadTimeout(50000);*/

            System.out.println("content encoding:" + conn.getConnectTimeout());
            System.out.println("content encoding:" + conn.getReadTimeout());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
