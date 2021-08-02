package game_PP_01;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFrame extends JFrame
{	
	GamePanel panel;
	
	GameFrame()
	{
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("DRAGON PONG");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
