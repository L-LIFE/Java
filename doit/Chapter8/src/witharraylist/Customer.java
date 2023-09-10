package witharraylist;

public class Customer {
	//protected 상속 관계에서는 공유가능. 패키지가 달라도 사용가능.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	protected double bonusRatio; //보너스 비율
	
	/*클래스를 만들어야 하고 어떤 클래스를 만들어야 하는지 아는 방법은
	 * 한 내용에 대해 구분이 필요하거나 너무 많은 내용으로 따로 분리해도 될거
	 * 같은 경우에 분리를 해보면 된다.잘 모르는 경우에는 분리해야 하는 것과 
	 * 같은 내용이 들어가야 하는 것과 분류를 해보고, 실제로 코드를 짜보며 불편함이
	 * 있는지와 합쳐도 되는 지를 직접 느껴보고 판단해야 한다.
	*/
	
	//private int saleRatio;//깎아주는 비율
	//private int agentID;//전문상담원
	
/*	public Customer() {
		
		super(); //extends Object와 동일한 의미를 가진다.
		customerGrade="SILVER";
		bonusRatio=0.01;
		
		System.out.println("Customer() 호출");
	}
*/
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
		
		//System.out.println("Customer(int, String) 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price;
	}
	
	public int getCuetomerID() {
		return customerID;
	}


	public void setCuetomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


//	public int calcPrice(int price) {
//		
//		if(customerGrade=="SILVER") {
//			bonusPoint+=price*bonusRatio;
//		}else if(customerGrade=="VIP") {
//			
//		}else if(customerGrade=="GOLD") {
//		
//		return price;
//	}
	
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade
				+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
	

}
