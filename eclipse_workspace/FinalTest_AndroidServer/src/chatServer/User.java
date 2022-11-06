package chatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class User extends Thread{
    private Socket s;
    @Override
    public void run(){
        super.run();
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String text;

            while(true){
                text = input.readLine();
                if(text!=null) {
                    for(int i=0;i<MyServer.OutputList.size();++i){
                        MyServer.OutputList.get(i).println(text);
                        MyServer.OutputList.get(i).flush();
                    }}
            }
        }catch(IOException ioe){ioe.printStackTrace();
        }
    }
    public void setSocket(Socket socket){
        s = socket;
    }
}