package singleton;

public class Company {//싱글톤 패턴 
	private static Company instance=new Company();
	//인스턴스
	//하나만 존재-> static
	
	private Company(){
		
	}
	//객체를 생성하지 않고 메서드를 부를 수 있는 방법은 static을 사용하면 된다.
	public static Company getInstance() {
		if(instance==null)
			instance=new Company();//null을 리턴할 수 없으니깐 하나를 생성한 것
		return instance;//외부에서 가져다 사용할 수 있음.
	}

}
