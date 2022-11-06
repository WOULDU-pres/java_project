package java6_3;

public class StudentTest {

	public static void main(String[] args) {
		Student studentPekora = new Student();
		studentPekora.setStudentName("Pekora");
		System.out.println(Student.serialNum);
		System.out.println(studentPekora.studentName +studentPekora.studentID);
		
		Student studentMarine = new Student();
		studentMarine.setStudentName("Marine");
		System.out.println(Student.serialNum);
		System.out.println(studentMarine.studentName +studentMarine.studentID);
		
		
	}

}
