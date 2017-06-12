/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Model.Interfaces.Position;

/**
 *
 * @author AkaEx
 */
public class MasterTree {

    private LinkedTree<Master> masterTreeAllen = new LinkedTree();
    private LinkedTree<Master> masterTreePearl = new LinkedTree();
    private LinkedTree<Master> masterTreeEddy = new LinkedTree();

    public MasterTree() {
        masterTreeAllen.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));
        masterTreeEddy.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));
        masterTreePearl.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));

        Position AllenPos2 = masterTreeAllen.add(new Master(15, 0, 0, 0, 0, 0, 0, false), masterTreeAllen.root());
        Position AllenPos3 = masterTreeAllen.add(new Master(0, 20, 0, 0, 0, 0, 0, false), masterTreeAllen.root());
        Position AllenPos4 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), masterTreeAllen.root());
        Position AllenPos5 = masterTreeAllen.add(new Master(0, 0, 0, 5, 2, 2, 2, false), masterTreeAllen.root());

        Position AllenPos6 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos2);
        Position AllenPos7 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos6);
        Position AllenPos8 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos7);
        Position AllenPos9 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos8);

        Position AllenPos10 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos3);
        Position AllenPos11 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos10);
        Position AllenPos12 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos11);
        Position AllenPos13 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos12);

        Position AllenPos14 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos4);
        Position AllenPos15 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos14);
        Position AllenPos16 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos15);
        Position AllenPos17 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos16);

        Position AllenPos18 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos5);
        Position AllenPos19 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 2, 2, false), AllenPos5);

        Position AllenPos20 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos18);
        Position AllenPos21 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos20);
        Position AllenPos22 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos21);
        Position AllenPos23 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos22);

        Position AllenPos24 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos19);
        Position AllenPos25 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos24);
        Position AllenPos26 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos25);
        Position AllenPos27 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos26);

        Position AllenPos28 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos19);
        Position AllenPos29 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos28);
        Position AllenPos30 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos29);
        Position AllenPos31 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos30);

        Position AllenPos32 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos19);
        Position AllenPos33 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos32);
        Position AllenPos34 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos33);
        Position AllenPos35 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos34);

        Position EddyPos2 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), masterTreeEddy.root());
        Position EddyPos3 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), masterTreeEddy.root());
        Position EddyPos4 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), masterTreeEddy.root());
        Position EddyPos5 = masterTreeEddy.add(new Master(0, 0, 0, 5, 2, 2, 2, false), masterTreeEddy.root());

        Position EddyPos6 = masterTreeEddy.add(new Master(20, 0, 0, 0, 0, 0, 0, false), EddyPos2);
        Position EddyPos7 = masterTreeEddy.add(new Master(20, 0, 0, 0, 0, 0, 0, false), EddyPos6);
        Position EddyPos8 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), EddyPos7);
        Position EddyPos9 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), EddyPos8);

        Position EddyPos10 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), EddyPos3);
        Position EddyPos11 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), EddyPos10);
        Position EddyPos12 = masterTreeEddy.add(new Master(0, 15, 0, 0, 0, 0, 0, false), EddyPos11);
        Position EddyPos13 = masterTreeEddy.add(new Master(0, 15, 0, 0, 0, 0, 0, false), EddyPos12);

        Position EddyPos14 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos4);
        Position EddyPos15 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos14);
        Position EddyPos16 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos15);
        Position EddyPos17 = masterTreeEddy.add(new Master(0, 0, 10, 0, 0, 0, 0, false), EddyPos16);

        Position EddyPos18 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos5);
        Position EddyPos19 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 2, 0, false), EddyPos5);

        Position EddyPos20 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos18);
        Position EddyPos21 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos20);
        Position EddyPos22 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos21);
        Position EddyPos23 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos22);

        Position EddyPos24 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos19);
        Position EddyPos25 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos24);
        Position EddyPos26 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos25);
        Position EddyPos27 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos26);

        Position EddyPos28 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos19);
        Position EddyPos29 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos28);
        Position EddyPos30 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos29);
        Position EddyPos31 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos30);

        Position PearlPos2 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), masterTreePearl.root());
        Position PearlPos3 = masterTreePearl.add(new Master(0, 10, 0, 0, 0, 0, 0, false), masterTreePearl.root());
        Position PearlPos4 = masterTreePearl.add(new Master(0, 0, 5, 0, 0, 0, 0, false), masterTreePearl.root());
        Position PearlPos5 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 2, 2, false), masterTreePearl.root());

        Position PearlPos6 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos2);
        Position PearlPos7 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos6);
        Position PearlPos8 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos7);
        Position PearlPos9 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos8);

        Position PearlPos10 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos3);
        Position PearlPos11 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos10);
        Position PearlPos12 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos11);
        Position PearlPos13 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos12);

        Position PearlPos14 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos4);
        Position PearlPos15 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos14);
        Position PearlPos16 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos15);
        Position PearlPos17 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos16);

        Position PearlPos18 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos5);
        Position PearlPos19 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos18);
        Position PearlPos20 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos19);

        Position PearlPos21 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos5);
        Position PearlPos22 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos21);
        Position PearlPos23 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos22);

        Position PearlPos24 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos5);
        Position PearlPos25 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos24);
        Position PearlPos26 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos25);
    }

    public LinkedTree<Master> getMasterTreeAllen() {
        return masterTreeAllen;
    }

    public void setMasterTreeAllen(LinkedTree<Master> masterTreeAllen) {
        this.masterTreeAllen = masterTreeAllen;
    }

    public LinkedTree<Master> getMasterTreePearl() {
        return masterTreePearl;
    }

    public void setMasterTreePearl(LinkedTree<Master> masterTreePearl) {
        this.masterTreePearl = masterTreePearl;
    }

    public LinkedTree<Master> getMasterTreeEddy() {
        return masterTreeEddy;
    }

    public void setMasterTreeEddy(LinkedTree<Master> masterTreeEddy) {
        this.masterTreeEddy = masterTreeEddy;
    }
}
