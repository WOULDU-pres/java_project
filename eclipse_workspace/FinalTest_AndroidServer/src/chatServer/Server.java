package chatServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static ArrayList<PrintWriter> OutputList;
    public static void main(String[] args){
    	OutputList = new ArrayList<PrintWriter>();
        try{ServerSocket s = new ServerSocket(9999); // 서버 포트로 소켓을 연다
            while(true){
                Socket cs = s.accept();
                ClientManagerThread c = new ClientManagerThread();
                c.setSocket(cs);
                OutputList.add(new PrintWriter(cs.getOutputStream()));
                System.out.println(OutputList.size());
                c.start();
            }
        }catch(IOException ioe){ioe.printStackTrace();
        }}
}
