package unit5;

import java.io.IOException;
import java.net.URLConnection;
public class MIME {
    public static void main(String args[]) throws IOException
    {
        String filename="example.mp4";
        String contentType=URLConnection.guessContentTypeFromName(filename);
        System.out.println("file type: "+contentType);

    }
}
