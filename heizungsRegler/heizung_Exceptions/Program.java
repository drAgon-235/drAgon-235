package heizung_Exceptions;

public class Program
{

	public static void main(String[] args)
	{
		Heater test = new Heater();
		
		try
		{
			test.changeStufe();
		} 
		catch (FalscheStufeException e)
		{
			System.out.println("Warnung!!! Falsche Stufe!!! " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("Programm läuft weiter...");
	}

}
