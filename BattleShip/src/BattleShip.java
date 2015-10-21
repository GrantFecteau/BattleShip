import java.util.ArrayList;
import java.util.Scanner;
public class BattleShip 

{
	
	public static String[][] playerShipBoard;
	
	public static String[][] playerHitMissBoard;
	
	public static String[][] createShipBoardForCaptain()
	{
		playerShipBoard = new String [10][10];
		
		String space = " ";
		
		for (int row = 0; row < 10; row ++)
		{
			
			for (int col = 0; col < 10; col ++)
			{
				
				playerShipBoard[row][col] = space;
				
			}
				
		}
		
		return playerShipBoard;
		
	}
	
	public static void printBoards()
	{
		
		System.out.println("Here are your empty boards, begin placing ships when prompted.");
		System.out.println("Your Hit and Misses when firing will appear on th Hit/Miss Board, and your ships will be displayed on the Ship Board.");
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   0");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		


		System.out.println("           Player Hit/Miss Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   0");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerHitMissBoard[0][0] + " | " + playerHitMissBoard[0][1] + " | " + playerHitMissBoard[0][2] + " | " + playerHitMissBoard[0][3] + " | " + playerHitMissBoard[0][4] + " | " + playerHitMissBoard[0][5] + " | " + playerHitMissBoard[0][6] + " | " + playerHitMissBoard[0][7] + " | " + playerHitMissBoard[0][8] + " | " + playerHitMissBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerHitMissBoard[1][0] + " | " + playerHitMissBoard[1][1] + " | " + playerHitMissBoard[1][2] + " | " + playerHitMissBoard[1][3] + " | " + playerHitMissBoard[1][4] + " | " + playerHitMissBoard[1][5] + " | " + playerHitMissBoard[1][6] + " | " + playerHitMissBoard[1][7] + " | " + playerHitMissBoard[1][8] + " | " + playerHitMissBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerHitMissBoard[2][0] + " | " + playerHitMissBoard[2][1] + " | " + playerHitMissBoard[2][2] + " | " + playerHitMissBoard[2][3] + " | " + playerHitMissBoard[2][4] + " | " + playerHitMissBoard[2][5] + " | " + playerHitMissBoard[2][6] + " | " + playerHitMissBoard[2][7] + " | " + playerHitMissBoard[2][8] + " | " + playerHitMissBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerHitMissBoard[3][0] + " | " + playerHitMissBoard[3][1] + " | " + playerHitMissBoard[3][2] + " | " + playerHitMissBoard[3][3] + " | " + playerHitMissBoard[3][4] + " | " + playerHitMissBoard[3][5] + " | " + playerHitMissBoard[3][6] + " | " + playerHitMissBoard[3][7] + " | " + playerHitMissBoard[3][8] + " | " + playerHitMissBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerHitMissBoard[4][0] + " | " + playerHitMissBoard[4][1] + " | " + playerHitMissBoard[4][2] + " | " + playerHitMissBoard[4][3] + " | " + playerHitMissBoard[4][4] + " | " + playerHitMissBoard[4][5] + " | " + playerHitMissBoard[4][6] + " | " + playerHitMissBoard[4][7] + " | " + playerHitMissBoard[4][8] + " | " + playerHitMissBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerHitMissBoard[5][0] + " | " + playerHitMissBoard[5][1] + " | " + playerHitMissBoard[5][2] + " | " + playerHitMissBoard[5][3] + " | " + playerHitMissBoard[5][4] + " | " + playerHitMissBoard[5][5] + " | " + playerHitMissBoard[5][6] + " | " + playerHitMissBoard[5][7] + " | " + playerHitMissBoard[5][8] + " | " + playerHitMissBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerHitMissBoard[6][0] + " | " + playerHitMissBoard[6][1] + " | " + playerHitMissBoard[6][2] + " | " + playerHitMissBoard[6][3] + " | " + playerHitMissBoard[6][4] + " | " + playerHitMissBoard[6][5] + " | " + playerHitMissBoard[6][6] + " | " + playerHitMissBoard[6][7] + " | " + playerHitMissBoard[6][8] + " | " + playerHitMissBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerHitMissBoard[7][0] + " | " + playerHitMissBoard[7][1] + " | " + playerHitMissBoard[7][2] + " | " + playerHitMissBoard[7][3] + " | " + playerHitMissBoard[7][4] + " | " + playerHitMissBoard[7][5] + " | " + playerHitMissBoard[7][6] + " | " + playerHitMissBoard[7][7] + " | " + playerHitMissBoard[7][8] + " | " + playerHitMissBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerHitMissBoard[8][0] + " | " + playerHitMissBoard[8][1] + " | " + playerHitMissBoard[8][2] + " | " + playerHitMissBoard[8][3] + " | " + playerHitMissBoard[8][4] + " | " + playerHitMissBoard[8][5] + " | " + playerHitMissBoard[8][6] + " | " + playerHitMissBoard[8][7] + " | " + playerHitMissBoard[8][8] + " | " + playerHitMissBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerHitMissBoard[9][0] + " | " + playerHitMissBoard[9][1] + " | " + playerHitMissBoard[9][2] + " | " + playerHitMissBoard[9][3] + " | " + playerHitMissBoard[9][4] + " | " + playerHitMissBoard[9][5] + " | " + playerHitMissBoard[9][6] + " | " + playerHitMissBoard[9][7] + " | " + playerHitMissBoard[9][8] + " | " + playerHitMissBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
		
		
	}
	
	public static String[][] createHitMissBoardForCaptain()
	{
		playerHitMissBoard = new String [10][10];
		
		String space = " ";
		
		for (int row = 0; row < 10; row ++)
		{
			
			for (int col = 0; col < 10; col ++)
			{
				
				playerHitMissBoard[row][col] = space;
				
			}
			
			
			
			
		}
		
		
		
		return playerHitMissBoard;
		
	}
	
	public static void greetPlayer()
	{
	
		System.out.println("Hello Cap'n, please input your name below.");
		
		Scanner userInput = new Scanner (System.in);
		
		String playerName = userInput.nextLine();
		
		System.out.println(playerName + ", what a wonderful name! Now go kick some AI butt!");
			
		
	}

	public static void printBattleShip()
	{
		System.out.println("                                  |__");
		System.out.println("                                  |\\/");
		System.out.println("                                  ---");
		System.out.println("                                 / | [");
		System.out.println("                          !      | |||");
		System.out.println("                        _/|     _/|-++'");
		System.out.println("                    +  +--|    |--|--|_ |-");
		System.out.println("                  { /|__|  |//\\__|  |--- |||__//");
		System.out.println("                  +---------------___[}-_===_.'____                   //\\");
		System.out.println("                ____`-' ||___-{]_| _[}-  |     |_[___\\==--            \\//   _");
		System.out.println("__..._____--==//___]_|__|_____________________________[___\\==--____,------' .7");
		System.out.println("|                                                      S.S Relmaar los kaaz /");
		System.out.println("\\_________________________________________________________________________|");
		
		System.out.println("                   WELCOME TO THE BATTLE WATERS MEN!");
	}
	
	public static void createAllBoards()
	{
		createShipBoardForCaptain();
		createHitMissBoardForCaptain();
	}

	public static void placeShips()
	{
		
		
		
		
		
		
		
		
	}
	
	public static void placeCarrier()
	{
		int row = 0;
		
		System.out.println("Please place your ships starting with the AirCraft Carrier Length = " + Boats.ships.get(0).getShipLength() + ".");
		
		Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
			{
		case "a":
		case "A":	
			{
			row = 0;
			break;	
			}
		case "b":
		case "B":
			{
			row = 1;
			break;
			}
		case "c":
		case "C":
			{
			row = 2;
			break;
			}
		case "d":
		case "D":
			{
			row = 3;
			break;
			}
		case "e":
		case "E":
			{
		    row = 4;
		    break;
			}
		case "f":
		case "F":
			{
			row = 5;
			break;
			}
		case "g":
		case "G":
			{
			row = 6;
			break;
			}
		case "h":
		case "H":
			{
			row = 7;
			break;
			}
		case "i":
		case "I":
			{
			row = 8;
			break;
			}
		case "j":
		case "J":
			{
			row = 9;
			break;
			}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
		
		
		
		
		
		playerShipBoard[row][column] = "A";
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
	}
	
	public static void placeBattleShip()
	{
		int row = 0;
		
		System.out.println("Please place your BattleShip Length = " + Boats.ships.get(1).getShipLength() + ".");
		
		Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
		{
		case "a":
		case "A":	
		{
			row = 0;
			break;	
		}
		case "b":
		case "B":
		{
			row = 1;
			break;
		}
		case "c":
		case "C":
		{
			row = 2;
			break;
		}
		case "d":
		case "D":
		{
			row = 3;
			break;
		}
		case "e":
		case "E":
		{
		    row = 4;
		    break;
		}
		case "f":
		case "F":
		{
			row = 5;
			break;
		}
		case "g":
		case "G":
		{
			row = 6;
			break;
		}
		case "h":
		case "H":
		{
			row = 7;
			break;
		}
		case "i":
		case "I":
		{
			row = 8;
			break;
		}
		case "j":
		case "J":
		{
			row = 9;
			break;
		}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
		
		
		
		
		
		playerShipBoard[row][column] = "B";
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
	}
	
	public static void placeDestroyer()
	{
		int row = 0;
		
		System.out.println("Please place your Cruiser Length = " + Boats.ships.get(2).getShipLength() + ".");
		
		Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
		{
		case "a":
		case "A":	
		{
			row = 0;
			break;	
		}
		case "b":
		case "B":
		{
			row = 1;
			break;
		}
		case "c":
		case "C":
		{
			row = 2;
			break;
		}
		case "d":
		case "D":
		{
			row = 3;
			break;
		}
		case "e":
		case "E":
		{
		    row = 4;
		    break;
		}
		case "f":
		case "F":
		{
			row = 5;
			break;
		}
		case "g":
		case "G":
		{
			row = 6;
			break;
		}
		case "h":
		case "H":
		{
			row = 7;
			break;
		}
		case "i":
		case "I":
		{
			row = 8;
			break;
		}
		case "j":
		case "J":
		{
			row = 9;
			break;
		}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
		
		
		
		
		
		playerShipBoard[row][column] = "C";
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
	}
	
	public static void placeSub()
	{
		int row = 0;
		
		System.out.println("Please place your Submarine Length = " + Boats.ships.get(3).getShipLength() + ".");
		
		Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
		{
		case "a":
		case "A":	
		{
			row = 0;
			break;	
		}
		case "b":
		case "B":
		{
			row = 1;
			break;
		}
		case "c":
		case "C":
		{
			row = 2;
			break;
		}
		case "d":
		case "D":
		{
			row = 3;
			break;
		}
		case "e":
		case "E":
		{
		    row = 4;
		    break;
		}
		case "f":
		case "F":
		{
			row = 5;
			break;
		}
		case "g":
		case "G":
		{
			row = 6;
			break;
		}
		case "h":
		case "H":
		{
			row = 7;
			break;
		}
		case "i":
		case "I":
		{
			row = 8;
			break;
		}
		case "j":
		case "J":
		{
			row = 9;
			break;
		}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
		
		
		
		
		
		playerShipBoard[row][column] = "S";
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
	}
	
	public static void placeDinghy()
	{
		int row = 0;
		
		System.out.println("Please place your Dinghy Length = " + Boats.ships.get(4).getShipLength() + ".");
		
		Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
		{
		case "a":
		case "A":	
		{
			row = 0;
			break;	
		}
		case "b":
		case "B":
		{
			row = 1;
			break;
		}
		case "c":
		case "C":
		{
			row = 2;
			break;
		}
		case "d":
		case "D":
		{
			row = 3;
			break;
		}
		case "e":
		case "E":
		{
		    row = 4;
		    break;
		}
		case "f":
		case "F":
		{
			row = 5;
			break;
		}
		case "g":
		case "G":
		{
			row = 6;
			break;
		}
		case "h":
		case "H":
		{
			row = 7;
			break;
		}
		case "i":
		case "I":
		{
			row = 8;
			break;
		}
		case "j":
		case "J":
		{
			row = 9;
			break;
		}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
		
		
		
		
		
		playerShipBoard[row][column] = "D";
		
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		
	}
	
	public static void placeAllShips()
	{
		for (int i = 0; i < Boats.ships.get(0).getShipLength(); i++)
		{
		placeCarrier();
		}
		for (int b = 0; b < Boats.ships.get(1).getShipLength(); b ++)
		{
			placeBattleShip();
		}
		for (int d = 0; d < Boats.ships.get(2).getShipLength(); d ++)
		{
			placeDestroyer();
		}
		for (int s = 0; s < Boats.ships.get(3).getShipLength(); s ++)
		{
			placeSub();
		}
		for (int c = 0; c < Boats.ships.get(4).getShipLength(); c ++)
		{
			placeDinghy();
		}
	}
	
	public static void doAttacks()
	{
		int row = 0;
		
		System.out.println("Great, now it's time to start attacking! Please input a letter and a number to attack the computer.");
		
		while (Boats.fleetHealth > 0 && Boats.computerFleetHealth > 0)
		{
		
        Scanner userInput = new Scanner(System.in);
		
		String firstChoice = userInput.nextLine();
		
		switch (firstChoice.substring(0,1))
		{
		case "a":
		case "A":	
		{
			row = 0;
			break;	
		}
		case "b":
		case "B":
		{
			row = 1;
			break;
		}
		case "c":
		case "C":
		{
			row = 2;
			break;
		}
		case "d":
		case "D":
		{
			row = 3;
			break;
		}
		case "e":
		case "E":
		{
		    row = 4;
		    break;
		}
		case "f":
		case "F":
		{
			row = 5;
			break;
		}
		case "g":
		case "G":
		{
			row = 6;
			break;
		}
		case "h":
		case "H":
		{
			row = 7;
			break;
		}
		case "i":
		case "I":
		{
			row = 8;
			break;
		}
		case "j":
		case "J":
		{
			row = 9;
			break;
		}
		
		
		}
		
		int column = Integer.parseInt(firstChoice.substring(1)) - 1;
	
		
		
		
		
		doComputerAttacks();
		
		if (Boats.computerShipBoard[row][column].equals(" "))
		{
			System.out.println("You missed!");
			
			playerHitMissBoard[row][column] = "O";
			
            System.out.println("Computer Health : " + Boats.computerFleetHealth);
			
			System.out.println("Your Health : " + Boats.fleetHealth);
			
			
		}
		
		else if (playerHitMissBoard[row][column].equals ("X") || playerHitMissBoard[row][column].equals ("O") )
		{
			
			System.out.println("You wasted a turn hitting the same spot twice, too bad.");
			
            System.out.println("Computer Health : " + Boats.computerFleetHealth);
			
			System.out.println("Your Health : " + Boats.fleetHealth);
			
			
		}
		
		
		else 
		{
			System.out.println("You hit!");
			
			playerHitMissBoard[row][column] = "X";
			
			Boats.computerFleetHealth = Boats.computerFleetHealth - 1;
			
			System.out.println("Computer Health : " +Boats.computerFleetHealth);
			
			System.out.println("Your Health : " + Boats.fleetHealth);
			
			
		}
		
		System.out.println("           Player Hit/Miss Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerHitMissBoard[0][0] + " | " + playerHitMissBoard[0][1] + " | " + playerHitMissBoard[0][2] + " | " + playerHitMissBoard[0][3] + " | " + playerHitMissBoard[0][4] + " | " + playerHitMissBoard[0][5] + " | " + playerHitMissBoard[0][6] + " | " + playerHitMissBoard[0][7] + " | " + playerHitMissBoard[0][8] + " | " + playerHitMissBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerHitMissBoard[1][0] + " | " + playerHitMissBoard[1][1] + " | " + playerHitMissBoard[1][2] + " | " + playerHitMissBoard[1][3] + " | " + playerHitMissBoard[1][4] + " | " + playerHitMissBoard[1][5] + " | " + playerHitMissBoard[1][6] + " | " + playerHitMissBoard[1][7] + " | " + playerHitMissBoard[1][8] + " | " + playerHitMissBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerHitMissBoard[2][0] + " | " + playerHitMissBoard[2][1] + " | " + playerHitMissBoard[2][2] + " | " + playerHitMissBoard[2][3] + " | " + playerHitMissBoard[2][4] + " | " + playerHitMissBoard[2][5] + " | " + playerHitMissBoard[2][6] + " | " + playerHitMissBoard[2][7] + " | " + playerHitMissBoard[2][8] + " | " + playerHitMissBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerHitMissBoard[3][0] + " | " + playerHitMissBoard[3][1] + " | " + playerHitMissBoard[3][2] + " | " + playerHitMissBoard[3][3] + " | " + playerHitMissBoard[3][4] + " | " + playerHitMissBoard[3][5] + " | " + playerHitMissBoard[3][6] + " | " + playerHitMissBoard[3][7] + " | " + playerHitMissBoard[3][8] + " | " + playerHitMissBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerHitMissBoard[4][0] + " | " + playerHitMissBoard[4][1] + " | " + playerHitMissBoard[4][2] + " | " + playerHitMissBoard[4][3] + " | " + playerHitMissBoard[4][4] + " | " + playerHitMissBoard[4][5] + " | " + playerHitMissBoard[4][6] + " | " + playerHitMissBoard[4][7] + " | " + playerHitMissBoard[4][8] + " | " + playerHitMissBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerHitMissBoard[5][0] + " | " + playerHitMissBoard[5][1] + " | " + playerHitMissBoard[5][2] + " | " + playerHitMissBoard[5][3] + " | " + playerHitMissBoard[5][4] + " | " + playerHitMissBoard[5][5] + " | " + playerHitMissBoard[5][6] + " | " + playerHitMissBoard[5][7] + " | " + playerHitMissBoard[5][8] + " | " + playerHitMissBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerHitMissBoard[6][0] + " | " + playerHitMissBoard[6][1] + " | " + playerHitMissBoard[6][2] + " | " + playerHitMissBoard[6][3] + " | " + playerHitMissBoard[6][4] + " | " + playerHitMissBoard[6][5] + " | " + playerHitMissBoard[6][6] + " | " + playerHitMissBoard[6][7] + " | " + playerHitMissBoard[6][8] + " | " + playerHitMissBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerHitMissBoard[7][0] + " | " + playerHitMissBoard[7][1] + " | " + playerHitMissBoard[7][2] + " | " + playerHitMissBoard[7][3] + " | " + playerHitMissBoard[7][4] + " | " + playerHitMissBoard[7][5] + " | " + playerHitMissBoard[7][6] + " | " + playerHitMissBoard[7][7] + " | " + playerHitMissBoard[7][8] + " | " + playerHitMissBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerHitMissBoard[8][0] + " | " + playerHitMissBoard[8][1] + " | " + playerHitMissBoard[8][2] + " | " + playerHitMissBoard[8][3] + " | " + playerHitMissBoard[8][4] + " | " + playerHitMissBoard[8][5] + " | " + playerHitMissBoard[8][6] + " | " + playerHitMissBoard[8][7] + " | " + playerHitMissBoard[8][8] + " | " + playerHitMissBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerHitMissBoard[9][0] + " | " + playerHitMissBoard[9][1] + " | " + playerHitMissBoard[9][2] + " | " + playerHitMissBoard[9][3] + " | " + playerHitMissBoard[9][4] + " | " + playerHitMissBoard[9][5] + " | " + playerHitMissBoard[9][6] + " | " + playerHitMissBoard[9][7] + " | " + playerHitMissBoard[9][8] + " | " + playerHitMissBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		System.out.println("           Player Ship Board            ");
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("                                           ");
		System.out.println("-------------------------------------------");
		System.out.println("A | " + playerShipBoard[0][0] + " | " + playerShipBoard[0][1] + " | " + playerShipBoard[0][2] + " | " + playerShipBoard[0][3] + " | " + playerShipBoard[0][4] + " | " + playerShipBoard[0][5] + " | " + playerShipBoard[0][6] + " | " + playerShipBoard[0][7] + " | " + playerShipBoard[0][8] + " | " + playerShipBoard[0][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("B | " + playerShipBoard[1][0] + " | " + playerShipBoard[1][1] + " | " + playerShipBoard[1][2] + " | " + playerShipBoard[1][3] + " | " + playerShipBoard[1][4] + " | " + playerShipBoard[1][5] + " | " + playerShipBoard[1][6] + " | " + playerShipBoard[1][7] + " | " + playerShipBoard[1][8] + " | " + playerShipBoard[1][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("C | " + playerShipBoard[2][0] + " | " + playerShipBoard[2][1] + " | " + playerShipBoard[2][2] + " | " + playerShipBoard[2][3] + " | " + playerShipBoard[2][4] + " | " + playerShipBoard[2][5] + " | " + playerShipBoard[2][6] + " | " + playerShipBoard[2][7] + " | " + playerShipBoard[2][8] + " | " + playerShipBoard[2][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("D | " + playerShipBoard[3][0] + " | " + playerShipBoard[3][1] + " | " + playerShipBoard[3][2] + " | " + playerShipBoard[3][3] + " | " + playerShipBoard[3][4] + " | " + playerShipBoard[3][5] + " | " + playerShipBoard[3][6] + " | " + playerShipBoard[3][7] + " | " + playerShipBoard[3][8] + " | " + playerShipBoard[3][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("E | " + playerShipBoard[4][0] + " | " + playerShipBoard[4][1] + " | " + playerShipBoard[4][2] + " | " + playerShipBoard[4][3] + " | " + playerShipBoard[4][4] + " | " + playerShipBoard[4][5] + " | " + playerShipBoard[4][6] + " | " + playerShipBoard[4][7] + " | " + playerShipBoard[4][8] + " | " + playerShipBoard[4][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("F | " + playerShipBoard[5][0] + " | " + playerShipBoard[5][1] + " | " + playerShipBoard[5][2] + " | " + playerShipBoard[5][3] + " | " + playerShipBoard[5][4] + " | " + playerShipBoard[5][5] + " | " + playerShipBoard[5][6] + " | " + playerShipBoard[5][7] + " | " + playerShipBoard[5][8] + " | " + playerShipBoard[5][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("G | " + playerShipBoard[6][0] + " | " + playerShipBoard[6][1] + " | " + playerShipBoard[6][2] + " | " + playerShipBoard[6][3] + " | " + playerShipBoard[6][4] + " | " + playerShipBoard[6][5] + " | " + playerShipBoard[6][6] + " | " + playerShipBoard[6][7] + " | " + playerShipBoard[6][8] + " | " + playerShipBoard[6][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("H | " + playerShipBoard[7][0] + " | " + playerShipBoard[7][1] + " | " + playerShipBoard[7][2] + " | " + playerShipBoard[7][3] + " | " + playerShipBoard[7][4] + " | " + playerShipBoard[7][5] + " | " + playerShipBoard[7][6] + " | " + playerShipBoard[7][7] + " | " + playerShipBoard[7][8] + " | " + playerShipBoard[7][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("I | " + playerShipBoard[8][0] + " | " + playerShipBoard[8][1] + " | " + playerShipBoard[8][2] + " | " + playerShipBoard[8][3] + " | " + playerShipBoard[8][4] + " | " + playerShipBoard[8][5] + " | " + playerShipBoard[8][6] + " | " + playerShipBoard[8][7] + " | " + playerShipBoard[8][8] + " | " + playerShipBoard[8][9] + " |");
		System.out.println("-------------------------------------------");
		System.out.println("J | " + playerShipBoard[9][0] + " | " + playerShipBoard[9][1] + " | " + playerShipBoard[9][2] + " | " + playerShipBoard[9][3] + " | " + playerShipBoard[9][4] + " | " + playerShipBoard[9][5] + " | " + playerShipBoard[9][6] + " | " + playerShipBoard[9][7] + " | " + playerShipBoard[9][8] + " | " + playerShipBoard[9][9] + " |");
		System.out.println("-------------------------------------------");
		
		if (Boats.computerFleetHealth == 0)
		{
			System.out.println("You Win!");
		}
		
		else if (Boats.fleetHealth == 0)
		{
			System.out.println("You lose!");
		}
		
		}
		
		
		
		
		
		
	}
	
	public static void doComputerAttacks()
	{
	
	int row = (int)(Math.random()* 9);
	
	int column = (int)(Math.random()*9);
	
	if (playerShipBoard[row][column].equals (" ") || playerShipBoard[row][column].equals ("O"))
	{
		System.out.println("The Computer missed!");
		
		playerShipBoard[row][column] = "O";
	}
	
	else if (playerShipBoard[row][column].equals ("X") || playerShipBoard[row][column].equals("O"))
	{
		
		System.out.println("The computer hit the same spot, he will go again.");
		
		doComputerAttacks();
		
	}
	
	else
	{
		System.out.println("The Computer hit!");
		
		playerShipBoard[row][column] = "X";
		
		Boats.fleetHealth = Boats.fleetHealth -1;
		
		
	}
	
	
	
	}
		
	public static void playGame()
	{
			Boats.addArray();
		    Boats.test();
			greetPlayer();
			printBattleShip();
			createAllBoards();
		    printBoards();
			Boats.chooseComputerBoard();
			placeAllShips();
			doAttacks();
	}
	
	
	
}
