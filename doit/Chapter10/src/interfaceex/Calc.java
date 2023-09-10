package interfaceex;

public interface Calc {
	
	double PI=3.14;//상수로 선언이 된다.
	//public static final이 생략이 되어 있는 거임
	int ERROR=-99999999;
	
	//class하면 오류가 발생하는 데 interface하면 오류가 발생하지 않음
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	void description();
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total+=i;
		}
		return total;
	}

}
