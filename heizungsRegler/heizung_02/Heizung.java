package heizung_02;

import java.util.Scanner;

public class Heizung
{
	private int stufe;

	public void changeStufe() 
	{
		System.out.println("Welche Stufe wünschen Sie");
		Scanner sc = new Scanner(System.in);
		stufe = sc.nextInt();
		
		while(stufe < 1 || stufe > 5)
		{	
			System.out.println("FALSCHE STUFE!!! Bitte nochmal!");
			System.out.println("Welche Stufe wünschen Sie");
			Scanner sc1 = new Scanner(System.in);
			stufe = sc1.nextInt();
		}
		
		System.out.println("Stufe " + stufe + " wurde eingestellt.");
		
	}
	
}
