package Client;
import java.net.*;
import java.io.*;

public class ClientConnection {
        public static void main(String[] args) throws Exception {
        try {
            Socket s = new Socket("localhos t", 8080);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            /*initilize two empty string str and str2*/
            while(!str.equals("stop"))/*if str is not equal to "stop", loop continues*/
            {
                System.out.println("enter the message:");
                str=reader.readLine();/*read the message that user has entered and store into "str" variable*/
                dout.writeUTF(str);/*send the message stored in "str" variable to server through dout*/
                dout.flush();/*flush the remaining data*/

                /*wait for server reply*/
                System.out.println("waiting for server reply....");
                str2=din.readUTF();/*read the message sent by the server through the input stream din and store it to the "str2" variable*/
                System.out.println("Server says: "+str2);/*print the message sent by the server*/

            }
            din.close();
            s.close();

        } catch (IOException e) {
            System.err.println(e);

        }
    }
}

