package Server;
import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class     ServerConnection {
    public static  void main(String args[]) throws UnknownHostException {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            /*initilize two empty string str and str2*/
            while(!str.equals("stop"))/*if str iws not equal to "stop "loop continues*/
            {
                System.out.println("waiting for client reply....");
                str=din.readUTF(); /*read the manage sent by the client through the input stream din and store it to ht "str" variable*/
                System.out.println("Client:"+str);/*print can see what teh client sent*/

                /*time to reply to client*/
                System.out.println("enter the message:");/*prompt server user to enter a message to the client*/
                str2=reader.readLine();/*read the msg that server has entered and store into "str2"  variable*/
                dout.writeUTF(str2);/*send msg store in "str2" variable back to client through dout*/
                dout.flush();/*flush the remaining data*/
            }
            din.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            System.err.println(e);

        }
    }
}
