import java.util.ArrayList;


	public class Boats
	    {
		
		
		
		public static String[][] computerShipBoard;
		
		public static ArrayList <Boats> computerShips = new ArrayList <Boats>();
		
		public static ArrayList <Boats> ships = new ArrayList <Boats>();
		
		public static int fleetHealth;
		
		public static int computerFleetHealth;
		
		public static String computerOrShip;
		
		public int getShipHealth() {
			return shipHealth;
		}

		public void setShipHealth(int shipHealth) {
			this.shipHealth = shipHealth;
		}

		public String getShipType() {
			return shipType;
		}

		public void setShipType(String shipType) {
			this.shipType = shipType;
		}

		public int getShipLength() {
			return shipLength;
		}

		public void setShipLength(int shipLength) {
			this.shipLength = shipLength;
		}

		private int shipHealth;
		
		private String shipType;
		
		private int shipLength;
		
		private String type;
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boats (int sH, String sT, int sL, String t)
		{
			
			shipHealth = sH;
			
			shipType = sT;
			
			shipLength = sL;
			
			type = t;
			
		}
		
		public static void test()
		{
			
			computerOrShip = "Ship";
			fleetHealth = createComputerShips(ships.get(0).getShipHealth(), ships.get(1).getShipHealth(), ships.get(2).getShipHealth(), ships.get(3).getShipHealth(), ships.get(4).getShipHealth());
			
			
			computerOrShip = "Computer";	
	        computerFleetHealth = createComputerShips(computerShips.get(0).getShipHealth(), computerShips.get(1).getShipHealth(),computerShips.get(2).getShipHealth(),computerShips.get(3).getShipHealth(),computerShips.get(4).getShipHealth());
			
		}
	
	public static int createComputerShips(int x, int y, int z, int a, int b)
	{
				
		
		
		
		return x + y + z + a + b;
		
	}

	public static String[][] generateComputerBoard1()
	{
		
        computerShipBoard = new String [10][10];
		
		String space = " ";
		
		for (int row = 0; row < 10; row ++)
		{
			
			for (int col = 0; col < 10; col ++)
			{
				
				
				
				computerShipBoard[row][col] = space;
				
			}
			
			
			
			
		}
		
		computerShipBoard[0][0] = computerShips.get(0).getType();
		computerShipBoard[0][1] = computerShips.get(0).getType();
		computerShipBoard[0][2] = computerShips.get(0).getType();
		computerShipBoard[0][3] = computerShips.get(0).getType();
		computerShipBoard[0][4] = computerShips.get(0).getType();
		
		computerShipBoard[5][4] = computerShips.get(1).getType();
		computerShipBoard[5][3] = computerShips.get(1).getType();
		computerShipBoard[5][2] = computerShips.get(1).getType();
		computerShipBoard[5][1] = computerShips.get(1).getType();
		
		computerShipBoard[2][6] = computerShips.get(2).getType();
		computerShipBoard[3][6] = computerShips.get(2).getType();
		computerShipBoard[4][6] = computerShips.get(2).getType();
		
		computerShipBoard[9][9] = computerShips.get(3).getType();
		computerShipBoard[8][9] = computerShips.get(3).getType();
		computerShipBoard[7][9] = computerShips.get(3).getType();
		
		computerShipBoard[8][4] = computerShips.get(4).getType();
		computerShipBoard[8][3] = computerShips.get(4).getType();
		
		
		
		
		
	
		
		
		
		
		
		return computerShipBoard;
		
		
		
		
		
		
		
		
		
	}
	
	public static String[][] generateComputerBoard2()
	{
		
        computerShipBoard = new String [10][10];
		
		String space = " ";
		
		for (int row = 0; row < 10; row ++)
		{
			
			for (int col = 0; col < 10; col ++)
			{
				
				
				
				computerShipBoard[row][col] = space;
				
			}
			
			
			
			
		}
		
		computerShipBoard[1][0] = computerShips.get(0).getType();
		computerShipBoard[2][0] = computerShips.get(0).getType();
		computerShipBoard[3][0] = computerShips.get(0).getType();
		computerShipBoard[4][0] = computerShips.get(0).getType();
		computerShipBoard[5][0] = computerShips.get(0).getType();
		
		computerShipBoard[4][8] = computerShips.get(1).getType();
		computerShipBoard[4][9] = computerShips.get(1).getType();
		computerShipBoard[4][7] = computerShips.get(1).getType();
		computerShipBoard[4][6] = computerShips.get(1).getType();
		
		computerShipBoard[0][1] = computerShips.get(2).getType();
		computerShipBoard[0][2] = computerShips.get(2).getType();
		computerShipBoard[0][3] = computerShips.get(2).getType();
		
		computerShipBoard[7][4] = computerShips.get(3).getType();
		computerShipBoard[7][5] = computerShips.get(3).getType();
		computerShipBoard[7][6] = computerShips.get(3).getType();
		
		computerShipBoard[6][8] = computerShips.get(4).getType();
		computerShipBoard[6][9] = computerShips.get(4).getType();
		
		
		
		
		
		
		
		
		
		return computerShipBoard;
		
		
		
		
		
		
		
		
		
	}
	
	public static String[][] generateComputerBoard3()
	{
		
        computerShipBoard = new String [10][10];
		
		String space = " ";
		
		for (int row = 0; row < 10; row ++)
		{
			
			for (int col = 0; col < 10; col ++)
			{
				
				
				
				computerShipBoard[row][col] = space;
				
			}
			
			
			
			
		}
		
		computerShipBoard[8][4] = computerShips.get(0).getType();
		computerShipBoard[8][5] = computerShips.get(0).getType();
		computerShipBoard[8][6] = computerShips.get(0).getType();
		computerShipBoard[8][7] = computerShips.get(0).getType();
		computerShipBoard[8][8] = computerShips.get(0).getType();
		
		computerShipBoard[6][7] = computerShips.get(1).getType();
		computerShipBoard[5][7] = computerShips.get(1).getType();
		computerShipBoard[4][7] = computerShips.get(1).getType();
		computerShipBoard[3][7] = computerShips.get(1).getType();
		
		computerShipBoard[1][6] = computerShips.get(2).getType();
		computerShipBoard[2][6] = computerShips.get(2).getType();
		computerShipBoard[3][6] = computerShips.get(2).getType();
		
		computerShipBoard[7][6] = computerShips.get(3).getType();
		computerShipBoard[7][7] = computerShips.get(3).getType();
		computerShipBoard[7][8] = computerShips.get(3).getType();
		
		computerShipBoard[3][1] = computerShips.get(4).getType();
		computerShipBoard[3][2] = computerShips.get(4).getType();
		
		
		
		
		
		
		
		
		
		return computerShipBoard;
		
		
		
		
		
		
		
		
		
	}
	
	public static void chooseComputerBoard()
	{
		
		int number = (int)(Math.random()* 3)+1;
		
		if (number == 1)
		{
			generateComputerBoard1();
		}
		
		else if (number ==2)
		{
			generateComputerBoard2();
		}
		
		else
		{
			generateComputerBoard3();
		}
		
		
		
		
		
		
		
		
		
	}
	
	public static void addArray()
	{
	ships.add(new Boats(5, "Air-Craft Carrier", 5,"A"));
	ships.add(new Boats(4, "BattleShip", 4,"B"));
	ships.add(new Boats(3, "Cruiser", 3,"C"));
	ships.add(new Boats(3, "Submarine", 3,"S"));
	ships.add(new Boats(2, "Destroyer", 2,"D"));
	
	computerShips.add(new Boats(5, "Air-Craft Carrier", 5,"+"));
	computerShips.add(new Boats(4, "BattleShip", 4,"+"));
	computerShips.add(new Boats(3, "Cruiser", 3,"+"));
	computerShips.add(new Boats(3, "Submarine", 3,"+"));
	computerShips.add(new Boats(2, "Destroyer", 2,"+"));


	}
	}


