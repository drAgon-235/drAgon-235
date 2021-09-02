package spiel3;

public class Play 
{

	public static void main(String[] args) 
	{
		GameField spiel = new GameField();
		spiel.erstelleUrSpielfeld();
		spiel.zeigeUrSpielfeld();
		spiel.setze_blinker(4);		//Zeile des Blinkers
//		spiel.andererBlinker();
		spiel.zeigeUrSpielfeld();
		
		spiel.osziliere(9);	 	//wieviele Runden soll oszilieren dauern

		
	}

}
