package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
	/*	Customer customerLee=new Customer();
		customerLee.setCuetomerID(10100);
		customerLee.setCustomerName("Lee");
*/
		//VIPCustomer customerKim=new VIPCustomer(10101,"Kim");
/*		customerKim.setCuetomerID(10101);
		customerKim.setCustomerName("Kim");
*/
		//VIPCustomer가 Customer을 내포하고 있음. 그래서 이와 같은 캐스팅이 가능.
		Customer customerKim=new VIPCustomer(10101,"Kim",100);
		customerKim.bonusPoint=1000;
		//이떄는 Customer안에 있는 멤버변수만 사용이 가능하다.
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

		//클래스를 삭제하고, 코드내용을 보면서 클래스를 만들어보는 연습을 해본다.test.
	}

}
