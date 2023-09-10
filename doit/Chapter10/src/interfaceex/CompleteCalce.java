package interfaceex;

public class CompleteCalce extends Calculator {
/*
 * public class CompleteCalce extends Calculator interface Calc, Runnable
 * 처럼 인터페이스는 여러개를 구현할 수 있음.
 * */
	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2!=0) {
			return num1/num2;
		}
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
		
	}
	
	
	
	

}
