package hashMap;
//import ���� ���� java.util ��Ű���� ��� Ŭ���� ����
import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		// ����� ���α׷� ���� 3 �ڵ� �ۼ�
		
		// map�� ����ִ� ��� (key, value)�� ����
		// ��� key�� ���� Set �÷����� ����
		Set<String> keys = map.keySet();
		// Set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator�� ����
		Iterator<String> it = keys.iterator();
		
		//while���� ���� ��� �л��� ���� ���Ѵ�.
		while(it.hasNext()) {   
			String key = it.next();                      // ���� Key �л� �̸��� �����´�.
			int value = map.get(key);                    // ������ �л��� �̸����� HashMap �˻��� ���� ������ �˾Ƴ���.
			totalScore = totalScore + value;             // ������� ������ ���� ��� �л��� ������ ���Ѵ�.
			maxScore = (maxScore<value)? value:maxScore; // ���� �Է¹��� ���� ���� �ְ��������� ���ٸ� �ְ����� ����
			name = (maxScore <= map.get(key))? key:name; // �ְ������� �л��� �̸��� HashMap �˻��� ���� �����´�.
		}
		
		// ����� ���α׷� ���� 3 �ڵ� �ۼ�
		
		int avgScore = totalScore / map.size();
		System.out.println("��� ���� : " + avgScore);
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		System.out.println();
	}
}