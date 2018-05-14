package yahtzeeMiraj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ScoreCalculate extends AbstractValues implements SpecialCatagories{

    JButton[] diceImgArray = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};

    Random random = new Random();
    public String[] imageDice = {"imageDice//img1.png",//dice image
        "imageDice//img2.png",
        "imageDice//img3.png",
        "imageDice//img4.png",
        "imageDice//img5.png",
        "imageDice//img6.png"};
Timer ttm;
    int guessRandom[] = new int[5];
    int diceFaceValue[] = {1, 2, 3, 4, 5, 6};

    int counter = 0;
    
    public ScoreCalculate(){
      ttm = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                generateDiceImage();

                counter++;
                if (counter > 6) {
                    ttm.stop();

                }
            }
        });
    }
    
    public int getRandom() {

        return diceFaceValue[random.nextInt(diceFaceValue.length)];

    }

    public void firstDdiceImage() {
        diceImgArray[0].setIcon(new ImageIcon(imageDice[0]));
        diceImgArray[1].setIcon(new ImageIcon(imageDice[1]));
        diceImgArray[2].setIcon(new ImageIcon(imageDice[2]));
        diceImgArray[3].setIcon(new ImageIcon(imageDice[3]));
        diceImgArray[4].setIcon(new ImageIcon(imageDice[5]));
    }

    public void generateDiceImage() {
        if (diceImgArray[0].isEnabled() == true) {
            guessRandom[0] =getRandom();
//                  guessRandom[0] =3;

        }
        if (diceImgArray[1].isEnabled() == true) {
            guessRandom[1] =getRandom();
//                  guessRandom[1] =3;

        }
        if (diceImgArray[2].isEnabled() == true) {
            guessRandom[2] =getRandom();
//                  guessRandom[2] =3;

        }
        if (diceImgArray[3].isEnabled() == true) {
            guessRandom[3] =getRandom();
//                  guessRandom[3] =3;

        }
        if (diceImgArray[4].isEnabled() == true) {
            guessRandom[4] = getRandom();
//                  guessRandom[4] =3;

        }

        diceImgArray[0].setIcon(new ImageIcon(imageDice[guessRandom[0] - 1]));
        diceImgArray[1].setIcon(new ImageIcon(imageDice[guessRandom[1] - 1]));
        diceImgArray[2].setIcon(new ImageIcon(imageDice[guessRandom[2] - 1]));
        diceImgArray[3].setIcon(new ImageIcon(imageDice[guessRandom[3] - 1]));
        diceImgArray[4].setIcon(new ImageIcon(imageDice[guessRandom[4] - 1]));
        diceImgArray[0].setText("" + (guessRandom[0]));
        diceImgArray[1].setText("" + (guessRandom[1]));
        diceImgArray[2].setText("" + (guessRandom[2]));
        diceImgArray[3].setText("" + (guessRandom[3]));
        diceImgArray[4].setText("" + (guessRandom[4]));

    }

    
  @Override
    public int valuesAces() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 1) {

                upper = upper + 1;

            }

        }

        return upper;

    }
  @Override
    public int valuesTwos() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 2) {

                upper = upper + 2;

            }

        }

        return upper;

    }
  @Override
    public int valuesThrees() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 3) {

                upper = upper + 3;

            }

        }

        return upper;

    }
  @Override
    public int valuesFours() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 4) {

                upper = upper + 4;

            }
        }
        return upper;
    }
  @Override
    public int valuesFives() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 5) {

                upper = upper + 5;

            }
        }
        return upper;
    }
  @Override
    public int valuesSixs() {
        int upper = 0;

        for (int a = 0; a < 5; a++) {
            if (guessRandom[a] == 6) {

                upper = upper + 6;

            }
        }
        return upper;
    }
  @Override
    public int valuesThreeofakinds() {
        int lower = 0;
        Arrays.sort(guessRandom);

        for (int a = 0; a < 5; a++) {
            if (guessRandom[0] == guessRandom[1] && guessRandom[1] == guessRandom[2] || guessRandom[1] == guessRandom[2]
                    && guessRandom[2] == guessRandom[3] || guessRandom[2] == guessRandom[3] && guessRandom[3] == guessRandom[4]) {

                lower = lower + guessRandom[a];

            }
        }
        return lower;
    }
  @Override
    public int valuesFourofakinds() {
          int lower = 0;
boolean tk = false;
            for (int aa = 1; aa<= 6; aa++) {
                int counter = 0;
                for (int mm = 0; mm< 5; mm++) {
                    if (guessRandom[mm] == aa) {
                        counter++;
                    }
                    if (counter > 2) {
                        tk = true;
                    }
                }
            }
            if (tk == true) {
                for (int ll = 0; ll < 5; ll++) {
                    lower += guessRandom[ll];
                }
            }
            
            return lower;
        
    }

    
  @Override
    public int valuesFullHouse() {
        int lower = 0;

        try {

            Arrays.sort(guessRandom); /////////////0 1 2 3 4 5     

            if ((((guessRandom[0] == guessRandom[1]) && (guessRandom[1] == guessRandom[2]))  && (guessRandom[3] == guessRandom[4])
                    && 
                    (guessRandom[2] != guessRandom[3]))
                    || ((guessRandom[0] == guessRandom[1])
                    && 
                    ((guessRandom[2] == guessRandom[3]) && (guessRandom[3] == guessRandom[4]))
                    && 
                    (guessRandom[1] != guessRandom[2]))) {
                lower = 25;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        return lower;
    }
  @Override
    public int valuessmallStraight() {
        int lower = 0;
        Arrays.sort(guessRandom);

        for (int val[] : smallStraight) {
            if (Arrays.equals(guessRandom, val)) {
                lower = 30;
            }
        }
        return lower;
    }
  @Override
    public int valueslargeStraight() {
        int lower = 0;
        Arrays.sort(guessRandom);

        for (int val[] : largeStraight) {
            if (Arrays.equals(guessRandom, val)) {
                lower = 40;
            }
        }
        return lower;
    }
  @Override
    public int valuesYahtzeee() {
        int lower = 0;
        for (int a = 1; a <= 6; a++) {
            if (guessRandom[0] == a && guessRandom[1] == a && guessRandom[2] == a && guessRandom[3] == a && guessRandom[4] == a) {
                lower = 50;
            }
        }
        return lower;
    }
  @Override
    public int valuesChance() {
        int lower = 0;
        for (int a = 0; a < 5; a++) {
            lower = guessRandom[a] + lower;

        }

        return lower;
    }

}
