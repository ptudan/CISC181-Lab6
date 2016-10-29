
public class Player {
	private boolean isComputer;
	private String name;
	
	public Player(){
		name = "AI";
		isComputer = true;
	}
	
	public Player(String n){
		name = n;
		isComputer = false;
	}
	
	public boolean isComputer(){
		return isComputer;
	}
}
