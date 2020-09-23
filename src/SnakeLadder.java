
public class SnakeLadder {
		
	static final int startPos=0;
	static final int maxPlayer=1;
	static final int DiceRange=6;
	static final int OptionRange=3;
	static final int MaxPos=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentPos=startPos;
		while(currentPos<MaxPos) {
			if(currentPos<0)
				currentPos=startPos;
			
			int Option=(int)(Math.random()*20 %3);
			int CurrentDiceNumber = (int) (Math.random()*20%6);
			//as mod with 6 can generate 0 so to over come it we increament it
			CurrentDiceNumber++;
			
			
			if(Option==0) {
				//no play
				
			}
			else if(Option==1) {
				//Moves Ahead
				currentPos+=CurrentDiceNumber;
				if(currentPos>100)
					currentPos-=CurrentDiceNumber;
				
			}
			else {
				//moves back;
				currentPos-=CurrentDiceNumber;
			}
			System.out.println("Current Pos : "+currentPos);
		}
		System.out.println("Win");
	}

}
