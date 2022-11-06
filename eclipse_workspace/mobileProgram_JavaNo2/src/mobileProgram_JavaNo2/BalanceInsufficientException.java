package mobileProgram_JavaNo2;
//사용자가 직접 원하는 예외를 정의한다.
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {} //기본 생성자
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
