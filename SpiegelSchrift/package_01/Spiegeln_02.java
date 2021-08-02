package package_01;

import javax.swing.JOptionPane;

public class Spiegeln_02
{

	public static void main(String[] args)
	{
		String eingabe = JOptionPane.showInputDialog("Bitte Text eingeben: ");
		
		int i = eingabe.length();
		String invers = "";
		for (int j = 0; j < eingabe.length(); j++)
		{
			invers += (eingabe.charAt(i -1));
			i--;
		}
		JOptionPane.showMessageDialog(null, "INVERS: \n"  + invers, "Verarbeitung", 1);
	}

}
