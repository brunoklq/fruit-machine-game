package griffith;

import java.util.Scanner;
import java.util.ArrayList;


	//Bruno Kennedy Lisboa de Queiroz - 3141551
public class FruitMachine {
	
	public static void main (String[] args) throws InterruptedException {

	//Game of Slot Machine Called FruitMachine
		FruitMachine s1 = new FruitMachine();	
	}


	// I Created the the method where a i put all structure of code!
	
	public FruitMachine() throws InterruptedException {
		
		System.out.print("\033[0;33m");
		System.out.println("                               ╦ ╦┌─┐┬  ┌─┐┌─┐┌┬┐┌─┐            \r\n"
				+ "                               ║║║├┤ │  │  │ ││││├┤             \r\n"
				+ "                               ╚╩╝└─┘┴─┘└─┘└─┘┴ ┴└─┘            \r\n"
				+ "                 ╔═╗┬  ┌─┐┌┬┐  ╔╦╗┌─┐┌─┐┬ ┬┬┌┐┌┌─┐  ╔═╗┌─┐┌┬┐┌─┐\r\n"
				+ "                 ╚═╗│  │ │ │   ║║║├─┤│  ├─┤││││├┤   ║ ╦├─┤│││├┤ \r\n"
				+ "                 ╚═╝┴─┘└─┘ ┴   ╩ ╩┴ ┴└─┘┴ ┴┴┘└┘└─┘  ╚═╝┴ ┴┴ ┴└─┘"+"\033[0;32m"); // The main Title!

		System.out.println("      Before you start chose the value you want to play:(E.x:500, 200, 100)*"+"\033[0;33m");
		boolean variable_control = true; // before to put any value i started with variable to control "the while general code"

		Scanner menu_input = new Scanner(System.in);


		while(menu_input.hasNextInt() == false ) {
			System.out.println(" Wrong value, please digit values consisten, letter is not acceptable");
			menu_input.next();
		} // i decided to use the "while" for ask and validate numbers before the code run.

		Scanner sc = new Scanner (System.in);
		Score score = new Score();
		score.setBalance(menu_input.nextInt());// using getters and setters to update the value 
		
		while(variable_control) {  // here the Structure define how the code will progress
			System.out.println("                  _____________________________________________");
			System.out.println("                 |                                             |");
			System.out.println("                 |        To Start select Options Below:       |"+"\033[0;32m ");
			System.out.println("                 |             1-New Game                      |"+"\033[0;33m         ");
			System.out.println("                 |             2-Ruleset                       |");
			System.out.println("                 |             3-Remainning credits            |");
			System.out.println("                 |             4-Exit the Game                 |");
			System.out.println("                 |_____________________________________________|");

			while(sc.hasNextInt() == false ) { // while for validate the value select.
				System.out.println("Wrong value, please digit values consisten, letter is not acceptable");
				sc.next();
			}
			int input = sc.nextInt();


			if(input == 1) {

				System.out.println("                   __________________________________________");
				System.out.println("                  |                                          |");
				System.out.println("                  |          The Fruit Machine Game          |");
				System.out.println("                  |     Are you ready for this fun moment?   |");
				System.out.println("                  |            Press 1 for  - 'YES'          |");
				System.out.println("                  |            Press 2 for  - 'NOT'          |");
				System.out.println("                  |__________________________________________|");

				while(menu_input.hasNextInt() == false ) {
					System.out.println("Wrong value, please digit values consisten, letter is not acceptable");
					menu_input.next();
				}
				int option = menu_input.nextInt();
				if(option == 1) {// here the Structure define how the code will progress
					int credit_int = score.getBalance();

					System.out.println("                      You adding your balance now is: "+credit_int);
					System.out.println();


					int Balance = credit_int;
					Thread.sleep(1000);
					System.out.println("                   We Will spin the machine, and the result is:");
					System.out.println();

					do{ // the structure which the code will spin the numbers and get the random value.

						Score score1 = new Score();

						int [] list_symbols_1 = {0,1,2,3,4,5,6,7,8,9};//random value
						int [] list_symbols_2 = {0,1,2,3,4,5,6,7,8,9};//random value
						int [] list_symbols_3 = {0,1,2,3,4,5,6,7,8,9};//random value
						
						// we could increase the range if we want to turn the game more difficult, or remove to turn more easy.


						int number = (char) Math.floor(Math.random()*list_symbols_1.length);
						int number2 = (int) Math.floor(Math.random()*list_symbols_2.length);
						int number3 = (int) Math.floor(Math.random()*list_symbols_3.length);

						//the previous balance and the set of spin numbers displayed
						System.out.println();
						System.out.println("                         ----------------------------");
						System.out.println("                         |Your Previous Balance:"+Balance+"|");
						System.out.println("                         ----------------------------");
						System.out.println();
						System.out.println("                         --------*YOUR RESULT*-------");
						Thread.sleep(1000); // a small delay to create interaction
						System.out.print("                         --------    "+number);
						Thread.sleep(500);
						System.out.print("-");
						Thread.sleep(500);
						System.out.print(+number2);
						Thread.sleep(500);
						System.out.print("-");
						Thread.sleep(500);
						System.out.print(number3);
						Thread.sleep(100);
						System.out.print("   --------");
						System.out.println();
						System.out.println("                         ----------------------------");
						Thread.sleep(1000);
						System.out.println("");

						if (number == 7 && number2 == 7 && number3 == 7) { // Here we have the set up of combinations of numbers.

							int result_1 = Balance + 150;
							score1.setBalance(result_1);
							System.out.println("\033[0;32m");
							System.out.println("                             Amazing You Won 150 Credits Your Score = "+score1.getBalance());
							System.out.println("                                  Your Update Balance:"+(Balance+=150));

						}
						if (number == 9 && number2 == 9 && number3 == 9) {

							int result_2 = (Balance + 150)*9;
							score1.setBalance(result_2);
							System.out.println("\033[0;32m");
							System.out.println("                      Uallll!!!!, You Activate the Super power 9X, Credits Your Score = "+score1.getBalance());
							System.out.println("                         Your Update Balance:"+(Balance+=150)*9);

						}
						else if (number == number2 && number2 == number3 && number == number3) {

							int result_3 = Balance + 75;
							score1.setBalance(result_3);
							System.out.println("\033[0;32m");
							System.out.println("                         You won 75 Credits, Result:"+score1.getBalance());
							System.out.println("                              Your Update Balance:"+(Balance+=75));
						}
						else if (number == number2 || number2 == number3 || number == number3) {

							int result_4 = (Balance + 45);
							score1.setBalance(result_4);
							System.out.println("\033[0;32m");
							System.out.println("                         You won 45 Credits, Result:"+score1.getBalance());
							System.out.println();
							System.out.println("                             Your Update Balance:"+(Balance+=45));
						}

						else if (number != number2 && number2 != number3 && number != number3) {
							int result_5 = Balance-15;
							score1.setBalance(result_5);
							System.out.println("\033[0;31m");
							System.out.println("                         You lost 15 Credits, Result:"+score1.getBalance());
							System.out.println();
							System.out.println("                           Your Update Balance:"+(Balance-=15));
						}
						System.out.println("");
						System.out.println("                        Press 1 to keep or 2 to get out");	
						while(menu_input.hasNextInt() == false ) { // while for validate the value select.
							System.out.println("Wrong value, please digit values consisten, letter is not acceptable");
							menu_input.next();
						}
						int option_2 = menu_input.nextInt();
						if(option_2 == 1) { // if for validate the value select

							continue;
						}
						else if(option_2 == 2) {
							System.out.println("                             Ok, You Want to get out");
							break;
						}
						else
						{
							System.out.println("                   Wrong Option Try Again");
						}
					}while(Balance > 0 );
					score.setBalance(Balance);
					if (Balance <= 0) {
						System.out.println("                          *You don't have more money!*");
					}
					System.out.println("                            I wish you back one day!");


				}
				//break
			}

			else if (input == 2){ // Second option for input.

				System.out.println("                           -----------Rulset-----------");
				System.out.println("");
				System.out.println("                    To play you need to put credits,more you");
				System.out.println("                    try in the sping more chances you have to gain");
				System.out.println("                    Every round you have chance to gain or lost,");
				System.out.println("                    if you lost you will be charge in 15 credits");
				System.out.println("                    if you win you a regular round you will be ");
				System.out.println("                    increase 45 credits in your amount credits");
				System.out.println("");
				System.out.println("                    We have 3 levels of pontuation if you match ");
				System.out.println("                    7-7-7 you gain 150 or 9-9-9 you will gain 9X");
				System.out.println("                    times credits in your amount.");
				System.out.println("                    If your spin has 2 numbers equals you win 45");
				System.out.println("                    credits, if your spin has 3 numbers equals,");
				System.out.println("                    except 7-7-7 and 9-9-9, you will win 75 credits");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                   If you match  9-9-9 = + 150 credits + plus + 9X");
				System.out.println("");
				System.out.println("");
				System.out.println("                        If you match  7-7-7 = +150 credits");
				System.out.println("");
				System.out.println("");
				System.out.println("                        If you match  1-7-7 = +45 credits");
				System.out.println("");
				System.out.println("");
				System.out.println("                        If you match  1-3-7 = -15 credits");
				System.out.println("");
				System.out.println("");
				System.out.println("                 ------------------------------------------------");
				System.out.println("                      *If you want to back digit the value:*");
				System.out.println("");
			}

			else if (input == 3) {// Third option for input.

				System.out.println("                      -----------Remainning credits-----------");
				System.out.println("");
				System.out.println("                     Your Remainning credits at the moment is:");
				System.out.println("");
				System.out.println("                                       *"+score.getBalance()+"*        ");
				System.out.println("");
				System.out.println("                        if you want to Add Credits? Press 1");
				System.out.println("                   if you want to back to menu press any button 2");
				while(menu_input.hasNextInt() == false ) {
					System.out.println("Wrong value, please digit values consisten, letter is not acceptable");
					menu_input.next();
				}
				int op1 = menu_input.nextInt();
				if(op1 == 1) {
					System.out.println("                       How much do you want do Add?");
					while(menu_input.hasNextInt() == false ) {
						System.out.println("Wrong value, please digit values consisten, letter is not acceptable");
						menu_input.next();
					}
					int add1 = score.getBalance()+menu_input.nextInt();
					score.setBalance(add1);
					System.out.println("                   Your new score now is:"+score.getBalance());
				}

			}
			else if (input > 4 || input <=0)// Fourth option for input.

				System.out.println("                            *Wrong Option Try Again*");
			else {// end of variable control

				variable_control = false;
			}	

		}

		System.out.println("               Game over, thanks to play your final score is:");
		System.out.println("");
		System.out.println("                                   *"+score.getBalance()+"*       ");

	}


}





