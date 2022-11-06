package treeSet;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	//Comparable 인터페이스의 compareTo() 메서드
	//인자로 넘어온 같은 타입의 다른 객체와 대소 비교해서, 객체를 정렬하기 위하여 사용한다.
	@Override
	public int compareTo(Student object) {
		//성적을 비교하여 새로 입력된 성적이 더 높다면 1(양수)을 반환한다.
		if(object.score < score) return 1;
		//성적을 비교하여 새로 입력된 성적과 같다면 0을 반환한다.
		else if(object.score == score) return 0;
		//성적을 비교하여 새로 입력된 성적이 더 낮다면 -1(음수)을 반환한다.
		else return -1;
		
	}
}