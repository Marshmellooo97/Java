package GUI_FIN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class GUIprog2 implements ActionListener {

	JFrame gui = null;
	JPanel contentPanel = null;
	JButton b1, b2, b3, b4, b5, b6 = null;
	JLabel l1 = null;
	JPanel p1, p2, p3, p4 = null;
	JMenuBar menueBar = null;
	JMenu menue = null;
	JMenuItem mI1, mI2, mI3 = null;
	ArrayList<Integer> lipos = null;
	protected int counter = 0;

	public GUIprog2() {
		this.lipos = new ArrayList<Integer>();
		
		this.gui = new JFrame();
		this.contentPanel = new JPanel();
		this.p1 = new JPanel();
		this.p2 = new JPanel();
		this.p3 = new JPanel();
		this.p4 = new JPanel();
		this.gui.setContentPane(contentPanel);

		this.b1 = new JButton("Links1");
		this.b2 = new JButton("Links2");
		this.b3 = new JButton("Links3");
		this.b4 = new JButton("Rechts1");
		this.b5 = new JButton("Rechts2");
		this.b6 = new JButton("Rechts3");

		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b4.addActionListener(this);
		this.b5.addActionListener(this);
		this.b6.addActionListener(this);

		this.l1 = new JLabel("Links1 + Links2 + Links3 + Rechts1 klicken!");
		this.menueBar = new JMenuBar();
		this.menue = new JMenu("Datei");
		this.mI1 = new JMenuItem("Loesche Warteschlange");
		this.mI1.addActionListener(this);
		this.mI2 = new JMenuItem("Zeige Warteschlange");
		this.mI2.addActionListener(this);
		this.mI3 = new JMenuItem("Verlassen");
		this.mI3.addActionListener(this);
		this.menue.add(this.mI1);
		this.menue.add(this.mI2);
		this.menue.add(this.mI3);
		this.menueBar.add(this.menue);
		this.gui.setJMenuBar(menueBar);

		this.p1.add(this.b1);
		this.p1.add(this.b2);
		this.p1.add(this.b3);
		this.p2.add(this.b4);
		this.p2.add(this.b5);
		this.p2.add(this.b6);
		this.p3.add(this.p1);
		this.p3.add(this.p2);
		this.p1.setLayout(new BoxLayout(this.p1, BoxLayout.Y_AXIS));
		this.p2.setLayout(new BoxLayout(this.p2, BoxLayout.Y_AXIS));
		this.p3.setLayout(new BoxLayout(this.p3, BoxLayout.X_AXIS));
		this.p4.add(l1);
		this.contentPanel.add(p3);
		this.contentPanel.add(p4);
		this.contentPanel.setLayout(new BoxLayout(this.contentPanel, BoxLayout.Y_AXIS));
		gui.setSize(300, 200);
		this.gui.setVisible(true);

	}

	public static void main(String[] args) {

		GUIprog2 testGuIprog2 = new GUIprog2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == mI3) {
			System.exit(0);
		}
		if (e.getSource() == mI2) {
		
			System.out.println("Die Klickreihenfolge ist: ");
			
			for (Iterator<Integer> iterator = this.lipos.iterator(); iterator.hasNext();) {
				Integer zws = iterator.next();
				if (zws <= 3) {
					System.out.println("Links" + zws);
				}
				else {
					System.out.println("Rechts" + zws % 10);
				}
			}
		}
		if (e.getSource() == mI1) {
			this.lipos = new ArrayList<Integer>();
		}
		if (e.getSource() == b1) {
			this.lipos.add(1);
			if(counter == 0) counter++;
			else counter = 0;
		}
		if (e.getSource() == b2) {
			this.lipos.add(2);
			if(counter == 1) counter++;
			else counter = 0;
		}
		if (e.getSource() == b3) {
			this.lipos.add(3);
			if(counter == 2) counter++;
			else counter = 0;
		}
		if (e.getSource() == b4) {
			this.lipos.add(11);
			if(counter == 3) System.exit(0);
		}
		if (e.getSource() == b5) {
			this.lipos.add(12);		
		}
		if (e.getSource() == b6) {
			this.lipos.add(13);
		}

	}

}
