import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TestFrame extends JFrame implements ActionListener,ItemListener{
	private JCheckBox[] rispCheckBox;
	private JRadioButton[] rispRadioButt;
	private String[] testoD;
	private JLabel[] etCorretta;
	private JLabel[] etDomande;
	public JButton invio;
	public Test test;
	
	public TestFrame() {
		super("Quiz");
		
		Test test = new Test(4);
		rispCheckBox = new JCheckBox[8];
		rispRadioButt = new JRadioButton[8];
		testoD = new String[4];
		etCorretta = new JLabel[5];
		for (int i = 0; i < 5; i++) {
			etCorretta[i] = new JLabel(" ");
		}
		invio = new JButton("Correggi");
		etDomande = new JLabel[4];
		
		for (int i = 0; i < 4; i++) {
	//		Domanda d = new Domanda(rS);
		}
		
		//Pannelli
		
		Container c = this.getContentPane();
		
		//Centrale
		JPanel pc = new JPanel(new GridLayout(4, 4));
		for(int i=0;i<4;i++){
			
		}
		c.add(pc);

		//Sud
		JPanel ps = new JPanel();
		ps.add(invio);
		ps.add(etCorretta[4]);
		c.add(ps, "South");
		
		setSize(400,400);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new TestFrame();
	}
	
	public void actionPerformed(ActionEvent arg0) {
	
	}
	
	public void itemStateChanged(ItemEvent arg0) {
	
	}
}
