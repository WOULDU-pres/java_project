package mobileProgram_JavaNo2;
//����ڰ� ���� ���ϴ� ���ܸ� �����Ѵ�.
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {} //�⺻ ������
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
