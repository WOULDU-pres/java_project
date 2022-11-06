package mobileProgram_JavaNo1;
//import문을 사용하여 java의 Scanner 클래스를 가져온다.
import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		//Phone 배열에 대한 레퍼런스 phone을 선언한다.
		//Phone phone[]; 로 써 주어도 문제 없다.
        Phone [] phone; 
        //2개의 레퍼런스 배열을 생성한다.
        phone = new Phone[2];

        Scanner scanner = new Scanner(System.in);
        /*  아래로 변수 i가 상당히 많이 나온다.
            하나하나 int를 사용할 필요 없이 미리 여기서 int i;를 선언하고 시작하면 더 편리하다. */
        //이 때 phone.length는 앞에서 설정해준대로 2이다.
        for(int i=0; i<phone.length; i++) {
        	System.out.print("이름과 전화번호 입력 >>");
        	// 공백 전까지 입력받은 문자열을 리턴하는 next() 메소드를 사용한다.
            String name = scanner.next();
            String tel = scanner.next();
            //배열의 개수만큼 i번째 phone 원소 객체를 생성한다.
            phone[i] = new Phone(name, tel);
        }
        
        //배열의 모든 객체 출력
        for(int i=0; i<phone.length; i++) {
        	System.out.print(phone[i].getName()+"의 번호 "+phone[i].getTel()+"\n");
        }        
     scanner.close();
     }
}
