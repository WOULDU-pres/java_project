package java6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentPekora = new Student("Pekora", 5000);
		Student studentMarine = new Student("Marine", 10000);

		studentPekora.showInfo();
		studentMarine.showInfo();
		Bus bus100 = new Bus(100);
		studentPekora.takeBus(bus100);
		studentPekora.showInfo();
		bus100.showInfo();
		
		Subway subwayNinchin = new Subway("Ninchin");
		studentMarine.takeSubway(subwayNinchin);
		studentMarine.showInfo();
		subwayNinchin.showInfo();
	}

}
