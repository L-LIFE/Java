package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
			
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		//모든 고객을 한번에 모을 수 있는 것이 Customer(gold,vip,silver)
			
		Customer customerLee=new Customer(10010,"이순신");
		Customer customerShin=new Customer(10011,"심사임당");
		GoldCustomer customerHong=new GoldCustomer(10012,"홍길동");
		GoldCustomer customerYoul=new GoldCustomer(10013,"이율곡");
		VIPCustomer customerKim=new VIPCustomer(10014,"김유신",12345);
			
		//ArrayList의 add속성을 사용하여 객체 배열에 고객 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("=======고객정보 출력===========");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======할인율과 보너스 포인트 결과=======");
		int price=10000;
		for(Customer customer:customerList) {
			//10000원 넣었을 때의 각각의 가격이 나오게 된다.
			int cost=customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "
			+cost+"지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
			
			
			
	}

}
