package heizung_Exceptions;

import java.util.Scanner;

public class Heater
{
	private int stufe;
	
	public void changeStufe() throws FalscheStufeException
	{
		System.out.println("Welche Stufe wünschen Sie");
		Scanner sc = new Scanner(System.in);
		stufe = sc.nextInt();
		
		if(stufe < 0)
		{
			throw new FalscheStufeException(" Eingabe zu niedrig");
		}
		else if(stufe > 5)
		{
			throw new FalscheStufeException(" Eingabe zu hoch");
		}
		
		System.out.println("Stufe " + stufe + " wurde eingestellt.");
		
	}
	
}
