import java.awt.*;
import java.awt.event.*;

class Fdemo extends Frame implements ActionListener {
	
	Button button[] = new Button[9];
	Button button1; // New game
	
	int k = 0;
	int x = 8, y = 28;
	int a = 0; // 0 and X
	int l = 0;
	
	int z = 0, z1 = 0, z2 = 0, z3 = 0,
		z4 = 0, z5 = 0, z6 = 0, z7 = 0,
		z8 = 0;
		
	Fdemo(){
		
		setLayout(null);
		setVisible(true);
		setSize(800, 600);
		setLocation(400, 100);
		setBackground(Color.black);
		setForeground(Color.white);
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 3; j++) {
				
				button[k] = new Button();
				button[k].setSize(100, 100);
				button[k].setLocation(x, y);
				button[k].setFont(new Font("", Font.BOLD, 40));
				
				add(button[k]);
				
				button[k].addActionListener(this);
				button[k].setBackground(new Color(255, 141, 28)); // Orange
				k++;
				x += 100;
			}
			x = 8;
			y += 100;
		}
		
				button1 = new Button("New Game");
				button1.setSize(150, 40);
				button1.setLocation(500, 300);
				button1.setFont(new Font("", Font.BOLD, 20));
				
				add(button1);
				button1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// For new game
		if(e.getSource() == button1) {
			
			for(int i = 0; i <= 8; i++) {
				button[i].setLabel("");
			}
			
			z = 0; z1 = 0; z2 = 0; z3 = 0;
			z4 = 0; z5 = 0; z6 = 0; z7 = 0;
			z8 = 0;
		}
		
		// For the 9 buttons
		if(e.getSource() == button[0] && z == 0) {
			if(a % 2 == 0) {
				button[0].setLabel("O"); z++; a++;
			}
			else {
				button[0].setLabel("X"); z++; a++;
			}
		}
			
		if(e.getSource() == button[1] && z1 == 0) {
			if(a % 2 == 0) {
				button[1].setLabel("O"); z1++; a++;
			}
			else {
				button[1].setLabel("X"); z1++; a++;
			}
		}
			
		if(e.getSource() == button[2] && z2 == 0) {
			if(a % 2 == 0) {
				button[2].setLabel("O"); z2++; a++;
			}
			else {
				button[2].setLabel("X"); z2++; a++;
			}
		}
			
		if(e.getSource() == button[3] && z3 == 0) {
			if(a % 2 == 0) {
				button[3].setLabel("O"); z3++; a++;
			}
			else {
				button[3].setLabel("X"); z3++; a++;
			}
		}
			
		if(e.getSource() == button[4] && z4 == 0) {
			if(a % 2 == 0) {
				button[4].setLabel("O"); z4++; a++;
			}
			else {
				button[4].setLabel("X"); z4++; a++;
			}
		}
			
		if(e.getSource() == button[5] && z5 == 0) {
			if(a % 2 == 0) {
				button[5].setLabel("O"); z5++; a++;
			}
			else {
				button[5].setLabel("X"); z5++; a++;
			}
		}
			
		if(e.getSource() == button[6] && z6 == 0) {
			if(a % 2 == 0) {
				button[6].setLabel("O"); z6++; a++;
			}
			else {
				button[6].setLabel("X"); z6++; a++;
			}
		}
			
		if(e.getSource() == button[7] && z7 == 0) {
			if(a % 2 == 0) {
				button[7].setLabel("O"); z7++; a++;
			}
			else {
				button[7].setLabel("X"); z7++; a++;
			}
		}	
		if(e.getSource() == button[8] && z8 == 0) {
			if(a % 2 == 0) {
				button[8].setLabel("O"); z8++; a++;
			}
			else {
				button[8].setLabel("X"); z8++; a++;
			}
		}
		// Winning Conditions
		
		Font f = new Font("",Font.BOLD,20);
		
		if(button[0].getLabel() == button[1].getLabel() && button[0].getLabel() == button[2].getLabel()) {
			
			if(button[0].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[0].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		if(button[3].getLabel() == button[4].getLabel() && button[4].getLabel() == button[5].getLabel()) {
			
			if(button[3].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[3].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		
		if(button[6].getLabel() == button[7].getLabel() && button[6].getLabel() == button[8].getLabel()) {
			
			if(button[6].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[6].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			if(button[6].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		
		if(button[0].getLabel() == button[3].getLabel() && button[0].getLabel() == button[6].getLabel()) {
			
			if(button[0].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[0].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		
		if(button[1].getLabel() == button[4].getLabel() && button[1].getLabel() == button[7].getLabel()) {
			
			if(button[1].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[1].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		
		if(button[2].getLabel() == button[5].getLabel() && button[5].getLabel() == button[8].getLabel()) {
			
			if(button[2].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[2].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		
		if(button[0].getLabel() == button[4].getLabel() && button[0].getLabel() == button[8].getLabel()) {
			
			if(button[0].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[0].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
		if(button[2].getLabel() == button[4].getLabel() && button[4].getLabel() == button[6].getLabel()) {
			
			if(button[2].getLabel() == "O") {
				Label p1 = new Label("Player 1 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
			
			if(button[2].getLabel() == "X") {
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150, 50);
				p1.setLocation(320, l);
				p1.setFont(f);
				add(p1);
				l += 50;
			}
		}
	}
}

public class tictactoe {
	
	public static void main(String args[]){
		
		Fdemo frame = new Fdemo();
	}
	
}