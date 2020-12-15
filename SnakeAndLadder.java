import java.util.*;
class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int position=0;
		int diceRoll = (int)(Math.random()*6 )+1 ;
		System.out.println(diceRoll);
		System.out.println(diceRoll);
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.No play 2.Ladder 3.Snake");
		choice = (int)(Math.random()*3 )+1 ;
		switch(choice)
		{
			case 1:
					System.out.println("No Play.");
					break;
			case 2:
					position+=diceRoll;
					System.out.println("ladder");
					break;
			case 3:
					position-=diceRoll;
					System.out.println("snake");
					break;
		}
	}
}
