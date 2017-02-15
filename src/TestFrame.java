//Versione beta

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFrame extends JFrame implements ActionListener, ItemListener {
	private JCheckBox[] rispCheckBox;
	private JRadioButton[] rispRadioButt;
	private String[] testoD;
	private JLabel[] etCorretta;
	private JLabel[] etDomande;
	public JButton invio;
	public Test test;

	public TestFrame(Test t) {
		super("Test domande");

		Container c = getContentPane();

		test = t;
		testoD = new String[4];
		rispCheckBox = new JCheckBox[8];
		rispRadioButt = new JRadioButton[8];
		etDomande = new JLabel[4];
		etCorretta = new JLabel[5];

		for (int i = 0; i < 4; i++) {

			Domanda d = t.getDomanda(i);
			testoD[i] = d.getTesto();
			System.out.println(testoD[i]);
		}

		for (int i = 0; i < 5; i++) {
			etCorretta[i] = new JLabel(" ");
		}

		for (int i = 0; i < 4; i++) {
			etDomande[i] = new JLabel(testoD[i]);
		}

		// Creo bottoni risposte
		ButtonGroup bg = new ButtonGroup();
		for (int j = 0; j < 4; j++) {
			rispRadioButt[j] = new JRadioButton(t.getDomanda(0).getRisp(j));
			rispCheckBox[j] = new JCheckBox(t.getDomanda(2).getRisp(j));
			bg.add(rispRadioButt[j]);
			rispRadioButt[j].addItemListener(this);
			rispCheckBox[j].addItemListener(this);

		}
		ButtonGroup bg1 = new ButtonGroup();
		for (int j = 4, i = 0; j < 8; i++, j++) {
			rispRadioButt[j] = new JRadioButton(t.getDomanda(1).getRisp(i));
			rispCheckBox[j] = new JCheckBox(t.getDomanda(3).getRisp(i));
			bg1.add(rispRadioButt[j]);
			rispRadioButt[j].addItemListener(this);
			rispCheckBox[j].addItemListener(this);

		}

		invio = new JButton("Correggi");
		invio.addActionListener(this);

		int k = 0, l = 0;
		JPanel pc = new JPanel(new GridLayout(4, 1));
		JPanel[] pDom = new JPanel[4];
		for (int i = 0; i < 4; i++) {
			pDom[i] = new JPanel(new GridLayout(6, 1));
			pc.add(pDom[i]);
			pDom[i].add(etDomande[i]);

		}

		for (int i = 0; i < 4; i++) {
			pDom[0].add(rispRadioButt[i]);
			pDom[2].add(rispCheckBox[i]);
		}
		for (int i = 4; i < 8; i++) {
			pDom[1].add(rispRadioButt[i]);
			pDom[3].add(rispCheckBox[i]);
		}

		for (int i = 0; i < 4; i++) {
			pDom[i].add(etCorretta[i]);
		}

		JPanel ps = new JPanel();

		ps.add(invio);
		ps.add(etCorretta[4]);

		c.add(pc);
		c.add(ps, "South");

		setVisible(true);
		setSize(400, 400);
		setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object o = e.getItemSelectable();

		for (int i = 0; i < 4; i++) {
			if (o == rispRadioButt[i] && rispRadioButt[i].isSelected()) {
				test.getDomanda(0).setRispSelezionata(i);
				// System.out.println(test.getDomanda(0).getRispSelected());

			}
		}

		for (int i = 4; i < 8; i++) {
			if (o == rispRadioButt[i] && rispRadioButt[i].isSelected()) {
				test.getDomanda(1).setRispSelezionata(i - 4);
				// System.out.println(test.getDomanda(1).getRispSelected());

			}
		}
		for (int i = 0; i < 4; i++) {
			if (o == rispCheckBox[i] && rispCheckBox[i].isSelected()) {
				test.getDomanda(2).setRispSelezionataMult(i);
			}
		}

		for (int i = 4; i < 8; i++) {
			if (o == rispCheckBox[i] && rispCheckBox[i].isSelected()) {
				test.getDomanda(3).setRispSelezionataMult(i - 4);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (o == invio) {
			int[] vett = test.getDomanda(2).getRispSelectedMult();
			for (int i = 0; i < 4; i++) {
				System.out.println(vett[i]);
			}
			for (int i = 0; i < 4; i++) {
				Domanda d = test.getDomanda(i);
				if (d.isRispSing()) {
					if (d.getRispSelected() == d.getRispCorrSing()) {
						etCorretta[i].setText("Risposta corretta");
					} else {
						etCorretta[i].setText("Risposta sbagliata");
					}
				} else {
					if (d.getRispSelectedMult() == d.getRispCorrMul()) {
						etCorretta[i].setText("Risposta corretta");
					} else {
						etCorretta[i].setText("Risposta sbagliata");
					}
				}
			}

		}

	}

	public static void main(String[] args) {

		Test test = new Test(4);

		Domanda[] domande = new Domanda[4];
		boolean[] sing = { false, true, false, true };
		String[] risp1 = new String[4];
		String[] risp2 = new String[4];
		String[] risp3 = new String[4];
		String[] risp4 = new String[4];

		for (int i = 0; i < 4; i++) {
			domande[i] = new Domanda(4, ("Ciao" + i), sing[i]);

			risp1[i] = i + "";
			risp2[i] = i + "";
			risp3[i] = i + "";
			risp4[i] = i + "";

		}

		domande[0].setRisp(risp1);
		domande[0].setRispCorr(1);
		domande[1].setRisp(risp2);
		domande[1].setRispCorr(1);
		domande[2].setRisp(risp3);
		domande[2].setRispCorr(2);
		domande[2].setRispCorr(3);
		domande[3].setRisp(risp4);
		domande[3].setRispCorr(2);
		domande[3].setRispCorr(3);

		for (int i = 0; i < 4; i++) {
			test.addDomanda(domande[i]);

		}
		test.ordina();

		new TestFrame(test);

	}

}
