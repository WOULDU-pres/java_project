package javaServerSocketChat;

import java.io.*;

/*
 * extends Thread, implements Runnable�� ������ ������ ���� ����մϴ�.
 * extends Thread�� Thread�� ��ӹް� ��äȭ�� �ڿ� ��ü��.start()�� ���� ����ϸ�,
 * implements Runnable�� Thread ��ü �ȿ� �����带 ����Ϸ��� ��ü�� �־��༭ ��üȭ�� �� ����մϴ�.
 * extends Thread�� implements Runnable�� ����մϴ�.
 * ������ implements Runnable�� ����ϸ� ���� ����� �����մϴ�.
 */
public class Send implements Runnable{
	DataOutputStream out;
	
	/*
	 * Send Ŭ���������� in2�� ä�� ������ �޾ƿ��� ������ �մϴ�.
	 */
	BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));

	
	public Send(DataOutputStream out) {
		this.out = out;
	}
	
	public void run() {
		while(true) {
			try {
				String msg = in2.readLine(); // �޼����� �޾ƿ���
				out.writeUTF(msg); // msg ���
			}catch(Exception e) {
				
			}
		}
	}
}