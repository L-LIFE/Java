package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabets= new char[2];
		char ch='A';
		
		//ch값도 증가시키기
		for(int i=0;i<alphabets.length;i++,ch++) {
			alphabets[i]=ch;
		}

		for(int i=0;i<alphabets.length;i++,ch++) {
			System.out.println(alphabets[i]);
		}
	}

}
