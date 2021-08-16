package debback2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class TurnMove extends Checker{
	
	int CHOICE;
	int CHOICE2;
	int indx;
	int num;
	public TurnMove(int f,int c,int c2, int i,int n) {
		super(f);
		
		CHOICE = c;
		CHOICE2 = c2;
		indx = i;
		num = n;

	}

	
	
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		System.out.println("in paint dice1 " + CHOICE);
		System.out.println("in paint dice2 " + CHOICE2);
		dice1(g, CHOICE);
		dice2(g, CHOICE2);
		if(CHOICE==CHOICE2)
		{
			dice3(g,CHOICE);
			dice4(g,CHOICE2);
		}
		
		cube(g,indx,num);
	}

	public int getChoice()
	{
		System.out.println("in getchoice1 dice1 " + CHOICE);
		return CHOICE;	
	}
	
	public int getChoice2()
	{
		
		System.out.println("in getchoice2 dice2 " + CHOICE2);
		return CHOICE2;
	}

	private void cube(Graphics g, int index,int value)
	{
		if(value==1)
			value = 64;
		String strval = Integer.toString(value);
		if(index == -1)
		{
			g.drawRect(352,197,30,30);
			g.setColor(Color.WHITE);
			g.fillRect(352,197,30,30);
			
			g.setColor(Color.RED);
			g.setFont(new Font("default", Font.BOLD, 16));
			g.drawString(strval, 360, 216);
		}
		else if(index==0)
		{
			g.drawRect(352,405,30,30);
			g.setColor(Color.WHITE);
			g.fillRect(352,405,30,30);
			
			g.setColor(Color.RED);
			g.setFont(new Font("default", Font.BOLD, 16));
			g.drawString(strval, 360, 424);
		}
		else if(index==1)
		{
			g.drawRect(352,35,30,30);
			g.setColor(Color.WHITE);
			g.fillRect(352,35,30,30);
			
			g.setColor(Color.RED);
			g.setFont(new Font("default", Font.BOLD, 16));
			g.drawString(strval, 360, 54);
		}
	}
	
	private void dice4(Graphics g, int choice4) {
		// TODO Auto-generated method stub
		switch(choice4)
		{
		case 1: 	g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
					
					g.drawOval(621, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(621, 221, 7, 7);
					break;
					
					
		case 2:     g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
			
					g.drawOval(615, 215, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(615, 215, 8, 8);
			
					g.drawOval(626, 226, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(626, 226, 7, 7);
					break;
		
		case 3:		g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
		
					g.drawOval(613, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(613, 213, 8, 8);
		
				
					g.drawOval(621, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(621, 221, 7, 7);
		
					g.drawOval(629, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 229, 7, 7);
					break;
		
		case 4:		g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
					
					g.drawOval(613, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(613, 213, 8, 8);
					
					g.drawOval(629, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 213, 7, 7);
			
					g.drawOval(629, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 229, 7, 7);
			
					g.drawOval(613, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(613, 229, 7, 7);
					break;
					
					
		case 5: 	g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
					
					g.drawOval(613, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(613, 213, 8, 8);
					
					g.drawOval(629, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 213, 7, 7);
					
					g.drawOval(621, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(621, 221, 7, 7);
			
					g.drawOval(629, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 229, 7, 7);
			
					g.drawOval(613, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(613, 229, 7, 7);
					break;
					
		case 6:		g.drawRect(610,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(610,210,30,30);
					
					g.drawOval(613, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(613, 213, 8, 8);
					
					g.drawOval(613, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(613, 221, 7, 7);
					
					g.drawOval(629, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 213, 7, 7);
			
					g.drawOval(629, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 229, 7, 7);
			
					g.drawOval(629, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(629, 221, 7, 7);
					
					g.drawOval(613, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(613, 229, 7, 7);
					break;
					
		
	}
		
	}



	private void dice3(Graphics g, int choice3) {
		// TODO Auto-generated method stub
		switch(choice3)
		{
		case 1: 	g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
					
					g.drawOval(251, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(251, 221, 7, 7);
					break;
					
					
		case 2:     g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
			
					g.drawOval(245, 215, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(245, 215, 8, 8);
			
					g.drawOval(256, 226, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(256, 226, 7, 7);
					break;
		
		case 3:		g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
		
					g.drawOval(243, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(243, 213, 8, 8);
		
				
					g.drawOval(251, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(251, 221, 7, 7);
		
					g.drawOval(259, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 229, 7, 7);
					break;
		
		case 4:		g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
					
					g.drawOval(243, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(243, 213, 8, 8);
					
					g.drawOval(259, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 213, 7, 7);
			
					g.drawOval(259, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 229, 7, 7);
			
					g.drawOval(243, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(243, 229, 7, 7);
					break;
					
					
		case 5: 	g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
					
					g.drawOval(243, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(243, 213, 8, 8);
					
					g.drawOval(259, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 213, 7, 7);
					
					g.drawOval(251, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(251, 221, 7, 7);
			
					g.drawOval(259, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 229, 7, 7);
			
					g.drawOval(243, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(243, 229, 7, 7);
					break;
					
		case 6:		g.drawRect(240,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(240,210,30,30);
					
					g.drawOval(243, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(243, 213, 8, 8);
					
					g.drawOval(243, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(243, 221, 7, 7);
					
					g.drawOval(259, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 213, 7, 7);
			
					g.drawOval(259, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 229, 7, 7);
			
					g.drawOval(259, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(259, 221, 7, 7);
					
					g.drawOval(243, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(243, 229, 7, 7);
					break;
					
		
	}
	}



	
	private void dice2(Graphics g, int choice2) {
		// TODO Auto-generated method stub
		
		switch(choice2)
		{
		case 1: 	g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
					
					g.drawOval(551, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(551, 221, 7, 7);
					break;
					
					
		case 2:     g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
			
					g.drawOval(545, 215, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(545, 215, 8, 8);
			
					g.drawOval(556, 226, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(556, 226, 7, 7);
					break;
		
		case 3:		g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
		
					g.drawOval(543, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(543, 213, 8, 8);
		
				
					g.drawOval(551, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(551, 221, 7, 7);
		
					g.drawOval(559, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 229, 7, 7);
					break;
		
		case 4:		g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
					
					g.drawOval(543, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(543, 213, 8, 8);
					
					g.drawOval(559, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 213, 7, 7);
			
					g.drawOval(559, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 229, 7, 7);
			
					g.drawOval(543, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(543, 229, 7, 7);
					break;
					
					
		case 5: 	g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
					
					g.drawOval(543, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(543, 213, 8, 8);
					
					g.drawOval(559, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 213, 7, 7);
					
					g.drawOval(551, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(551, 221, 7, 7);
			
					g.drawOval(559, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 229, 7, 7);
			
					g.drawOval(543, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(543, 229, 7, 7);
					break;
					
		case 6:		g.drawRect(540,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(540,210,30,30);
					
					g.drawOval(543, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(543, 213, 8, 8);
					
					g.drawOval(543, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(543, 221, 7, 7);
					
					g.drawOval(559, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 213, 7, 7);
			
					g.drawOval(559, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 229, 7, 7);
			
					g.drawOval(559, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(559, 221, 7, 7);
					
					g.drawOval(543, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(543, 229, 7, 7);
					break;
					
		
	}
	}

	public void dice1(Graphics g, int choice1)
	{
		
		switch(choice1)
		{
		case 1: 	g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
					
					g.drawOval(181, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(181, 221, 7, 7);
					break;
					
					
		case 2:     g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
			
					g.drawOval(175, 215, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(175, 215, 8, 8);
			
					g.drawOval(186, 226, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(186, 226, 7, 7);
					break;
		
		case 3:		g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
		
					g.drawOval(173, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(173, 213, 8, 8);
		
				
					g.drawOval(181, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(181, 221, 7, 7);
		
					g.drawOval(189, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 229, 7, 7);
					break;
		
		case 4:		g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
					
					g.drawOval(173, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(173, 213, 8, 8);
					
					g.drawOval(189, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 213, 7, 7);
			
					g.drawOval(189, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 229, 7, 7);
			
					g.drawOval(173, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(173, 229, 7, 7);
					break;
					
					
		case 5: 	g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
					
					g.drawOval(173, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(173, 213, 8, 8);
					
					g.drawOval(189, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 213, 7, 7);
					
					g.drawOval(181, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(181, 221, 7, 7);
			
					g.drawOval(189, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 229, 7, 7);
			
					g.drawOval(173, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(173, 229, 7, 7);
					break;
					
		case 6:		g.drawRect(170,210,30,30);
					g.setColor(Color.WHITE);
					g.fillRect(170,210,30,30);
					
					g.drawOval(173, 213, 8, 8);
					g.setColor(Color.BLACK);
					g.fillOval(173, 213, 8, 8);
					
					g.drawOval(173, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(173, 221, 7, 7);
					
					g.drawOval(189, 213, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 213, 7, 7);
			
					g.drawOval(189, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 229, 7, 7);
			
					g.drawOval(189, 221, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(189, 221, 7, 7);
					
					g.drawOval(173, 229, 7, 7);
					g.setColor(Color.BLACK);
					g.fillOval(173, 229, 7, 7);
					break;
					
		
	}
	}	

}
