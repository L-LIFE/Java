package gamelevel;

public class Player {
	
	private PlayerLevel level;

	public Player() {
		level=new BeginnerLevel();//PlayerLevel level
		level.showLevelMessage();//레벨이 바뀔 때마다 바꿔줌
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	//PlayerLevel: AdvancedLevel, SuperLevel 모두 올 수 있는 상위 클래스
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
