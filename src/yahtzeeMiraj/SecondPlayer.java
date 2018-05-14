package yahtzeeMiraj;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondPlayer extends JFrame implements ActionListener, MouseListener {

    Catagories sg = new Catagories();
    int anotherPlayerCount = 1;
 
    JPanel dicePanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JPanel scorePanel = new JPanel();

    JButton up = new JButton("U P"), down = new JButton("D O W N"), multiply = new JButton("2 D O U B L E"), rollPlus = new JButton("Add Roll");

    JLabel firstPlayer = new JLabel("Player1");
    JLabel secondPlayer = new JLabel("Player2");
    JButton rollButton = new JButton("Roll");
    JButton submitButton = new JButton("Submit");
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
    //////for the second player textfield
    JTextField p2txt1 = new JTextField();
    JTextField p2txt2 = new JTextField();
    JTextField p2txt3 = new JTextField();
    JTextField p2txt4 = new JTextField();
    JTextField p2txt5 = new JTextField();
    JTextField p2txt6 = new JTextField();
    JTextField p2txt7 = new JTextField();
    JTextField p2txt8 = new JTextField();
    JTextField p2txt9 = new JTextField();
    JTextField p2txt10 = new JTextField();
    JTextField p2txt11 = new JTextField();
    JTextField p2txt12 = new JTextField();
    JTextField p2txt13 = new JTextField();
    JTextField p2total1 = new JTextField();

    int playerOneTotal, playerTwoTotal, valueAces1, valueTwos1, valueThrees1, valueFours1, valueFive1, valueSixs1, valueSeven1, valueEight1, valueNine1, valueTen1, valueEleven1, valueTwelve1, valueThirteen1,
            valueAces2, valueTwos2, valueThrees2, valueFours2, valueFive2, valueSixs2, valueSeven2, valueEight2, valueNine2, valueTen2,
            valueEleven2, valueTwelve2, valueThirteen2;
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

    /////////for second player label
    JLabel p2upersection = new JLabel("Upper Score");
    JLabel paces = new JLabel("Aces");
    JLabel ptwos = new JLabel("Twos");
    JLabel pthrice = new JLabel("Threes");
    JLabel pfours = new JLabel("Fours");
    JLabel pfives = new JLabel("Fives");
    JLabel psixs = new JLabel("Sixes");
    JLabel pp1total = new JLabel("Total1");

    JLabel p2lowersection = new JLabel("lower Score");
    JLabel pthreeofaKinds = new JLabel("Three of kinds");
    JLabel pfOurofakinds = new JLabel("Four of kinds");
    JLabel pfullHouse = new JLabel("Full House");
    JLabel psmallStraight = new JLabel("Small Straight");
    JLabel plargeStraight = new JLabel("Large Straight");
    JLabel pyahtzee = new JLabel("Yahtzee");
    JLabel pchance = new JLabel("Chance");
    ScoreCalculate src = new ScoreCalculate();
    //////for dice image
    int counterRoll;
    int submitCounter;

    public SecondPlayer() {

        yahtzeeGUI();
        src.firstDdiceImage();
        mouseAndactionListener();
        firstPlayer.setEnabled(true);
        firstPlayer.setForeground(Color.magenta);
        secondPlayer.setEnabled(false);

        ////////////////////////////addlistener////////
        rollButton.addActionListener(this);
        submitButton.addActionListener(this);

        /////////////////////////////////////
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        secondPlayer.setFont(new Font("Arial", Font.BOLD, 40));
        //////p2
        add(secondPlayer);
        add(p2upersection);
        add(paces);
        add(ptwos);
        add(pthrice);
        add(pfours);
        add(pfives);
        add(psixs);
        add(p2lowersection);
        add(pthreeofaKinds);
        add(pfOurofakinds);
        add(psmallStraight);
        add(plargeStraight);
        add(pfullHouse);
        add(pyahtzee);
        add(pchance);
        add(pp1total);

        /////////////////////////////////////////////////
        /////////////////txt for p1
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

        /////////// txtfield p2
        add(p2txt1);
        add(p2txt2);
        add(p2txt3);
        add(p2txt4);
        add(p2txt5);
        add(p2txt6);
        add(p2txt7);
        add(p2txt8);
        add(p2txt9);
        add(p2txt10);
        add(p2txt11);
        add(p2txt12);
        add(p2txt13);
        add(p2total1);

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
        /////////////////////p2
        secondPlayer.setBounds(660, 370, 300, 80);
        p2upersection.setBounds(550, 70, 100, 20);
        p2lowersection.setBounds(800, 70, 100, 20);
        p2txt1.setBounds(600, 110, 59, 30);
        p2txt2.setBounds(600, 150, 59, 30);
        p2txt3.setBounds(600, 190, 59, 30);
        p2txt4.setBounds(600, 230, 59, 30);
        p2txt5.setBounds(600, 270, 59, 30);
        p2txt6.setBounds(600, 310, 59, 30);
        p2total1.setBounds(600, 350, 59, 30);

        //////////////////////////////////p1 player
        p1txt7.setBounds(350, 110, 59, 30);
        p1txt8.setBounds(350, 150, 59, 30);
        p1txt9.setBounds(350, 190, 59, 30);
        p1txt10.setBounds(350, 230, 59, 30);
        p1txt11.setBounds(350, 270, 59, 30);
        p1txt12.setBounds(350, 310, 59, 30);
        p1txt13.setBounds(350, 350, 59, 30);

        /////////////////////p2 player
        p2txt7.setBounds(800, 110, 59, 30);
        p2txt8.setBounds(800, 150, 59, 30);
        p2txt9.setBounds(800, 190, 59, 30);
        p2txt10.setBounds(800, 230, 59, 30);
        p2txt11.setBounds(800, 270, 59, 30);
        p2txt12.setBounds(800, 310, 59, 30);
        p2txt13.setBounds(800, 350, 59, 30);

        //////////////////////////p1 player
        aces.setBounds(100, 120, 80, 14);
        twos.setBounds(100, 160, 80, 14);
        thrice.setBounds(100, 200, 80, 14);
        fours.setBounds(100, 240, 80, 14);
        fives.setBounds(100, 280, 80, 14);
        sixs.setBounds(100, 320, 80, 14);
        p1total.setBounds(100, 360, 80, 14);
        ///////////////////////////p2 player
        paces.setBounds(550, 120, 80, 14);
        ptwos.setBounds(550, 160, 80, 14);
        pthrice.setBounds(550, 200, 80, 14);
        pfours.setBounds(550, 240, 80, 14);
        pfives.setBounds(550, 280, 80, 14);
        psixs.setBounds(550, 320, 80, 14);
        pp1total.setBounds(550, 360, 80, 14);
////////////////////////////////////p1 player
        threeofaKinds.setBounds(250, 120, 95, 14);
        fOurofakinds.setBounds(250, 160, 90, 14);
        fullHouse.setBounds(250, 200, 80, 14);
        smallStraight.setBounds(250, 240, 90, 14);
        largeStraight.setBounds(250, 280, 90, 14);
        yahtzee.setBounds(250, 320, 80, 14);
        chance.setBounds(250, 360, 80, 14);

        p1upersection.setForeground(Color.white);
        p1lowersection.setForeground(Color.white);
        p2upersection.setForeground(Color.white);
        p2lowersection.setForeground(Color.white);
//////////////////////////for the second player
        pthreeofaKinds.setForeground(Color.white);
        pfOurofakinds.setForeground(Color.white);
        pfullHouse.setForeground(Color.white);
        psmallStraight.setForeground(Color.white);
        plargeStraight.setForeground(Color.white);
        pyahtzee.setForeground(Color.white);
        pchance.setForeground(Color.white);

        firstPlayer.setForeground(Color.white);
        secondPlayer.setForeground(Color.white);
        //////////////////////////p1 player
        aces.setForeground(Color.white);
        twos.setForeground(Color.white);
        thrice.setForeground(Color.white);
        fours.setForeground(Color.white);
        fives.setForeground(Color.white);
        sixs.setForeground(Color.white);
        p1total.setForeground(Color.white);
        ///////////////////////////p2 player
        paces.setForeground(Color.white);
        ptwos.setForeground(Color.white);
        pthrice.setForeground(Color.white);
        pfours.setForeground(Color.white);
        pfives.setForeground(Color.white);
        psixs.setForeground(Color.white);
        pp1total.setForeground(Color.white);
////////////////////////////////////p1 player
        threeofaKinds.setForeground(Color.white);
        fOurofakinds.setForeground(Color.white);
        fullHouse.setForeground(Color.white);
        smallStraight.setForeground(Color.white);
        largeStraight.setForeground(Color.white);
        yahtzee.setForeground(Color.white);
        chance.setForeground(Color.white);

//////////////////////////for the second player
        pthreeofaKinds.setBounds(700, 120, 90, 14);
        pfOurofakinds.setBounds(700, 160, 90, 14);
        pfullHouse.setBounds(700, 200, 80, 14);
        psmallStraight.setBounds(700, 240, 90, 14);
        plargeStraight.setBounds(700, 280, 90, 14);
        pyahtzee.setBounds(700, 320, 80, 14);
        pchance.setBounds(700, 360, 80, 14);

        dicePanel.setBounds(0, 450, 1110, 350);

        add(dicePanel);
        dicePanel.setLayout(new FlowLayout());
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
////////////////////////player two
        p2txt1.addMouseListener(this);
        p2txt2.addMouseListener(this);
        p2txt3.addMouseListener(this);
        p2txt4.addMouseListener(this);
        p2txt5.addMouseListener(this);
        p2txt6.addMouseListener(this);
        p2total1.addMouseListener(this);
        p2txt7.addMouseListener(this);
        p2txt8.addMouseListener(this);
        p2txt9.addMouseListener(this);
        p2txt10.addMouseListener(this);
        p2txt11.addMouseListener(this);
        p2txt12.addMouseListener(this);
        p2txt13.addMouseListener(this);
    }

    public void anotherPlayer() {

        if (anotherPlayerCount == 1) {
            firstPlayer.setEnabled(true);
            secondPlayer.setEnabled(false);
            System.out.println("first");
            firstPlayer.setForeground(Color.green);
            secondPlayer.setForeground(null);
        }
        if (anotherPlayerCount == 2) {
            secondPlayer.setEnabled(true);
            firstPlayer.setEnabled(false);
            firstPlayer.setForeground(null);
            secondPlayer.setForeground(Color.green);
            anotherPlayerCount = 0;
        }
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
        src.generateDiceImage();
        src.diceImgArray[0].setEnabled(true);
        src.diceImgArray[1].setEnabled(true);
        src.diceImgArray[2].setEnabled(true);
        src.diceImgArray[3].setEnabled(true);
        src.diceImgArray[4].setEnabled(true);
        
        submitCounter++;
        if (submitCounter > 26) {
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
        if (secondPlayer.isEnabled() == true) {
            playerTwoTotal = valueAces2 + valueTwos2 + valueThrees2 + valueFours2 + valueFive2 + valueSixs2 + valueSeven2 + valueEight2 + valueNine2 + valueTen2 + valueEleven2 + valueTwelve2 + valueThirteen2;
            p2total1.setText("" + (playerTwoTotal));
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
            anotherPlayer();
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

                     if (secondPlayer.isEnabled() == true) {
                        p2txt1.setText("" + (valueAces2 * 2));
                        p2txt2.setText("" + (valueTwos2 * 2));
                        p2txt3.setText("" + (valueThrees2 * 2));
                        p2txt4.setText("" + (valueFours2 * 2));
                        p2txt5.setText("" + (valueFive2 * 2));
                        p2txt6.setText("" + (valueSixs2 * 2));

                        valueAces2 = (valueAces2 * 2);
                        valueTwos2 =(valueTwos2 * 2);
                        valueThrees2 =(valueThrees2 * 2);
                        valueFours2 = (valueFours2 * 2);
                        valueFive2 = (valueFive2 * 2);
                        valueSixs2 = (valueSixs2 * 2);
                       allTotal();

                    }
                       multiply.setEnabled(false);
                        up.setEnabled(false);
                         down.setEnabled(false);
                          rollPlus.setEnabled(false);
                }
         
         
         }
        ///////////////////////////////////////////////
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
                sg.settOfkinds(src.valuesThrees());
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
        //////////////////////////////////////player two////////////////

        if (e.getSource() == p2txt1) {
            if (secondPlayer.isEnabled() == true) {

                sg.setAces(src.valuesAces());
                p2txt1.setText("" + (sg.getAces()));
                valueAces2 = sg.getAces();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                 counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt2) {
            if (secondPlayer.isEnabled() == true) {
                sg.setTwos(src.valuesTwos());
                p2txt2.setText("" + (sg.getTwos()));
                valueTwos2 = sg.getTwos();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }

        if (e.getSource() == p2txt3) {
            if (secondPlayer.isEnabled() == true) {
                sg.setThrees(src.valuesThrees());
                p2txt3.setText("" + (sg.getThrees()));
                valueThrees2 = sg.getThrees();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt4) {
            if (secondPlayer.isEnabled() == true) {
                sg.setFours(src.valuesFours());
                p2txt4.setText("" + (sg.getFours()));
                valueFours2 = sg.getFours();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt5) {
            if (secondPlayer.isEnabled() == true) {
                sg.setFives(src.valuesFives());
                p2txt5.setText("" + (sg.getFives()));
                valueFive2 = sg.getThrees();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p1txt6) {
            if (secondPlayer.isEnabled() == true) {
                sg.setSixes(src.valuesSixs());
                p2txt6.setText("" + (sg.getSixes()));
                valueSixs2 = sg.getSixes();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt7) {
            if (secondPlayer.isEnabled() == true) {
                sg.settOfkinds(src.valuesThrees());
                p2txt7.setText("" + (sg.gettOfkinds()));
                valueSeven2 = sg.gettOfkinds();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt8) {
            if (secondPlayer.isEnabled() == true) {
                sg.setfOfkinds(src.valuesFourofakinds());
                p2txt8.setText("" + (sg.getfOfkinds()));
                valueEight1 = sg.getfOfkinds();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt9) {
            if (secondPlayer.isEnabled() == true) {
                sg.setFullHouse(src.valuesFullHouse());
                p2txt9.setText("" + (sg.getFullHouse()));
                valueNine2 = sg.getFullHouse();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt10) {
            if (secondPlayer.isEnabled() == true) {
                sg.setThrees(src.valuessmallStraight());
                p2txt10.setText("" + (sg.getsStraight()));
                valueTen2 = sg.getsStraight();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt11) {
            if (secondPlayer.isEnabled() == true) {
                sg.setlStraight(src.valueslargeStraight());
                p2txt11.setText("" + (sg.getlStraight()));
                valueEleven2 = sg.getlStraight();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt12) {
            if (secondPlayer.isEnabled() == true) {
                sg.setYahtzeee(src.valuesYahtzeee());
                p2txt12.setText("" + (sg.getYahtzeee()));
                valueTwelve2 = sg.getYahtzeee();
                allTotal();
                
                rollButton.setVisible(false);
                submitButton.setVisible(true);
                   counterRoll=3;
            } else {
                JOptionPane.showMessageDialog(null, "Scored!!!!!!!!!!");
            }
        }
        if (e.getSource() == p2txt13) {
            if (secondPlayer.isEnabled() == true) {
                sg.setChance(src.valuesChance());
                p2txt13.setText("" + (sg.getChance()));
                valueThirteen2 = sg.getChance();
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
