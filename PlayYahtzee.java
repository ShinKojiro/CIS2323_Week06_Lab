import java.util.*;
import javax.swing.*;

import Yahtzee.*;

public class PlayYahtzee{
	public static void main(String[] args){
		Yahtzee game = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char cont = 'y';
		
		while(cont != 'q'){
			System.out.println("**************************\n" + 
			"   you rolled: \n" +
			"       " + game.toss() + "\n" +
			"**************************\n" +
			"What do you want to do?\n" +
			"t) Toss\n" +
			"q) Quit\n" +
			"************************\n");
			
			System.out.print("\nChoose and option: ");
			cont = iDevice.next().charAt(0);
			iDevice.nextLine();
		}
	}
}