/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.Random;

/**
 *
 * @author danie_000
 */
public class Battlefield {

    private Allen allen;
    private Eddy eddy;
    private Pearl pearl;

    private Characters rival1;
    private Characters rival2;
    private Characters rival3;
    private Characters rival4;

    int team1hasattack;

    public Battlefield(Allen allen, Eddy eddy, Pearl pearl, Characters rival1, Characters rival2, Characters rival3, Characters rival4) {
        this.allen = allen;
        this.eddy = eddy;
        this.pearl = pearl;
        this.rival1 = rival1;
        this.rival2 = rival2;
        this.rival3 = rival3;
        this.rival4 = rival4;
    }

    public void attack(Characters char1, Characters char2) {
        char2.setHp(char2.getHp() - (char1.getAtk() - char2.getArmor()));

        if (char1 instanceof Allen || char1 instanceof Eddy) {
            team1hasattack = 1;
        }

    }

    public void specialAttack(Characters char1, Characters char2, SpecialSkill spk1) {
        char1.setMp(char1.getMp() - spk1.getMagic());
        char2.setHp(char2.getHp() - (spk1.getMagic() - char2.getMagicalResistence()));
        if (char1 instanceof Allen || char1 instanceof Eddy) {
            team1hasattack = 1;
        }
    }

    public void rotationAttack(Eddy eddy1, Characters char2) {
        eddy1.setMp(eddy1.getMp() - (eddy1.getSkill3().getMagic()));
        char2.setHp(char2.getHp() - char2.getAtk());
    }

    public void heal() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill1().getMagic()));
        allen.setHp(allen.getHp() + (pearl.getSkill1().getMagic()));
    }

    public void increaseAtk() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill2().getMagic()));

        Random rand = new Random();
        int n = rand.nextInt(4) + 1;

        switch (n) {
            case 1:
                rival1.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                attack(allen, rival1);
                break;

            case 2:
                rival2.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                attack(allen, rival2);
                break;

            case 3:
                rival3.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                attack(allen, rival3);
                break;

            case 4:
                rival4.setHp(rival1.getHp() - (pearl.getSkill2().getMagic()));
                attack(allen, rival4);
                break;
        }

    }

    public void bringShield() {
        pearl.setMp(pearl.getMp() - (pearl.getSkill3().getMagic()));
        allen.setArmor(allen.getArmor() + pearl.getSkill3().getMagic());
    }

    public boolean battle() {
        while ((allen.getHp() > 0 && eddy.getHp() > 0 && pearl.getHp() > 0)
                || (rival1.getHp() > 0 && rival2.getHp() > 0 && rival3.getHp() > 0)) {
            if (team1hasattack == 1) {
                Random rand = new Random();
                int n = rand.nextInt(12) + 1;
            
        switch(n){
        case 1:  
                specialAttack(rival1, allen, rival1.getSkill1());
                break;

            case 2:
                specialAttack(rival2, allen, rival1.getSkill1());
                break;

            case 3:
                specialAttack(rival3, allen, rival3.getSkill1());
                break;

            case 4:
                specialAttack(rival4, allen, rival4.getSkill1());
                break;
                
            case 5:
                attack(rival1, allen);
                break;
                
            case 6:
                attack(rival2, allen);
                break;    
                
            case 7:
                attack(rival3, allen);
                break;    
                
            case 8:
                 attack(rival4, allen);
                break;    
                
            case 9:
                attack(rival1, eddy);
                break;
                
            case 10:
                attack(rival2, eddy);
                break;
                
            case 11:
                attack(rival3, eddy);
                break;
                
            case 12:
                attack(rival4, eddy);
                break;    
                
        }
                    team1hasattack=0;
                }   
        }
        return true;
    }
}
