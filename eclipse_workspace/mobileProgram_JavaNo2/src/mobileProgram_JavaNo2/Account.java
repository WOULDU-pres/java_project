package mobileProgram_JavaNo2;

//����� ������ ���ܸ� ���� ����ϴ� ��

public class Account {
	
	//�ܰ� �����ϱ� ���� balance ���� ����
	private long balance;
	
	//getBalance �޼ҵ� ����	
	public long getBalance() {return balance;}
	//setBalance �޼ҵ� ����
	public void setBalance(long balance){
		this.balance = balance;
	}
	
	//���� ���� ���¿� ���ϴ� deposit(�Ա� �޼ҵ�)
	public void deposit(int money){	
		balance += money;	      
	}
	
	//���� ���� ���¿��� ���� withdraw �޼ҵ�(���� �޼ҵ�)
	//�̶� ���� �ܰ��� ���� ���� ������ �Ǹ� �ȵǱ� ������ ���ܸ� ������ش�.
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money){
	    throw new BalanceInsufficientException("�ܰ���� : " + (money-balance)+ "�� ���ڶ�");
	    }
	    balance -= money;
	}
}
//BalanceInsufficientException�� �������� �ʴ´� ����ڰ� ����� ����ؾ��Ѵ�.
