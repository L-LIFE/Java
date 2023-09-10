package inheritance;

public class VIPCustomer extends Customer{
	
	double saleRatio;//깎아주는 비율
	private int agentID;//전문상담원
	
	/*public VIPCustomer() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
*/
	public VIPCustomer(int customerID, String customerName, int agentID) { //클래스 이름과 동일해야 한다.
		
		super(customerID,customerName); //자신의 상위 클래스를 가리킨다.
		//생성자를 하나 만들어준 경우
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		
		//System.out.println("VIPCustomer(int, String) 호출");
	}
	//vip마다 다른 세일율을 주기위해 Customer에서 있는 calcPrice를
	//똑같은 메서드 이름, 같은 변수의 이름으로 오버라이딩을 해준다.
	//오버로딩은 메서드가 똑같은 게 여러개인것이고, 오버라이딩을 똑같은 것을 덮어씌운다는 느낌
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}

}
