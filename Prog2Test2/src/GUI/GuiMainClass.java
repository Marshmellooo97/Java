package GUI;

import javax.swing.* ;
import java.awt.event.* ;

public class GuiMainClass implements ActionListener {
    JFrame main = null ;
    JPanel contentPane = null ;
    JLabel l1 = null ;
    JButton left1 = null ;
    JButton left2 = null ; 
    JButton left3 = null ; 
    JButton right1 = null ; 
    JButton right2 = null ; 
    JButton right3 = null ; 
    JPanel p1,p2,p3,p4 ;
    JMenu menu, submenu;  
    JMenuItem i1, i2, i3, i4, i5;  
    
    
    
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.left1) {
            System.out.println("Left1") ;
        }
        if (ae.getSource() == this.left2) {
            System.out.println("Left2") ;
        }
        if (ae.getSource() == this.left3) {
            System.out.println("Left3") ;
        }
        if (ae.getSource() == this.right1) {
            System.out.println("Right1") ;
        }
        if (ae.getSource() == this.right2) {
            System.out.println("Right2") ;
        }
        if (ae.getSource() == this.right3) {
            System.out.println("Right3") ;
        }
    }
    
    
    
    public GuiMainClass() {
        this.main = new JFrame("TEST-GUI") ;
        this.contentPane = new JPanel() ;
        this.main.setContentPane(this.contentPane) ;
       

        this.l1 = new JLabel("Left1+Left2+Left3+Right1 klicken!") ;
        
        
        this.left1 = new JButton("Left1");
        this.left2 = new JButton("Left2");
        this.left3 = new JButton("Left3");
        this.right1 = new JButton("Right1");
        this.right2 = new JButton("Right2");
        this.right3 = new JButton("Right3");
        
        this.left1.addActionListener(this);
        this.left2.addActionListener(this);
        this.left3.addActionListener(this);
        this.right1.addActionListener(this);
        this.right2.addActionListener(this);
        this.right3.addActionListener(this);
        
        
        this.p1 = new JPanel() ;
        this.p2 = new JPanel() ;
        this.p3 = new JPanel() ;
        this.p4 = new JPanel();
        this.contentPane.add(this.p1) ;
        this.contentPane.add(this.p2) ;
        this.contentPane.add(this.p3) ;
        this.contentPane.add(this.p4);
        
        this.p1.add(this.left1) ;
        this.p1.add(this.right1) ;
        this.p2.add(this.left2) ;      
        this.p2.add(this.right2) ;
        this.p3.add(this.left3);
        this.p3.add(this.right3);
        this.p4.add(this.l1);
        
        this.contentPane.setLayout(new BoxLayout(this.contentPane, BoxLayout.Y_AXIS)) ;
                
        this.main.setSize(300,200) ;
        this.main.setVisible(true) ;                      
    }

    public static void main(String[] args) {
        GuiMainClass g = new GuiMainClass() ;
    }

}