/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Rectangle;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.geom.*;

/**
 *
 * @author SALAAL
 */
public class Juego extends BasicGameState {

    private Image mapa;
    private Image allen;
    private Input entrada;
    private float x = (float) 250, y = (float) 310;

    public Image getMapa() {
        return mapa;
    }

    public void setMapa(Image mapa) {
        this.mapa = mapa;
    }

    public Image getAllen() {
        return allen;
    }

    public void setAllen(Image allen) {
        this.allen = allen;
    }

    public Input getEntrada() {
        return entrada;
    }

    public void setEntrada(Input entrada) {
        this.entrada = entrada;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Rectangle getEstatua1() {
        return estatua1;
    }

    public void setEstatua1(Rectangle estatua1) {
        this.estatua1 = estatua1;
    }

    public Rectangle getEstatua2() {
        return estatua2;
    }

    public void setEstatua2(Rectangle estatua2) {
        this.estatua2 = estatua2;
    }

    public Rectangle getEstatua3() {
        return estatua3;
    }

    public void setEstatua3(Rectangle estatua3) {
        this.estatua3 = estatua3;
    }

    public Rectangle getAllenRec() {
        return allenRec;
    }

    public void setAllenRec(Rectangle allenRec) {
        this.allenRec = allenRec;
    }

    public boolean isColision() {
        return colision;
    }

    public void setColision(boolean colision) {
        this.colision = colision;
    }
    private Music music;
    private Rectangle estatua1, estatua2, estatua3, estatua4, allenRec;
    private boolean colision = false;

    @Override
    public int getID() {
        return 0;
    }

    private void actualizarallen() {
            if (entrada.isKeyDown(Input.KEY_UP)) {
                if (y > 29&&!allenRec.intersects(estatua1) || !allenRec.intersects(estatua2) || !allenRec.intersects(estatua3) || !allenRec.intersects(estatua4)) {
                    y = (float) (y - 0.15);
                    allenRec.y = (int) y;
                } else {
                    y = y;
                }

            }
            if (entrada.isKeyDown(Input.KEY_DOWN)) {
                if (y < 335) {
                    y = (float) (y + 0.15);
                    allenRec.y = (int) y;
                } else {
                    y = y;
                }
            }
            if (entrada.isKeyDown(Input.KEY_LEFT)) {
                if (x > 19) {
                    x = (float) (x - 0.15);
                    allenRec.x = (int) x;
                } else {
                    x = x;
                }
            }
            if (entrada.isKeyDown(Input.KEY_RIGHT)) {
                if (x < 471) {
                    x = (float) (x + 0.15);
                    allenRec.x = (int) x;
                } else {
                    x = x;
                }
            }

       
    }


    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        mapa = new Image("Resources/Map.PNG");
        allen = new Image("Resources/01.png");
        entrada = container.getInput();
        estatua1 = new Rectangle(351, 154, 30, 70);
        estatua2 = new Rectangle(159, 155, 30, 70);
        estatua3 = new Rectangle(415, 250, 30, 70);
        estatua4 = new Rectangle(94, 250, 30, 70);
        allenRec = new Rectangle((int) x, (int) y, allen.getWidth(), allen.getHeight());

    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        mapa.draw();
        allen.draw(x, y);
        String posicion = "(" + entrada.getMouseX() + "," + entrada.getMouseY() + ")";
        String posallen = "(" + x + "," + y + ")";
        g.drawString(posicion, 10, 10);
        g.drawString(posallen, 20, 20);
//        g.drawRect((int) allenRec.getX(), (int) allenRec.getY(), allen.getWidth(), allen.getHeight());
        if (colision) {
            g.drawString("hanChocado", 50, 50);
            x=x-3;
            y=y-3;
//            g.drawRect((int) allenRec.getX(), (int) allenRec.getY(), allen.getWidth(), allen.getHeight());
            colision=false;
        }
        
        
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

        if (allenRec.intersects(estatua1) || allenRec.intersects(estatua2) || allenRec.intersects(estatua3) || allenRec.intersects(estatua4)) {
            colision = true;
        }
//        if (!colision) {
//            actualizarallen();
//        }
actualizarallen();
     
    }
}
