package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/pexels-roberto-nickson-2559941.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel Am1 = new JLabel("THE HOTEL WELCOMES YOU");
	Am1.setForeground(Color.WHITE);
        Am1.setFont(new Font("Tahoma", Font.PLAIN, 54));
	Am1.setBounds(100,250, 1000, 85);
	NewLabel.add(Am1);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu As = new JMenu("HOTEL MANAGEMENT");
        As.setForeground(Color.black);
	menuBar.add(As);
		
        JMenuItem reception1 = new JMenuItem("RECEPTION");
	As.add(reception1);
		
	JMenu As1 = new JMenu("ADMIN");
        As1.setForeground(Color.black);
	menuBar.add(As1);
        
        JMenuItem Fd3 = new JMenuItem("ADD EMPLOYEE");
	As1.add(Fd3);
        
        Fd3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem Fd1 = new JMenuItem("ADD ROOMS");
	As1.add(Fd1);
        
        Fd1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	reception1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem Fd2 = new JMenuItem("ADD DRIVERS");
	As1.add(Fd2);
        
	Fd2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
