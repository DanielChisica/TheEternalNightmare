/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 *
 * @author SALAAL
 */
public class Juego extends BasicGameState {

    private Image mapa;
    private Image allen;
    private Input entrada;
    private float x = (float) 250, y = (float) 310;

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        mapa = new Image("Resources/Map.PNG");
        allen = new Image("Resources/01.png");
        entrada = container.getInput();

    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        g.drawString("Prueba", 200, 200);
        mapa.draw();
        allen.draw(x, y);
        String posicion = "(" + entrada.getMouseX() + "," + entrada.getMouseY() + ")";
        String posallen = "(" + x + "," + y + ")";
        g.drawString(posicion, 10, 10);
        g.drawString(posallen, 20, 20);
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

        if (entrada.isKeyDown(Input.KEY_UP)) {
            if (y > 29) {
                y = (float) (y - 0.15);
            }
            else{
                y=y;
            }

        }
        if (entrada.isKeyDown(Input.KEY_DOWN)) {
             if (y < 365) {
                y = (float) (y + 0.15);
            }
            else{
                y=y;
            }
        }
        if (entrada.isKeyDown(Input.KEY_LEFT)) {
            if (x > 19 ) {
                x = (float) (x - 0.15);
            }
            else{
                x=x;
            }
        }
        if (entrada.isKeyDown(Input.KEY_RIGHT)) {
            if (x < 471) {
                x= (float) (x + 0.15);
            }
            else{
                x=x;
            }
        }

    }

}
