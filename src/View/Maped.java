/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author SALAAL
 */
public class Maped extends StateBasedGame{
    
    private AppGameContainer contenedor;
    

    public Maped(String name) throws SlickException {
        super("The eternaL Nightmare");
        contenedor = new AppGameContainer(this);
        contenedor.setDisplayMode(544, 418, false);
        contenedor.setShowFPS(false);
        contenedor.start();
        
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.addState(new Juego());
    }
    
    public static void main(String[] args){
        try{
            Maped str= new Maped("djfgas");
            
        }catch(SlickException slick){
            slick.printStackTrace();
        }
    }
    
}
