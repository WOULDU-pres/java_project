package chatServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {
    public static ArrayList<PrintWriter> OutputList;

    public static void main(String[] args){
        OutputList = new ArrayList<PrintWriter>();

        try{
            ServerSocket s_socket = new ServerSocket(9999);
            while(true){
                Socket c_socket = s_socket.accept();
                ClientManagerThread c_thread = new ClientManagerThread();
                c_thread.setSocket(c_socket);

                OutputList.add(new PrintWriter(c_socket.getOutputStream()));
                System.out.println(OutputList.size());
                c_thread.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}