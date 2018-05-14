/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Miraj
 */
public class YatzuMiraj extends JFrame implements ActionListener{

    JButton singleP = new JButton("Single Player");
    JButton multiP = new JButton("Multiplayer");
    JLabel name = new JLabel("Yahtzee ++");

    public YatzuMiraj() {
        design();
        multiP();
    }

    public void design() {

        setTitle("YahtzeeMains");
        setSize(700, 700);
        setLayout(new  GridLayout(3, 2));
        setLocationRelativeTo(null);

        add(name);
        add(singleP);
        add(multiP);
        this.getContentPane().setBackground(Color.gray.darker());
        name.setForeground(Color.white);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setHorizontalAlignment(JLabel.CENTER);
        singleP.setBackground(null);
        multiP.setBackground(null);
        singleP.setForeground(Color.white);
        multiP.setForeground(Color.white);
           singleP.setBorder(BorderFactory.createLineBorder(Color.blue.lightGray, 4));
         multiP.setBorder(BorderFactory.createLineBorder(Color.blue.lightGray, 4));
        

            
//        singleP.setBounds(200, 200, 150, 50);
//        multiP.setBounds(500, 200, 150, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void multiP() {
        multiP.addActionListener(this);
        singleP.addActionListener(this);

    }

    public static void main(String[] args) {

        YatzuMiraj sp = new YatzuMiraj();
        sp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == multiP) {
            SecondPlayer multi = new SecondPlayer();
            multi.setVisible(true);
            dispose();

        }
        if (e.getSource() == singleP) {
            OnePlayer single = new OnePlayer();
            single.setVisible(true);
            dispose();

        }
     }
}
