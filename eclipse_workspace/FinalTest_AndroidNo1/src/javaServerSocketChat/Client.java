package javaServerSocketChat;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		DataInputStream in = null; // �� ������ ����ڰ� �Է��ϴ� ä�� �κп� �ش�˴ϴ�.
		BufferedReader in2 = null; // �� ������ ������� �г��ӿ� �ش�˴ϴ�
		
		DataOutputStream out = null; // �� ������ ����ڰ� �Է��� �����͸� ����� �� ����մϴ�.
		
		try {
			InetAddress ia = null; // Local Host IP Address �������� ���� ����
			ia = InetAddress.getLocalHost(); // ���� PC�� IP Address ��������
			socket = new Socket(ia, 4444); // client�� IP�� port ��ȣ �Է�
			
			/*
			 * DataInputStream�� �Է� ��Ʈ���� �޴� �Ű������̸�,
			 * socket.getInputStream()�Լ��� ���� ���Ͽ��� ���޵Ǵ� ������ ��Ʈ���� �о�ɴϴ�.
			 * BufferedReader�� Scanner�� ����� �����Դϴ�.
			 * Scanner���� �����ٴ� ������ ������ String������ ���ۿ� �����ϱ� ������
			 * ���� �����͸� �����ؼ� ����ؾ��ϴ� ��찡 �����ϴ�.
			 */
			in = new DataInputStream(socket.getInputStream());
			in2 = new BufferedReader(new InputStreamReader(System.in));
			out = new DataOutputStream(socket.getOutputStream());
			
			System.out.print("�г����� �Է����ּ��� : ");
			String data = in2.readLine(); // ä�ÿ� ����� �г����� �޾ƿɴϴ�.
			
			out.writeUTF(data); // �г����� UTF-8�� ���� �� ��½�Ʈ���� �ֽ��ϴ�.
			Thread th = new Thread(new Send(out)); // ���ο� �����忡 out�� ����ֵ��� �մϴ�.
			th.start(); // ������ ����
		}catch(IOException e) {
			
		}
		
		try {
			/*
			 * �������� �������� ��� ä���� �Է¹ޱ� ������
			 * ���ѷ���(while)�ȿ��� �����մϴ�.
			 * ���� ���� �ʹٸ� break�� ���� ���ǹ��� �ɸ� �˴ϴ�.
			 */
			while(true) {
				String str2 = in.readUTF();
				System.out.println(str2);
			}
		}catch(IOException e) {
			
		}
	}
}