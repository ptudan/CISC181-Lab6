import javax.swing.JOptionPane;

public class Sticks {
	private int stickCount;
	private String choice;
	
	public Sticks(){
		choice = JOptionPane.showInputDialog(""
				+ "Is this Player v Player [1], Player v AI [2], or AI v AI [3]?");
		if(choice.charAt(0)=='1'){
			playersPlay();
		}
	}
	
	private void chooseSticks(){
		String i = JOptionPane.showInputDialog("Enter the number of sticks 10-100: ");
		stickCount = Integer.parseInt(i);
	}
	
	private void playersPlay(){
		chooseSticks();
		Boolean isP1 = true;
		while(stickCount>0){
			int take = 5;
			while(take> 3){
				take = Integer.parseInt(JOptionPane.showInputDialog("Enter stick take 1-3: "));
			}
			if(isP1){
				isP1 = false;
				System.out.println("Player 1 takes " + take + " leaving " + (stickCount-take)
						+ " from " + stickCount);
				stickCount -= take;
			}
			else{
				isP1 = true;
				System.out.println("Player 2 takes " + take + " leaving " + (stickCount-take)
						+ " from " + stickCount);
				stickCount -= take;
			}
		}
		if(isP1){
			System.out.println("Player one wins!");
		}
		else{
			System.out.println("Player two wins!");
		}
	}
	
	
	
}
