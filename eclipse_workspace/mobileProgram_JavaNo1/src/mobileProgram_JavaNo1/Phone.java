package mobileProgram_JavaNo1;

public class Phone {
	
	String name, tel;
	
	//�����ڿ��� �ʱ�ȭ
	public Phone(String name, String tel) {
		//���� ��ü�� ���� ���۷��� this ���
		this.name = name;
	    this.tel = tel;
	}
	
	// ù��° get�޼ҵ�: getName
	public String getName() { 
		return name;
	}
	
	// �ι�° get�޼ҵ�: getTel
	public String getTel() { 
		return tel;
	}
}


