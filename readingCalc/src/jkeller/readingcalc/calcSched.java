package jkeller.readingcalc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcSched { 

	public static void UI() {
		JFrame window= new JFrame("Calculate Book Report");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
	    panel.setLayout(new FlowLayout());
		JLabel timeReadL= new JLabel("time to read");
		JLabel pagesReadL= new JLabel("pages read");
		JLabel pagesBookL= new JLabel("pages in book");
		JLabel daysRemainingL= new JLabel("days remaining");
		JButton sub=new JButton("submit");
		final JTextField timeReadT      =new JTextField("",5);
		final JTextField pagesReadT     =new JTextField("3",5);
		final JTextField pagesBookT     =new JTextField("",5);
		final JTextField daysRemainingT =new JTextField("",5);
		panel.add(timeReadL);
		panel.add(timeReadT);
		panel.add(pagesReadL);
		panel.add(pagesReadT);
		panel.add(pagesBookL);
		panel.add(pagesBookT);
		panel.add(daysRemainingL);
		panel.add(daysRemainingT);
		panel.add(sub);
		window.add(panel);
		window.setSize(400,600);
		window.setVisible(true);
		sub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent myaction) {
		if(!(timeReadT.getText().isEmpty())&&!pagesReadT.getText().isEmpty()&&!pagesBookT.getText().isEmpty()&&!daysRemainingT.getText().isEmpty()) {
			String timeRead=timeReadT.getText();
			String pagesRead     = pagesReadT.getText();
			String pagesBook     = pagesBookT.getText();
			String daysRemaining = daysRemainingT.getText();
			calc result=new calc(Integer.parseInt(pagesRead), Integer.parseInt(timeRead), Integer.parseInt(pagesBook),Integer.parseInt(daysRemaining));
			double display=result.calculate();
			JOptionPane.showMessageDialog(null,new Double(display).toString());
		}
		else {
			JOptionPane.showMessageDialog(null,"please fill out all text fields");
		}
		}});
	}
	public static void main(String[] args) {
	      javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                UI();
	            }
	        });}
}
 
