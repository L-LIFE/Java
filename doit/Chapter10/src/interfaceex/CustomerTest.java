package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer=new Customer();
		
		Buy buyer=customer;
		buyer.buy();
		
		Sell seller=customer;
		seller.sell();
		
		//주의!!!
		//가상메서드!
		customer.order();
		buyer.order();//buyer가 아닌 customer에서 order가 불러온 거임.
		seller.order();
		

	}

}
