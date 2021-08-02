package heizung_JOption;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Heizung
{
	private int stufe;
	String eingabe;
	
	public void changeStufe1() 
	{
		eingabe = JOptionPane.showInputDialog("Welche Stufe wünschen Sie?");
		stufe = Integer.parseInt(eingabe);
		
		while(stufe < 1 || stufe > 5)
		{	
			JOptionPane.showMessageDialog( null, "Bitte Stufen 1 - 5 eingeben!" , "Keine gültige Stufe!", JOptionPane.WARNING_MESSAGE);
			eingabe = JOptionPane.showInputDialog("Welche Stufe wünschen Sie?");
			stufe = Integer.parseInt(eingabe);			
		}
		
		JOptionPane.showMessageDialog(null,"Stufe "  + eingabe + " wurde eingestellt.");
	}
}
