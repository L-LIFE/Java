package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		
		Calc calc=new CompleteCalce();
		//Calc calc1=new Calc();//오류: 인터페이스는 구현할 수가 없음
		//Calc calc2=new Calculator(); //오류: 추상클래스라서 구현할 수 없음.
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		//정적메서드: 인스터스와 상관없이 인터페이스 이름만 호출해서 사용하는 것.
		int[] arr= {1,2,3,4,5};
		//아래코드에서 Calc.이라는 점에 주의 깊게 볼 것.
		int sum=Calc.total(arr);
		System.out.println(sum);
		

	}

}
