package mobileProgram_JavaNo2;

//사용자 임의의 예외를 만들어서 사용하는 법

public class Account {
	
	//잔고를 저장하기 위한 balance 변수 선언
	private long balance;
	
	//getBalance 메소드 선언	
	public long getBalance() {return balance;}
	//setBalance 메소드 선언
	public void setBalance(long balance){
		this.balance = balance;
	}
	
	//들어온 값을 계좌에 더하는 deposit(입금 메소드)
	public void deposit(int money){	
		balance += money;	      
	}
	
	//나간 값을 계좌에서 빼는 withdraw 메소드(인출 메소드)
	//이때 계좌 잔고보다 많은 돈이 나가게 되면 안되기 떄문에 예외를 만들어준다.
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money){
	    throw new BalanceInsufficientException("잔고부족 : " + (money-balance)+ "원 모자람");
	    }
	    balance -= money;
	}
}
//BalanceInsufficientException은 존재하지 않는다 사용자가 만들어 사용해야한다.
