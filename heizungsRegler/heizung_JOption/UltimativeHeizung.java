package heizung_JOption;

import javax.swing.JOptionPane;

public class UltimativeHeizung 
{
	
	public void changeStufe3() 
	{	
	
		int yasValue = JOptionPane.showConfirmDialog(null, "Hallo Dragon, die Heizung ist aus. \n Möchtest Du sie einschalten?");
		
		
			if(yasValue == 0)
			{				 
				Object [] werte = { 1, 2, 3, 4, 5};
				Object selectedWert = JOptionPane.showInputDialog
						(null, "Bitte Stufe auswählen.", "Heizugsregler", JOptionPane.INFORMATION_MESSAGE, null, werte, werte[0]);
					
				if(selectedWert == null)
				{
					JOptionPane.showMessageDialog(null, "C U later Alligator ;-D \n Die Heizung bleibt aus!!!"); 
				}
				else
				{
					JOptionPane.showMessageDialog
						(null,"Dragon Du bist ein Held! Die Heizung läuft! \nStufe "  + selectedWert + " wurde eingestellt.", "Heizugsregler", 2);
				}
			}	
			else
			{
				JOptionPane.showMessageDialog(null, "C U later Alligator ;-D"); 
			}
	
	}
}
	

