package mobileProgram_JavaNo1;

public class Phone {
	
	String name, tel;
	
	//생성자에서 초기화
	public Phone(String name, String tel) {
		//현재 객체에 대한 레퍼런스 this 사용
		this.name = name;
	    this.tel = tel;
	}
	
	// 첫번째 get메소드: getName
	public String getName() { 
		return name;
	}
	
	// 두번째 get메소드: getTel
	public String getTel() { 
		return tel;
	}
}


