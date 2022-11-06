package printNameAge;

//Person Ŭ���� ����
class Person implements Comparable<Object> {
	//�̸��� ���̸� private ���·� ���� ����
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }    

	//Comparable �������̽��� compareTo() �޼���
	//���ڷ� �Ѿ�� ���� Ÿ���� �ٸ� ��ü�� ��� ���ؼ�, ��ü�� �����ϱ� ���Ͽ� ����Ѵ�.
    @Override
    public int compareTo(Object object) {
       Person person = (Person)object;
       return person.age - this.age;
    }
    
    @Override
    public String toString() {
        return name + " : " + age;
    }
}