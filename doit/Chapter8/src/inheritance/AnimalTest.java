package inheritance;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다. ");
	}
	//다운캐스팅
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	public void flying() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test=new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		/*Animal animal=new Human(); 이 코드가
		 *  new Human()의 Human()이 moveAnimal(Animal animal)의
		animal에 들어가는 것과 동일한 내용.*/
		
		
/*		Animal[] animalList=new Animal[3];
		animalList[0]=new Human();
		
		ArrayList<Animal> animals=new ArrayList<Animal>();
		animals.add(new Tiger());*/
	}
	
	
	
/*	public void moveAnimal(Animal animal) {
		animal.move();
		Human h=(Human)animal; //강제 캐스팅을 해줘야 한다.
	}
*/
	
	//Animal animal이는 human, tiger, eagle도 되는 것을 선택한 것.
	public void moveAnimal(Animal animal) {
		animal.move();
		/*animal.move();이 코드는 한줄인데 이 코드에 대한 내용이 다양함.
		 * 이게 다양성을 의미한다.
		 * */
		
		//다운캐스팅
		//hunting을 부르고 싶은데 부르는 과정에서 사용할 수 있는 것으로 나오지 않는다.
		//그래서 다운캐스팅을 해서 불러와야 한다.
		/*아래와 같이 하게 되면 move는 불러올 수 있는 데 다음은 에러가 발생.
		Human human=(Human)animal;
		human.readBook();*/
		if(animal instanceof Human) {
			Human human=(Human)animal;
			human.readBook();
		}else if(animal instanceof Tiger) {
			Tiger tiger=(Tiger)animal;
			tiger.hunting();
		}else if(animal instanceof Eagle) {
			Eagle eagle=(Eagle)animal;
			eagle.flying();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}

}
