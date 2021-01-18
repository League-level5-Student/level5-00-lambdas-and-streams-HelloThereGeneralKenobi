package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener((e)->{
			String answer1 = JOptionPane.showInputDialog("Add a number");
			String answer2 = JOptionPane.showInputDialog("Add another number");
			int sum = Integer.parseInt(answer1) + Integer.parseInt(answer2);
			System.out.println(sum);
		});
		
		randNumber.addActionListener((e)->{
			Random randGen = new Random();
			System.out.println(randGen.nextInt(100));
		});
		
		
		tellAJoke.addActionListener((e)->{
			System.out.println("Whats up with airplane food?");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
