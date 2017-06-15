/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SpecialSkill;
import java.util.Queue;

/**
 *
 * @author AkaEx
 */
public class AbilitiesHistory {
    
    private Queue<String> hist;

    public AbilitiesHistory(Queue<String> hist) {
        this.hist = hist;
    }

    public Queue<String> getHist() {
        return hist;
    }

    public void setHist(Queue<String> hist) {
        this.hist = hist;
    }
    
    
}
