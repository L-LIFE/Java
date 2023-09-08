package aaa;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=30;
		
		int sum=addNum(num1,num2);
		System.out.println(sum);

	}
	//int sum=addNum(num1,num2)에서의 num1, num2의 이름을
	//아래의 n1, n2에서의 이름과 일치하지 않아도 된다.->값이 복사되는 것이기 때문.
	public static int addNum(int n1, int n2) {
		int result=n1+n2;
		return result;
		
		/* 
		 * 반환하는 것이 없다면 void를 아래와 같이 적으면 된다.
		 * public static void addNum*/
	}

}
