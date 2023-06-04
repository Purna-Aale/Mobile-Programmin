package Unit3;
//importing packages
import java.net.*;
import java.io.*;
public class Urlconnectretrive {
    public static  void main(String args[]) throws Exception
    {
        URL url=new URL("http://www.example.com");
        URLConnection connection= url.openConnection();
        /*Urlconnection object created named connection by using oen connection methods*/
        InputStream stream= connection.getInputStream();
        /*retrive an inputstream from the connection using the getUnput Steam()*/
        BufferedReader reader=new BufferedReader(new InputStreamReader(stream));
        /*created Bufferedreader object "reader"->to  read data from the input stream*/

        String line;/*declare aa veriable name line of the Stirng*/
        while((line=reader.readLine())!=null)
        {
            System.out.println(line);
        }
        reader.close();
       /* close buffered reader*/
    }

}
