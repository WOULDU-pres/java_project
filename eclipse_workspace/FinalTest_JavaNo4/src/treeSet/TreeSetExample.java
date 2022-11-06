package treeSet;
//import 문을 통해 java.util 패키지의 모든 클래스 포함
import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		treeSet.stream().forEach(s -> System.out.println(s.id + ":" + s.score));
		
		Student student = treeSet.last();
		System.out.println("최고 점수 : " + student.score);
		System.out.println("최고 점수를 받은 아이디 : " + student.id);
	}
}
