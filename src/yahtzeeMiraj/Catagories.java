/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;

/**
 *
 * @author Miraj
 */
public class Catagories {
     private int aces;
     private int twos;
     private int threes;
     private int fours;
     private int fives;
     private int sixes;
     private int tOfkinds;
     private int fOfkinds;
     private int sStraight;
     private int lStraight;
     private int fullHouse;
     private int yahtzeee;
     private int chance;

    public int getAces() {
        try{
            
        return aces;
        }
        
        catch(Exception e){
             System.out.println(e.getMessage());
            return 0;
        }
                
    }

    public void setAces(int aces) {
        try{
            this.aces = aces;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            
            
        
    }

    public int getTwos() {
        try{
            return twos;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
            
    }

    public void setTwos(int twos) {
        try{
            this.twos = twos;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }

    public int getThrees() {
        try{
        return threes;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return threes;
        }
    }

    public void setThrees(int threes) {
        try{
        this.threes = threes;
    }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
            
    }

    public int getFours() {
        try{
        return fours;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
            
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int gettOfkinds() {
        return tOfkinds;
    }

    public void settOfkinds(int tOfkinds) {
        this.tOfkinds = tOfkinds;
    }

    public int getfOfkinds() {
        return fOfkinds;
    }

    public void setfOfkinds(int fOfkinds) {
        this.fOfkinds = fOfkinds;
    }

    public int getsStraight() {
        return sStraight;
    }

    public void setsStraight(int sStraight) {
        this.sStraight = sStraight;
    }

    public int getlStraight() {
        return lStraight;
    }

    public void setlStraight(int lStraight) {
        this.lStraight = lStraight;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getYahtzeee() {
        return yahtzeee;
    }

    public void setYahtzeee(int yahtzeee) {
        this.yahtzeee = yahtzeee;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

}
