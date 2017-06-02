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
public class HistHabilitys {
    
    private Queue<SpecialSkill> hist;

    public HistHabilitys(Queue<SpecialSkill> hist) {
        this.hist = hist;
    }

    public Queue<SpecialSkill> getHist() {
        return hist;
    }

    public void setHist(Queue<SpecialSkill> hist) {
        this.hist = hist;
    }
    
    
}
