package mobileProgram_JavaNo2;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//새 계좌 생성(객체생성)
		Account account = new Account();
		
		//인출할 금액을 입력받는 변수 withdrawMoney 선언
		int withdrawMoney;
		
		//현재 계좌 잔고를 10000원으로 설정한다.
		account.setBalance(10000);
		//현재 계좌 잔고를 출력한다.(10000원)
		System.out.println("당신의 계좌 잔고는 " + account.getBalance()+"원입니다.");
		
		System.out.println("인출할 금액은 : ");
		//사용자로부터 인출할 금액을 정수형으로 입력받아 withdrawMoney에 저장
		withdrawMoney = scanner.nextInt();
		
		//인출을 시도할 떄 예외가 발생할 수 있기 때문에 try문을 사용한다.
		try {
			account.withdraw(withdrawMoney);
		} catch(BalanceInsufficientException e) {
			// 3) e.printStackTrace()를 호출 했을 때
			e.printStackTrace();
		} finally {scanner.close();}
		//인출한 이후의 계좌잔고를 출력한다.
		System.out.println("당신의 계좌 잔고는 " + account.getBalance()+"원입니다.");
	}
}
