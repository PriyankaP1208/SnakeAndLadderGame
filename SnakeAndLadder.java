import java.util.*;
class SnakeAndLadder
{
	public static void main(String[] args)
     	{
        	int position=0;
             	int flag=0;
             	while(position!=100)
             	{
                	int diceRoll = (int) (Math.floor(Math.random()*10)%6);
                     	System.out.println(diceRoll);
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
                                	position+=diceRoll;
                                        System.out.println("ladder");
                                        if(position<=100)
                                        	position+=diceRoll;
					else if(position>100)
						position=100;
                                        break;
                             	case 3:
                                	System.out.println("Snake");
                                        if((position-diceRoll)<0)
                                         	position=0;
                                        else
                                        	position-=diceRoll;
                                        break;
                             default:
                            	 	System.out.println("Wrong choice");
                	}
			System.out.println("Dice Rolled:"+flag);
			System.out.println("Position:"+position);
        	}
	}

}

