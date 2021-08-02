package heizung_JOption;

import javax.swing.JOptionPane;

public class SuperHeizung
{
	
	
	public void changeStufe2() 
	{	
		Object [] werte = { 1, 2, 3, 4, 5};
		Object selectedWert = JOptionPane.showInputDialog(null, "Bitte Stufe auswählen.", "Heizugsregler", JOptionPane.INFORMATION_MESSAGE, null, werte, werte[0]);
		JOptionPane.showMessageDialog(null,"Stufe "  + selectedWert + " wurde eingestellt.", "Heizugsregler", 2);
		
	}
	
	
}
