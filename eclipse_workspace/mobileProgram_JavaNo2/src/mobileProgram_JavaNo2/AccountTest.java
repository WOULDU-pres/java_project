package mobileProgram_JavaNo2;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�� ���� ����(��ü����)
		Account account = new Account();
		
		//������ �ݾ��� �Է¹޴� ���� withdrawMoney ����
		int withdrawMoney;
		
		//���� ���� �ܰ� 10000������ �����Ѵ�.
		account.setBalance(10000);
		//���� ���� �ܰ� ����Ѵ�.(10000��)
		System.out.println("����� ���� �ܰ�� " + account.getBalance()+"���Դϴ�.");
		
		System.out.println("������ �ݾ��� : ");
		//����ڷκ��� ������ �ݾ��� ���������� �Է¹޾� withdrawMoney�� ����
		withdrawMoney = scanner.nextInt();
		
		//������ �õ��� �� ���ܰ� �߻��� �� �ֱ� ������ try���� ����Ѵ�.
		try {
			account.withdraw(withdrawMoney);
		} catch(BalanceInsufficientException e) {
			// 3) e.printStackTrace()�� ȣ�� ���� ��
			e.printStackTrace();
		} finally {scanner.close();}
		//������ ������ �����ܰ� ����Ѵ�.
		System.out.println("����� ���� �ܰ�� " + account.getBalance()+"���Դϴ�.");
	}
}
