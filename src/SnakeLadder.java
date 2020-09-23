
public class SnakeLadder {
		
	static final int startPos=0;
	static final int maxPlayer=1;
	static final int DiceRange=6;
	static final int OptionRange=3;
	static final int MaxPos=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumOfPlayers=2;
		int[] CurPosOfPlayers = new int[NumOfPlayers];
		
		Boolean IsWin=false;
		int Winner=-1;
		int DiceRoll=0;
		
		for(int i=0;i<NumOfPlayers;i++)
			CurPosOfPlayers[i]=startPos;
		
		while(IsWin==false) {
			for(int i=0;i<NumOfPlayers;i++) {
				if(CurPosOfPlayers[i]<0)
					CurPosOfPlayers[i]=startPos;
				
				int Option=(int)(Math.random()*20 %3);
				int CurrentDiceNumber = (int) (Math.random()*20%6);
				DiceRoll++;
				//as mod with 6 can generate 0 so to over come it we increament it
				CurrentDiceNumber++;
				
				
				if(Option==0) {
					//no play
					
				}
				else if(Option==1) {
					//Moves Ahead
					CurPosOfPlayers[i]+=CurrentDiceNumber;
					if(CurPosOfPlayers[i]==100)
					{
						IsWin=true;
						Winner=i;
						break;
					}
					if(CurPosOfPlayers[i]>100)
						CurPosOfPlayers[i]-=CurrentDiceNumber;
					
				}
				else {
					//moves back;
					CurPosOfPlayers[i]-=CurrentDiceNumber;
				}
				System.out.println("Current Player is " + i +" Current Pos : "+CurPosOfPlayers[i]);
			}
		}
		System.out.println("Win is "+Winner);
		System.out.println("Total Dice Roll : "+DiceRoll);
	}

}
