import java.util.*;
public class SnakeAndLadder
{
	public static int rollDie()
    	{
        	int diceRoll= (int) (Math.floor(Math.random()*10)%6);
        	return diceRoll;
    	}
    	public static int GamePlay(int position)
    	{
        	int dice,flag=0;
        	dice=rollDie();
        	System.out.println("Roll the die");
        	System.out.println(dice);
        	int choice;
        	Scanner sc=new Scanner(System.in);
        	//System.out.println("1.No play 2.Ladder 3.Snake");
        	choice = 1+(int)(Math.floor(Math.random()*10)%3);
        	flag++;
        	switch(choice)
        	{
            		case 1:
                    		System.out.println("No Play.");
                    		break;
            		case 2:
                	    	position+=dice;
                    		System.out.println("ladder");
                    		if(position<=10)
                         		position+=dice;
                    		else if(position>10)
                         		position=10;
                    		break;
            		case 3:
                    		System.out.println("Snake");
                    		if((position-dice)<0)
                         		position=0;
                    		else
                         		position-=dice;
                    		break;
             		default:
                     		System.out.println("Wrong choice");
         	}
         	System.out.println("Dice Rolled:"+dice);
         	System.out.println("Position:"+position);
         	return position;
     	}
        public static void main(String[] args)
        {
                int player1=0;
                int player2=0,win=0;
                while(player1!=10||player2!=10)
                {
                	player1=GamePlay(player1);
			win=Winner(player1);
			if(win==1)
			{
				System.out.println("Player 1 wins");
				break;
			}
                     	player2=GamePlay(player2);
			win=Winner(player2);
                        if(win==1)
			{
                                System.out.println("Player 2 wins");
				break;
			}

                }
        }
	public static int Winner(int win)
	{
		if(win==10)
			return 1;
		else
			return 0;
	}

}

