package treeSet;
//import ���� ���� java.util ��Ű���� ��� Ŭ���� ����
import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		treeSet.stream().forEach(s -> System.out.println(s.id + ":" + s.score));
		
		Student student = treeSet.last();
		System.out.println("�ְ� ���� : " + student.score);
		System.out.println("�ְ� ������ ���� ���̵� : " + student.id);
	}
}
