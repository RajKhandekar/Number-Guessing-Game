// Created by own
import java.util.*;
class Guess{
	int number;
	public int guessNumber() {
	   System.out.println("Hey Guesser Guess the number");
	   Scanner s=new Scanner(System.in);
	   number=s.nextInt();
	   return number;
	
	
	}	
	
	
}
class Player111{
	int playerno;
	public int guessNumberByPlayer() {
	   System.out.println("Hey player Guess the number");
	   Scanner s=new Scanner(System.in);
	   playerno=s.nextInt();
	   return playerno;
	
}}

class Umpire111{
	public void getData() {
		
	Guess g=new Guess();
	int g1=g.guessNumber();
	
	Player111 p=new Player111();
	int p1=p.guessNumberByPlayer();
	int p2=p.guessNumberByPlayer();
	int p3=p.guessNumberByPlayer();
	
if(g1==p1) {
	if(g1==p2 && g1==p3) {
				System.out.println("All Player Guess correct number");}
    else if(g1==p2) {
		System.out.println("player 2 and 1 guess correct num "+g1);}
			
    else if(g1==p3) {
	System.out.println("player 3 and 1 guess correct num "+g1);}
    else{
    	System.out.println("player 1 guess correct num "+g1);}
    	
}


   


else if(g1==p2) {
	  if(g1==p2 && g1==p3) {
		  System.out.println("Player 2 and 3 guess correct num ");
	  } 
	 
 else {
	 System.out.println("player 2 guess correct number");
 }
			

}

	  
else if(g1==p3) {
	    System.out.println("player 3 guess correct num "+g1);}
	  
else{
	    System.out.println("all player guess number are wrong "+g1);
}
	
	
	}	
}




public class GuesserGame3{
   public static void main(String args[]) {
	  Umpire111 u=new Umpire111();
	  u.getData();	
     }
}
