package gamelevel;

public abstract class PlayerLevel {
	
	//구현할 수 없는 것.
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	/*만약 level마다 따로 클래스를 구현하지 않느다면 아래의 코드에서
	if문이 많이 만들어지게 된다. if(level==1)..else id(level==2)
	이런 식으로 if문과 else if문이 많이 만들어지게 되면 유지보수하는 데 많은
	시간이 걸리게 된다. 그리고 run,jump,turn,show..에서도 동일하게
	if문이 많이 생기게 될 것이다.*/
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}

}
