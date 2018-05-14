/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OnePlayer extends JFrame implements ActionListener,MouseListener{
   
    Catagories sg = new Catagories();
    int anotherPlayerCount = 1;
 
    JPanel dicePanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JPanel scorePanel = new JPanel();

    JButton up = new JButton("U P"), down = new JButton("D O W N"), multiply = new JButton("2 D O U B L E"), rollPlus = new JButton("Add Roll");
    JLabel firstPlayer = new JLabel("Player1");
    JButton rollButton = new JButton("Roll");
    JButton submitButton = new JButton("Submit");
    JTextField arrayptxt[] = new JTextField[13];
    
    
///////for the first player textfield
    JTextField p1txt = new JTextField();
    JTextField p1txt2 = new JTextField();
    JTextField p1txt3 = new JTextField();
    JTextField p1txt4 = new JTextField();
    JTextField p1txt5 = new JTextField();
    JTextField p1txt6 = new JTextField();
    JTextField p1txt7 = new JTextField();
    JTextField p1txt8 = new JTextField();
    JTextField p1txt9 = new JTextField();
    JTextField p1txt10 = new JTextField();
    JTextField p1txt11 = new JTextField();
    JTextField p1txt12 = new JTextField();
    JTextField p1txt13 = new JTextField();
    JTextField p1total1 = new JTextField();
 
    int playerOneTotal, playerTwoTotal, valueAces1, valueTwos1, valueThrees1, valueFours1, valueFive1, valueSixs1, valueSeven1, valueEight1, valueNine1, valueTen1, valueEleven1, valueTwelve1, valueThirteen1;
/////////for first player label
    JLabel p1upersection = new JLabel("Upper Score");
    JLabel aces = new JLabel("Aces");
    JLabel twos = new JLabel("Twos");
    JLabel thrice = new JLabel("Threes");
    JLabel fours = new JLabel("Fours");
    JLabel fives = new JLabel("Fives");
    JLabel sixs = new JLabel("Sixes");
    JLabel p1total = new JLabel("Total1");

    JLabel p1lowersection = new JLabel("lower Score");
    JLabel threeofaKinds = new JLabel("Three of kinds");
    JLabel fOurofakinds = new JLabel("Four of kinds");
    JLabel fullHouse = new JLabel("Full House");
    JLabel smallStraight = new JLabel("Small Straight");
    JLabel largeStraight = new JLabel("Large Straight");
    JLabel yahtzee = new JLabel("Yahtzee");
    JLabel chance = new JLabel("Chance");


    ScoreCalculate src = new ScoreCalculate();
    //////for dice image
    int counterRoll;
    int submitCounter;

    public OnePlayer() {

        yahtzeeGUI();
        src.firstDdiceImage();
        mouseAndactionListener();
        firstPlayer.setEnabled(true);
        firstPlayer.setForeground(Color.green);

        ////////////////////////////addlistener////////
        rollButton.addActionListener(this);
        submitButton.addActionListener(this);

        /////////////////////////////////////
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
       this.addWindowListener(new WindowAdapter(){
           
           @Override
            public void windowClosing(WindowEvent e){
                int action =JOptionPane.showConfirmDialog(null, "Are you sure you want to exit to menu?","Exit Game?",JOptionPane.YES_NO_OPTION);
               
                if(action==YES_OPTION){
                    YatzuMiraj mul =  new YatzuMiraj();
                    mul.setVisible(true);
                    dispose();              }
           }
       });
    }

    private void yahtzeeGUI() {

        setTitle("Yahtzee");
        setSize(1050, 700);
        setLayout(null);
        setLocationRelativeTo(null);
        ////////label
        add(firstPlayer);

        add(p1upersection);
        add(aces);
        add(twos);
        add(thrice);
        add(fours);
        add(fives);
        add(sixs);
        add(p1lowersection);
        add(threeofaKinds);
        add(fOurofakinds);
        add(smallStraight);
        add(largeStraight);
        add(fullHouse);
        add(yahtzee);
        add(chance);
        add(rollButton);
        add(submitButton);
        add(p1total);
        add(up);
        add(down);
        add(multiply);
        add(rollPlus);

        firstPlayer.setFont(new Font("Arial", Font.BOLD, 40));
        add(p1txt);
        add(p1txt2);
        add(p1txt3);
        add(p1txt4);
        add(p1txt5);
        add(p1txt6);
        add(p1txt7);
        add(p1txt8);
        add(p1txt9);
        add(p1txt10);
        add(p1txt11);
        add(p1txt12);
        add(p1txt13);
        add(p1total1);

        
        /////////txtfield p1
        dicePanel.setBackground(Color.green.black);
        p1upersection.setBounds(116, 70, 100, 20);
        p1lowersection.setBounds(301, 70, 100, 20);
        firstPlayer.setBounds(200, 370, 300, 80);
        p1txt.setBounds(146, 110, 59, 30);
        p1txt2.setBounds(146, 150, 59, 30);
        p1txt3.setBounds(146, 190, 59, 30);
        p1txt4.setBounds(146, 230, 59, 30);
        p1txt5.setBounds(146, 270, 59, 30);
        p1txt6.setBounds(146, 310, 59, 30);
        p1total1.setBounds(146, 350, 59, 30);
       
        p1txt7.setBounds(350, 110, 59, 30);
        p1txt8.setBounds(350, 150, 59, 30);
        p1txt9.setBounds(350, 190, 59, 30);
        p1txt10.setBounds(350, 230, 59, 30);
        p1txt11.setBounds(350, 270, 59, 30);
        p1txt12.setBounds(350, 310, 59, 30);
        p1txt13.setBounds(350, 350, 59, 30);

        aces.setBounds(100, 120, 80, 14);
        twos.setBounds(100, 160, 80, 14);
        thrice.setBounds(100, 200, 80, 14);
        fours.setBounds(100, 240, 80, 14);
        fives.setBounds(100, 280, 80, 14);
        sixs.setBounds(100, 320, 80, 14);
        p1total.setBounds(100, 360, 80, 14);
       
        threeofaKinds.setBounds(250, 120, 95, 14);
        fOurofakinds.setBounds(250, 160, 90, 14);
        fullHouse.setBounds(250, 200, 80, 14);
        smallStraight.setBounds(250, 240, 90, 14);
        largeStraight.setBounds(250, 280, 90, 14);
        yahtzee.setBounds(250, 320, 80, 14);
        chance.setBounds(250, 360, 80, 14);

        p1upersection.setForeground(Color.white);
        p1lowersection.setForeground(Color.white);

        
        firstPlayer.setForeground(Color.white);

        //////////////////////////p1 player
        aces.setForeground(Color.white);
        twos.setForeground(Color.white);
        thrice.setForeground(Color.white);
        fours.setForeground(Color.white);
        fives.setForeground(Color.white);
        sixs.setForeground(Color.white);
        p1total.setForeground(Color.white);
      
        threeofaKinds.setForeground(Color.white);
        fOurofakinds.setForeground(Color.white);
        fullHouse.setForeground(Color.white);
        smallStraight.setForeground(Color.white);
        largeStraight.setForeground(Color.white);
        yahtzee.setForeground(Color.white);
        chance.setForeground(Color.white);



        dicePanel.setBounds(0, 450, 1110, 350);

        add(dicePanel);
        dicePanel.setLayout(null);
        dicePanel.add(src.diceImgArray[0]);
        dicePanel.add(src.diceImgArray[1]);
        dicePanel.add(src.diceImgArray[2]);
        dicePanel.add(src.diceImgArray[3]);
        dicePanel.add(src.diceImgArray[4]);

        src.diceImgArray[0].setBounds(20, 20, 200, 100);
        src.diceImgArray[1].setBounds(220, 20, 200, 100);
        src.diceImgArray[2].setBounds(410, 20, 200, 100);
        src.diceImgArray[3].setBounds(610, 20, 200, 100);
        src.diceImgArray[4].setBounds(810, 20, 200, 100);

        this.getContentPane().setBackground(Color.decode("#011a22"));
        src.diceImgArray[0].setFont(new Font("Arial", Font.BOLD, 80));
        src.diceImgArray[1].setFont(new Font("Arial", Font.BOLD, 80));
        src.diceImgArray[2].setFont(new Font("Arial", Font.BOLD, 80));
        src.diceImgArray[3].setFont(new Font("Arial", Font.BOLD, 80));
        src.diceImgArray[4].setFont(new Font("Arial", Font.BOLD, 80));
        rollButton.setBounds(10, 590, 100, 50);
        submitButton.setBounds(130, 590, 100, 50);

        up.setBounds(400, 590, 100, 50);
        down.setBounds(500, 590, 100, 50);
        multiply.setBounds(600, 590, 150, 50);
        rollPlus.setBounds(750, 590, 100, 50);
    }

    public void mouseAndactionListener() {
        
///////////image or the button lai action listener haleko and mouselistner too
        src.diceImgArray[0].addActionListener(this);
        src.diceImgArray[1].addActionListener(this);
        src.diceImgArray[2].addActionListener(this);
        src.diceImgArray[3].addActionListener(this);
        src.diceImgArray[4].addActionListener(this);

        src.diceImgArray[0].addMouseListener(this);
        src.diceImgArray[1].addMouseListener(this);
        src.diceImgArray[2].addMouseListener(this);
        src.diceImgArray[3].addMouseListener(this);
        src.diceImgArray[4].addMouseListener(this);

        ///////////////////power/////////////
        up.addActionListener(this);
        down.addActionListener(this);
        multiply.addActionListener(this);
        rollPlus.addActionListener(this);
        //////////////////////////////////

///////////////player one listener
        p1txt.addMouseListener(this);
        p1txt2.addMouseListener(this);
        p1txt3.addMouseListener(this);
        p1txt4.addMouseListener(this);
        p1txt5.addMouseListener(this);
        p1txt6.addMouseListener(this);
        p1total1.addMouseListener(this);
        p1txt7.addMouseListener(this);
        p1txt8.addMouseListener(this);
        p1txt9.addMouseListener(this);
        p1txt10.addMouseListener(this);
        p1txt11.addMouseListener(this);
        p1txt12.addMouseListener(this);
        p1txt13.addMouseListener(this);

    }

    public void imageSelection(ActionEvent e) {
        if (e.getSource() == src.diceImgArray[0]) {
            src.diceImgArray[0].setEnabled(false);

        }
        if (e.getSource() == src.diceImgArray[1]) {
            src.diceImgArray[1].setEnabled(false);

        }
        if (e.getSource() == src.diceImgArray[2]) {
            src.diceImgArray[2].setEnabled(false);

        }
        if (e.getSource() == src.diceImgArray[3]) {
            src.diceImgArray[3].setEnabled(false);

        }
        if (e.getSource() == src.diceImgArray[4]) {
            src.diceImgArray[4].setEnabled(false);

        }
    }

    public void imageDeselection(MouseEvent e) {
        if (e.getSource() == src.diceImgArray[0]) {
            src.diceImgArray[0].setEnabled(true);

        }
        if (e.getSource() == src.diceImgArray[1]) {
            src.diceImgArray[1].setEnabled(true);

        }
        if (e.getSource() == src.diceImgArray[2]) {
            src.diceImgArray[2].setEnabled(true);

        }
        if (e.getSource() == src.diceImgArray[3]) {
            src.diceImgArray[3].setEnabled(true);

        }
        if (e.getSource() == src.diceImgArray[4]) {
            src.diceImgArray[4].setEnabled(true);

        }
    }

  
    public void finishGame() {
        playerTwoTotal =150;
        src.generateDiceImage();
        src.diceImgArray[0].setEnabled(true);
        src.diceImgArray[1].setEnabled(true);
        src.diceImgArray[2].setEnabled(true);
        src.diceImgArray[3].setEnabled(true);
        src.diceImgArray[4].setEnabled(true);
        
        submitCounter++;
        if (submitCounter > 13) {
            rollButton.setVisible(false);
            submitButton.setVisible(false);
            if (playerOneTotal > playerTwoTotal) {
                JOptionPane.showMessageDialog(null, "Player One is W I N N E R");
            }
            if (playerTwoTotal > playerOneTotal) {
                JOptionPane.showMessageDialog(null, "Player One is W I N N E R");
            }

            submitCounter = 0;

        }
    }

    public void allTotal() {
        if (firstPlayer.isEnabled() == true) {

            playerOneTotal = valueAces1 + valueTwos1 + valueThrees1 + valueFours1 + valueFive1 + valueSixs1 + valueSeven1 + valueEight1 + valueNine1 + valueTen1 + valueEleven1 + valueTwelve1 + valueThirteen1;
            p1total1.setText("" + (playerOneTotal));
        }
    }
 
      @Override
    public void actionPerformed(ActionEvent e) {
        imageSelection(e);

        if (e.getSource() == rollButton) {
            src.ttm.start();
            src.counter = 0;
            counterRoll++;
            if (counterRoll == 3) {
                rollButton.setEnabled(false);

            }
        }

        if (e.getSource() == submitButton) {
            if(counterRoll==3){
            anotherPlayerCount++;
            rollButton.setEnabled(true);
            counterRoll = 0;
            rollButton.setVisible(true);
            finishGame();
               multiply.setEnabled(true);
                        up.setEnabled(true);
                         down.setEnabled(true);
                          rollPlus.setEnabled(true);
            }else{
            
                JOptionPane.showMessageDialog(null,"Please complete your roll");
            
            }
        }
        
        ////////////////////////power....control
        if(e.getSource() == up){
            if(up.isEnabled() == true){
             if (src.diceImgArray[0].isEnabled() == false) {
                        src.diceImgArray[0].setIcon(new ImageIcon(src.imageDice[src.guessRandom[0]]));//
                      src.diceImgArray[0].setText("" + (src.guessRandom[0] + 1));
                     src.guessRandom[0]=(src.guessRandom[0] + 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();
                    }
               if (src.diceImgArray[1].isEnabled() == false) {
                        src.diceImgArray[1].setIcon(new ImageIcon(src.imageDice[src.guessRandom[1]]));//
                      src.diceImgArray[1].setText("" + (src.guessRandom[1] + 1));
                     src.guessRandom[1]=(src.guessRandom[1] + 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();
                    }
                 if (src.diceImgArray[2].isEnabled() == false) {
                        src.diceImgArray[2].setIcon(new ImageIcon(src.imageDice[src.guessRandom[2]]));//
                      src.diceImgArray[2].setText("" + (src.guessRandom[2] + 1));
                     src.guessRandom[2]=(src.guessRandom[2] + 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();
                    }
                   if (src.diceImgArray[3].isEnabled() == false) {
                        src.diceImgArray[3].setIcon(new ImageIcon(src.imageDice[src.guessRandom[3]]));//
                      src.diceImgArray[3].setText("" + (src.guessRandom[3] + 1));
                     src.guessRandom[3]=(src.guessRandom[3] + 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();
                    }
                     if (src.diceImgArray[4].isEnabled() == false) {
                        src.diceImgArray[4].setIcon(new ImageIcon(src.imageDice[src.guessRandom[4]]));//
                      src.diceImgArray[4].setText("" + (src.guessRandom[4] + 1));
                     src.guessRandom[4]=(src.guessRandom[4] + 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();
                    }
            }
        
           multiply.setEnabled(false);
                        up.setEnabled(false);
                         down.setEnabled(false);
                          rollPlus.setEnabled(false);
        }
        
         if(e.getSource() == down){
            if(up.isEnabled() == true){
             if (src.diceImgArray[0].isEnabled() == false) {
                        src.diceImgArray[0].setIcon(new ImageIcon(src.imageDice[src.guessRandom[0]-2]));//
                      src.diceImgArray[0].setText("" + (src.guessRandom[0] - 1));
                     src.guessRandom[0]=(src.guessRandom[0] - 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();

                    }
             if (src.diceImgArray[1].isEnabled() == false) {
                        src.diceImgArray[1].setIcon(new ImageIcon(src.imageDice[src.guessRandom[1]-2]));//
                      src.diceImgArray[1].setText("" + (src.guessRandom[1] - 1));
                     src.guessRandom[1]=(src.guessRandom[1] - 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();

                    }
             if (src.diceImgArray[2].isEnabled() == false) {
                        src.diceImgArray[2].setIcon(new ImageIcon(src.imageDice[src.guessRandom[2]-2]));//
                      src.diceImgArray[2].setText("" + (src.guessRandom[02] - 1));
                     src.guessRandom[2]=(src.guessRandom[2] - 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();

                    }
             if (src.diceImgArray[3].isEnabled() == false) {
                        src.diceImgArray[3].setIcon(new ImageIcon(src.imageDice[src.guessRandom[3]-2]));//
                      src.diceImgArray[3].setText("" + (src.guessRandom[3] - 1));
                     src.guessRandom[3]=(src.guessRandom[3] - 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();

                    }
             if (src.diceImgArray[4].isEnabled() == false) {
                        src.diceImgArray[4].setIcon(new ImageIcon(src.imageDice[src.guessRandom[4]-2]));//
                      src.diceImgArray[4].setText("" + (src.guessRandom[4] - 1));
                     src.guessRandom[4]=(src.guessRandom[4] - 1);
                      rollButton.setVisible(false);
                      submitButton.setVisible(true);
                     allTotal();

                    }
            
            
            }
           multiply.setEnabled(false);
                        up.setEnabled(false);
                         down.setEnabled(false);
                          rollPlus.setEnabled(false);
        
        }
         
         if(e.getSource() == multiply){
               if (multiply.isEnabled() == true) {
                    if (firstPlayer.isEnabled() == true) {
                        p1txt.setText("" + (valueAces1 * 2));
                        p1txt2.setText("" + (valueTwos1 * 2));
                        p1txt3.setText("" + (valueThrees1 * 2));
                        p1txt4.setText("" + (valueFours1 * 2));
                        p1txt5.setText("" + (valueFive1 * 2));
                        p1txt6.setText("" + (valueSixs1 * 2));

                        valueAces1 = (valueAces1 * 2);
                        valueTwos1 =(valueTwos1 * 2);
                        valueThrees1 =(valueThrees1 * 2);
                        valueFours1 = (valueFours1 * 2);
                        valueFive1 = (valueFive1 * 2);
                        valueSixs1 = (valueSixs1 * 2);
                       allTotal();
                     
                    }

                       multiply.setEnabled(false);
                        up.setEnabled(false);
                         down.setEnabled(false);
                          rollPlus.setEnabled(false);
                }

         }
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == p1txt) {
            if (firstPlayer.isEnabled() == true) {
                sg.setAces(src.valuesAces());
                p1txt.setText("" + (sg.getAces()));
                valueAces1 = sg.getAces();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt2) {
            if (firstPlayer.isEnabled() == true) {
                sg.setTwos(src.valuesTwos());
                p1txt2.setText("" + (sg.getTwos()));
                valueTwos1 = sg.getTwos();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                  counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }

        if (e.getSource() == p1txt3) {
            if (firstPlayer.isEnabled() == true) {
                sg.setThrees(src.valuesThrees());
                p1txt3.setText("" + (sg.getThrees()));
                valueThrees1 = sg.getThrees();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                  counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt4) {
            if (firstPlayer.isEnabled() == true) {
                sg.setFours(src.valuesFours());
                p1txt4.setText("" + (sg.getFours()));
                valueFours1 = sg.getFours();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt5) {
            if (firstPlayer.isEnabled() == true) {
                sg.setFives(src.valuesFives());
                p1txt5.setText("" + (sg.getFives()));
                valueFive1 = sg.getThrees();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt6) {
            if (firstPlayer.isEnabled() == true) {
                sg.setSixes(src.valuesSixs());
                p1txt6.setText("" + (sg.getSixes()));
                valueSixs1 = sg.getSixes();

                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt7) {
            if (firstPlayer.isEnabled() == true) {
                sg.settOfkinds(src.valuesThreeofakinds());
                p1txt7.setText("" + (sg.gettOfkinds()));
                valueSeven1 = sg.gettOfkinds();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt8) {
            if (firstPlayer.isEnabled() == true) {
                sg.setfOfkinds(src.valuesFourofakinds());
                p1txt8.setText("" + (sg.getfOfkinds()));
                valueEight1 = sg.getfOfkinds();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt9) {
            if (firstPlayer.isEnabled() == true) {
                sg.setFullHouse(src.valuesFullHouse());
                p1txt9.setText("" + (sg.getFullHouse()));
                valueNine1 = sg.getFullHouse();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt10) {
            if (firstPlayer.isEnabled() == true) {
                sg.setsStraight(src.valuessmallStraight());
                p1txt10.setText("" + (sg.getsStraight()));
                valueTen1 = sg.getsStraight();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt11) {
            if (firstPlayer.isEnabled() == true) {
                sg.setlStraight(src.valueslargeStraight());
                p1txt11.setText("" + (sg.getlStraight()));
                valueEleven1 = sg.getlStraight();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt12) {
            if (firstPlayer.isEnabled() == true) {
                sg.setYahtzeee(src.valuesYahtzeee());
                p1txt12.setText("" + (sg.getYahtzeee()));
                valueTwelve1 = sg.getYahtzeee();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt13) {
            if (firstPlayer.isEnabled() == true) {
                sg.setChance(src.valuesChance());
                p1txt13.setText("" + (sg.getChance()));
                valueThirteen1 = sg.getChance();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
       
    }
   
    @Override
    public void mousePressed(MouseEvent e) {
        imageDeselection(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
 
}
