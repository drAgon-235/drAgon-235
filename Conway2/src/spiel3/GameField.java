package spiel3;

public class GameField 
{	
	final int max_x = 8;
	final int max_y = 10;
	boolean[][] spielfeld = new boolean[max_x][max_y];	
	boolean[][] verändertesSPielfeld = new boolean[max_x][max_y];
	public static int roundCounter = 1;
	
	
	public void erstelleUrSpielfeld()
	{
		for(int x= 0; x < max_x; x++)
		{
			for(int y = 0; y <= spielfeld[x].length-1; y++)
			{	
				spielfeld[x][y] = false;
			}		
		}		
	}
	
	public void setze_blinker(int row)
	{
		spielfeld[row][3] = true;
		spielfeld[row][4] = true;
		spielfeld[row][5] = true;
		
	}
	
	public void andererBlinker()
	{	
		spielfeld[1][3] = true;
		spielfeld[2][4] = true;
		spielfeld[3][2] = true;
		spielfeld[3][3] = true;
		spielfeld[3][4] = true;
//		spielfeld[4][6] = true;
	}
	
	public void zeigeUrSpielfeld() 
	{	
		System.out.println("------------------------");
		for(int x= 0; x < max_x; x++)
		{	
			System.out.println();
			for(int y = 0; y <= spielfeld[x].length-1; y++)
			{	
				if (spielfeld[x][y] == true)
				{	
					System.out.print("#");
				}
					else System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.println("------------------------");
	}
	
	public void zeigeNeuesSpielfeld()
	{
		System.out.println("Round:"+ roundCounter+ " ------------------");
		for(int x= 0; x < max_x; x++)
		{	
			System.out.println();
			for(int y = 0; y <= verändertesSPielfeld[x].length-1; y++)
			{	
				if (verändertesSPielfeld[x][y] == true)
					System.out.print("#");
				else System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.println("--------------------------");
		
	}
	
	public void osziliere(int runden)
	{	
		for( int anz = 1; anz <= runden; anz++)
		{	
		run();
		zeigeNeuesSpielfeld();
		resetSpielFeld();
		}
	}
	
	public void run()
	{	
		for(int x= 0; x < max_x; x++)
		{
			for(int y = 0; y <= spielfeld[x].length-1; y++)
			{	
				if(	spielfeld[x][y] == true)
				{				
					actionLebende(anzahlLebendeNachbarn(x, y), x, y);
				}
				else
				{
					actionTote(anzahlLebendeNachbarn(x, y), x, y);
				}	
			}		
		}
	}
	
	public int anzahlLebendeNachbarn(int x, int y)
	{	int counter = 0;
	
					if(x > 0 && y > 0 && spielfeld [x-1][y-1] == true)counter++;
					if(x > 0 && spielfeld [x-1][y] == true)counter++;
					if(x > 0 && y < max_y -1 && spielfeld [x-1][y+1] == true)counter++;
					
					if(y > 0 && spielfeld [x][y-1] == true)counter++;
					if(spielfeld [x][y] == true);			//Unser zu checkendes Feld
					if(y < max_y -1 && spielfeld [x][y+1] == true)counter++;
					
					if(x < max_x -1 && y > 0 && spielfeld [x+1][y-1] == true)counter++;
					if(x < max_x -1 && spielfeld [x+1][y] == true)counter++;
					if(x < max_x -1 && y < max_y -1 && spielfeld [x+1][y+1] == true)counter++;				

		return counter;
	}
	
	public void actionLebende(int counter, int x, int y)
	{
		if( counter <=1 || counter > 3)
		{
			verändertesSPielfeld[x][y] = false;
		}
		else verändertesSPielfeld[x][y] = true;
		
	}
	
	public void actionTote(int counter, int x, int y)
	{
		if (counter == 3)
		{
			verändertesSPielfeld[x][y] = true;
		}
		else verändertesSPielfeld[x][y] = false;
		
	}
	
	
	public void resetSpielFeld() 
	{	roundCounter++;
		for(int x= 0; x < max_x; x++)
		{
			for(int y = 0; y <= spielfeld[x].length-1; y++)
			{	
				spielfeld[x][y] = verändertesSPielfeld[x][y];
			}		
		}		
	}
}
