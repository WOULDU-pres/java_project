package mobileProgram_JavaNo1;
//import���� ����Ͽ� java�� Scanner Ŭ������ �����´�.
import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		//Phone �迭�� ���� ���۷��� phone�� �����Ѵ�.
		//Phone phone[]; �� �� �־ ���� ����.
        Phone [] phone; 
        //2���� ���۷��� �迭�� �����Ѵ�.
        phone = new Phone[2];

        Scanner scanner = new Scanner(System.in);
        /*  �Ʒ��� ���� i�� ����� ���� ���´�.
            �ϳ��ϳ� int�� ����� �ʿ� ���� �̸� ���⼭ int i;�� �����ϰ� �����ϸ� �� ���ϴ�. */
        //�� �� phone.length�� �տ��� �������ش�� 2�̴�.
        for(int i=0; i<phone.length; i++) {
        	System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
        	// ���� ������ �Է¹��� ���ڿ��� �����ϴ� next() �޼ҵ带 ����Ѵ�.
            String name = scanner.next();
            String tel = scanner.next();
            //�迭�� ������ŭ i��° phone ���� ��ü�� �����Ѵ�.
            phone[i] = new Phone(name, tel);
        }
        
        //�迭�� ��� ��ü ���
        for(int i=0; i<phone.length; i++) {
        	System.out.print(phone[i].getName()+"�� ��ȣ "+phone[i].getTel()+"\n");
        }        
     scanner.close();
     }
}
