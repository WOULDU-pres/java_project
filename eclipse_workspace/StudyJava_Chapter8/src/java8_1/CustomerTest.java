package java8_1;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerPekora = new Customer();
		customerPekora.setCustomerID(10010);
		customerPekora.setCustomerName("PekoPeko");
		customerPekora.bonusPoint = 1000;
		
		System.out.println(customerPekora.getCustomerInfo());
		
		Customer customerMarine = new Customer();
		customerMarine.setCustomerID(10011);
		customerMarine.setCustomerName("Ahoy!");
		customerMarine.bonusPoint = 10000;
		
		System.out.println(customerMarine.getCustomerInfo());
	}

}
