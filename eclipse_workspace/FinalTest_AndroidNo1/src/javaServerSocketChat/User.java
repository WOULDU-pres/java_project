package javaServerSocketChat;

import java.io.*;
import java.net.*;
import java.util.*;

public class User {

	HashMap<String, DataOutputStream> clientmap = new HashMap<String, DataOutputStream>();
	// clientmap�� String���� key�� DataOutputStream ���� Value(��)�� ����

	public synchronized void AddClient(String name, Socket socket) {
		try {
			sendMsg(name + " ���� �����ϼ̽��ϴ�.", "Server"); // server�� ���� �޼��� ����
			clientmap.put(name, new DataOutputStream(socket.getOutputStream()));
			// HashMap�� put(key, value)�Լ��� key�� value�� �޴´� 
			
			System.out.println("ä�� ���� �ο� : " + clientmap.size());
		} catch (Exception e) {

		}
	}
	
	public synchronized void RemoveClient(String name) {
		try {
			clientmap.remove(name); // name value�� ������ client ����
			sendMsg(name + " ���� �����Ͽ����ϴ�.", "Server");
			System.out.println("ä�� ���� �ο� : " + clientmap.size());
		}catch(Exception e) {
			
		}
	}

	public synchronized void sendMsg(String msg, String name) throws Exception {
		Iterator iterator = clientmap.keySet().iterator(); // clientmap�� key ������ �о�ɴϴ�.
		while (iterator.hasNext()) { // key ���� next�� �����Ѵٸ� ��� ����
			String clientname = (String) iterator.next();  // ä���� �Է��� ���� �̸��� �޾ƿͼ�
			clientmap.get(clientname).writeUTF(name + " : " + msg); // ��Ĵ�� ä���� ����մϴ�.
		}
	}
}