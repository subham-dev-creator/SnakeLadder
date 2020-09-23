
public class SnakeLadder {
		
	static final int startPos=0;
	static final int maxPlayer=1;
	static final int DiceRange=6;
	static final int OptionRange=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Option=(int)(Math.random()*20 %3);
		int CurrentDiceNumber = (int) (Math.random()*20%6);
		//as mod with 6 can generate 0 so to over come it we increament it
		CurrentDiceNumber++;
		
		int currentPos=startPos;
		if(Option==0) {
			//no play
			
		}
		else if(Option==1) {
			//Moves Ahead
			currentPos+=CurrentDiceNumber;
			
		}
		else {
			//moves back;
			currentPos-=CurrentDiceNumber;
		}
		System.out.println("Current Pos : "+currentPos);
		
	}

}
