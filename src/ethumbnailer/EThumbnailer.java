package ethumbnailer;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import java.awt.*;
import static java.awt.Color.cyan;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author ErFaan Hussain
 */
public class EThumbnailer extends JFrame {
 JPanel conPanel=new JPanel();
 JPanel targetPanel=new JPanel();
 
 EThumbnailer()
 {
     initializeGUI();
 }
 
 private void initializeGUI()
 {
        setSize(1300,700);
       setLayout(new BorderLayout(0,100));
//       mainFrame.setFont(new Font(Font.SANS_SERIF));
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
//       mainFrame.setBackground(Color.GREEN);
       setResizable(false);
//       mainFrame.setFont(new Font("Courier", Font.BOLD,50));

       
       
       conPanel.setSize(new Dimension(600,640));
       conPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       
       targetPanel.setSize(new Dimension(1000,640));
       
       
       add(conPanel,BorderLayout.WEST);
       add(targetPanel,BorderLayout.EAST);
       
 }

    public static void main(String[] args) {
       new EThumbnailer();
       
      
    }
   
}

 
