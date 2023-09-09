package array;

public class ArrayTest {

	public static void main(String[] args) {
//
//		int[] numbers;//배열 초기화
//		numbers=new int[3];
//		
//		numbers[0]=1;
//		numbers[1]=2;
//		numbers[2]=3;
//		System.out.println(numbers.length);

		int[] numbers= new int[]{1,2,3};
		
		//for문에서 범위를 설정할 때 i<=2보다 i<3으로 쓰는 것을 많이 선호함.
		//한눈에 개수를 알 수 있으며 작거나 같다보다는 많이 사용하는 유형.
		//이것보다 더 좋은 방법은 .length를 붙여서 사용하는 것.
		for(int i=0; i<3; i++) {
			System.out.println(numbers[i]);
		}
		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		//int[] studentIDs=new int[5];
//		double[] studentIDs=new double[5];
//		for(int i=0; i<studentIDs.length; i++) {
//			System.out.println(studentIDs[i]);
//		}
	}

}
