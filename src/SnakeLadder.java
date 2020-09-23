
public class SnakeLadder {
		
	static final int startPos=0;
	static final int maxPlayer=1;
	static final int DiceRange=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int CurrentDiceNumber = (int) (Math.random()*20%6);
		//as mod with 6 can generate 0 so to over come it we increament it
		CurrentDiceNumber++;
		
		
		System.out.println("Current Dice : " + CurrentDiceNumber);
		
	}

}
