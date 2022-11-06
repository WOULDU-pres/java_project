package javaServerSocketChat;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

/*
 * extends Thread, implements Runnable�� ������ ������ ���� ����մϴ�.
 * extends Thread�� Thread�� ��ӹް� ��äȭ�� �ڿ� ��ü��.start()�� ���� ����ϸ�,
 * implements Runnable�� Thread ��ü �ȿ� �����带 ����Ϸ��� ��ü�� �־��༭ ��üȭ�� �� ����մϴ�.
 * extends Thread�� implements Runnable�� ����մϴ�.
 * ������ implements Runnable�� ����ϸ� ���� ����� �����մϴ�.
 */
public class Receiver implements Runnable {
	/*
	 * Java ������ ä�� ���� : https://lktprogrammer.tistory.com/64?category=672211
	 * DataInputStream ���� ���� : https://apphappy.tistory.com/69
	 * implements runnable ���� ���� : 
	 */
	Socket socket;
	DataInputStream in;
	String name;
	User user = new User();
	
	/*
	 * ������������ ���� �ʱ�ȭ�մϴ�.
	 * ���� user Ŭ������ AddClient�� ȣ���Ͽ� ����ڸ� ����մϴ�.
	 */
	public Receiver(User user, Socket socket) throws Exception // throws�� ���� ����� exception ������
	{
		this.user = user;
		this.socket = socket;
		in = new DataInputStream(socket.getInputStream());
		this.name = in.readUTF(); // UTF-8 �� ���ڵ� �� �о��
		user.AddClient(name, socket); // ����� ���
	}
	
	public void run() {
		try {
			while(true) {
				String msg = in.readUTF(); // in�� ���� �޼����� UTF-8 �� ���ڵ� �� �о��
				user.sendMsg(msg, name); // name �̸��� ���� user�� msg��� �޼����� ����
			}
		}catch(Exception e) {
			user.RemoveClient(this.name); // ���� �߻��� name ������ client���� ����
		}
	}
	
}