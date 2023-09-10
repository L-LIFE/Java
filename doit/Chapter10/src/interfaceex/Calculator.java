package interfaceex;

public abstract class Calculator implements Calc{

	//다 구현을 안 할거면 abctract를 적어주면 된다.
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	
	  

}
