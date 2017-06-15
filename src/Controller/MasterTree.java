/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Model.Interfaces.Position;
import Model.LinkedTree.Node;

/**
 *
 * @author Daniel Jiménez Chísica
 */
public class MasterTree {
    
    public Allen allen;
    public Eddy eddy;
    public Pearl pearl;

    public MasterTree(Allen allen, Eddy eddy, Pearl pearl) {
        this.allen = allen;
        this.eddy = eddy;
        this.pearl = pearl;
    }
    
    
    
    private LinkedTree<Master> masterTreeAllen = new LinkedTree();
    private LinkedTree<Master> masterTreePearl = new LinkedTree();
    private LinkedTree<Master> masterTreeEddy = new LinkedTree();
    
   private Position AllenPos1=masterTreeAllen.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));
   private Position EddyPos1=masterTreeEddy.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));
   private Position PearlPos1=masterTreePearl.addRoot(new Master(5, 0, 0, 0, 0, 0, 0, false));
    
    private Position AllenPos2 = masterTreeAllen.add(new Master(15, 0, 0, 0, 0, 0, 0, false), masterTreeAllen.root());
    private Position AllenPos3 = masterTreeAllen.add(new Master(0, 20, 0, 0, 0, 0, 0, false), masterTreeAllen.root());
    private Position AllenPos4 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), masterTreeAllen.root());
    private Position AllenPos5 = masterTreeAllen.add(new Master(0, 0, 0, 5, 2, 2, 2, false), masterTreeAllen.root());

    private Position AllenPos6 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos2);
    private Position AllenPos7 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos6);
    private Position AllenPos8 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos7);
    private Position AllenPos9 = masterTreeAllen.add(new Master(10, 0, 0, 0, 0, 0, 0, false), AllenPos8);

    private Position AllenPos10 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos3);
    private Position AllenPos11 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos10);
    private Position AllenPos12 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos11);
    private Position AllenPos13 = masterTreeAllen.add(new Master(0, 10, 0, 0, 0, 0, 0, false), AllenPos12);

    private Position AllenPos14 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos4);
    private Position AllenPos15 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos14);
    private Position AllenPos16 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos15);
    private Position AllenPos17 = masterTreeAllen.add(new Master(0, 0, 10, 0, 0, 0, 0, false), AllenPos16);

    private Position AllenPos18 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos5);
    private Position AllenPos19 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 2, 2, false), AllenPos5);

    private Position AllenPos20 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos18);
    private Position AllenPos21 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos20);
    private Position AllenPos22 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos21);
    private Position AllenPos23 = masterTreeAllen.add(new Master(0, 0, 0, 5, 0, 0, 0, false), AllenPos22);

    private Position AllenPos24 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos19);
    private Position AllenPos25 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos24);
    private Position AllenPos26 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos25);
    private Position AllenPos27 = masterTreeAllen.add(new Master(0, 0, 0, 0, 2, 0, 0, false), AllenPos26);

    private Position AllenPos28 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos19);
    private Position AllenPos29 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos28);
    private Position AllenPos30 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos29);
    private Position AllenPos31 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 2, 0, false), AllenPos30);

    private Position AllenPos32 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos19);
    private Position AllenPos33 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos32);
    private Position AllenPos34 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos33);
    private Position AllenPos35 = masterTreeAllen.add(new Master(0, 0, 0, 0, 0, 0, 2, false), AllenPos34);

    private Position EddyPos2 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), masterTreeEddy.root());
    private Position EddyPos3 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), masterTreeEddy.root());
    private Position EddyPos4 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), masterTreeEddy.root());
    private Position EddyPos5 = masterTreeEddy.add(new Master(0, 0, 0, 5, 2, 2, 2, false), masterTreeEddy.root());

    private Position EddyPos6 = masterTreeEddy.add(new Master(20, 0, 0, 0, 0, 0, 0, false), EddyPos2);
    private Position EddyPos7 = masterTreeEddy.add(new Master(20, 0, 0, 0, 0, 0, 0, false), EddyPos6);
    private Position EddyPos8 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), EddyPos7);
    private Position EddyPos9 = masterTreeEddy.add(new Master(15, 0, 0, 0, 0, 0, 0, false), EddyPos8);

    private Position EddyPos10 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), EddyPos3);
    private Position EddyPos11 = masterTreeEddy.add(new Master(0, 20, 0, 0, 0, 0, 0, false), EddyPos10);
    private Position EddyPos12 = masterTreeEddy.add(new Master(0, 15, 0, 0, 0, 0, 0, false), EddyPos11);
    private Position EddyPos13 = masterTreeEddy.add(new Master(0, 15, 0, 0, 0, 0, 0, false), EddyPos12);

    private Position EddyPos14 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos4);
    private Position EddyPos15 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos14);
    private Position EddyPos16 = masterTreeEddy.add(new Master(0, 0, 5, 0, 0, 0, 0, false), EddyPos15);
    private Position EddyPos17 = masterTreeEddy.add(new Master(0, 0, 10, 0, 0, 0, 0, false), EddyPos16);

    private Position EddyPos18 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos5);
    private Position EddyPos19 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 2, 0, false), EddyPos5);

    private Position EddyPos20 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos18);
    private Position EddyPos21 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos20);
    private Position EddyPos22 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos21);
    private Position EddyPos23 = masterTreeEddy.add(new Master(0, 0, 0, 5, 0, 0, 0, false), EddyPos22);

    private Position EddyPos24 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos19);
    private Position EddyPos25 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos24);
    private Position EddyPos26 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos25);
    private Position EddyPos27 = masterTreeEddy.add(new Master(0, 0, 0, 0, 2, 0, 0, false), EddyPos26);

    private Position EddyPos28 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos19);
    private Position EddyPos29 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos28);
    private Position EddyPos30 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos29);
    private Position EddyPos31 = masterTreeEddy.add(new Master(0, 0, 0, 0, 0, 2, 0, false), EddyPos30);

    private Position PearlPos2 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), masterTreePearl.root());
    private Position PearlPos3 = masterTreePearl.add(new Master(0, 10, 0, 0, 0, 0, 0, false), masterTreePearl.root());
    private Position PearlPos4 = masterTreePearl.add(new Master(0, 0, 5, 0, 0, 0, 0, false), masterTreePearl.root());
    private Position PearlPos5 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 2, 2, false), masterTreePearl.root());

    private Position PearlPos6 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos2);
    private Position PearlPos7 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos6);
    private Position PearlPos8 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos7);
    private Position PearlPos9 = masterTreePearl.add(new Master(5, 0, 0, 0, 0, 0, 0, false), PearlPos8);

    private Position PearlPos10 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos3);
    private Position PearlPos11 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos10);
    private Position PearlPos12 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos11);
    private Position PearlPos13 = masterTreePearl.add(new Master(0, 5, 0, 0, 0, 0, 0, false), PearlPos12);

    private Position PearlPos14 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos4);
    private Position PearlPos15 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos14);
    private Position PearlPos16 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos15);
    private Position PearlPos17 = masterTreePearl.add(new Master(0, 0, 10, 0, 0, 0, 0, false), PearlPos16);

    private Position PearlPos18 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos5);
    private Position PearlPos19 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos18);
    private Position PearlPos20 = masterTreePearl.add(new Master(0, 0, 0, 0, 2, 0, 0, false), PearlPos19);

    private Position PearlPos21 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos5);
    private Position PearlPos22 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos21);
    private Position PearlPos23 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 2, 0, false), PearlPos22);

    private Position PearlPos24 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos5);
    private Position PearlPos25 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos24);
    private Position PearlPos26 = masterTreePearl.add(new Master(0, 0, 0, 0, 0, 0, 2, false), PearlPos25);

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

    public Position<Master> applyMaster(Characters char1, LinkedTree<Master> tree, Position mas) {
        System.out.println(char1.getHpLimit()+" "+char1.getMpLimit()+" "+char1.getArmor()+" "
                +char1.getAtk()+" "+char1.getSkill1().getMagic()+" "+char1.getSkill2().getMagic()+" "+char1.getSkill3().getMagic());
        
        
        Node masterNode = (Node) tree.validate(mas);
        if(masterNode==null){
            Master master1=(Master)masterNode.getElement();
            char1.setHpLimit(char1.getHp() + master1.getHpLimit());
        char1.setMpLimit(char1.getHp() + master1.getMpLimit());
        char1.setArmor(char1.getArmor() + master1.getArmorLimit());
        char1.setAtk(char1.getAtk() + master1.getAtkLimit());

        SpecialSkill skill1 = char1.getSkill1();
        SpecialSkill skill2 = char1.getSkill2();
        SpecialSkill skill3 = char1.getSkill3();
        skill1.setMagic(char1.getSkill1().getMagic() + master1.getSpecialSkillLimit());
        skill2.setMagic(char1.getSkill2().getMagic() + master1.getSpecialSkillLimit2());
        skill3.setMagic(char1.getSkill3().getMagic() + master1.getSpecialSkillLimit3());

        char1.setSkill1(skill1);
        char1.setSkill2(skill2);
        char1.setSkill3(skill3);
        
        master1.setHasBeenTaken(true);
        masterNode.setElement(master1);
        mas=masterNode;
            System.out.println("Isn't null");
        return mas;
        }
        
        
        return null;
    }

    public Position getAllenPos2() {
        return AllenPos2;
    }

    public void setAllenPos2(Position AllenPos2) {
        this.AllenPos2 = AllenPos2;
    }

    public Position getAllenPos3() {
        return AllenPos3;
    }

    public void setAllenPos3(Position AllenPos3) {
        this.AllenPos3 = AllenPos3;
    }

    public Position getAllenPos4() {
        return AllenPos4;
    }

    public void setAllenPos4(Position AllenPos4) {
        this.AllenPos4 = AllenPos4;
    }

    public Position getAllenPos5() {
        return AllenPos5;
    }

    public void setAllenPos5(Position AllenPos5) {
        this.AllenPos5 = AllenPos5;
    }

    public Position getAllenPos6() {
        return AllenPos6;
    }

    public void setAllenPos6(Position AllenPos6) {
        this.AllenPos6 = AllenPos6;
    }

    public Position getAllenPos7() {
        return AllenPos7;
    }

    public void setAllenPos7(Position AllenPos7) {
        this.AllenPos7 = AllenPos7;
    }

    public Position getAllenPos8() {
        return AllenPos8;
    }

    public void setAllenPos8(Position AllenPos8) {
        this.AllenPos8 = AllenPos8;
    }

    public Position getAllenPos9() {
        return AllenPos9;
    }

    public void setAllenPos9(Position AllenPos9) {
        this.AllenPos9 = AllenPos9;
    }

    public Position getAllenPos10() {
        return AllenPos10;
    }

    public void setAllenPos10(Position AllenPos10) {
        this.AllenPos10 = AllenPos10;
    }

    public Position getAllenPos11() {
        return AllenPos11;
    }

    public void setAllenPos11(Position AllenPos11) {
        this.AllenPos11 = AllenPos11;
    }

    public Position getAllenPos12() {
        return AllenPos12;
    }

    public void setAllenPos12(Position AllenPos12) {
        this.AllenPos12 = AllenPos12;
    }

    public Position getAllenPos13() {
        return AllenPos13;
    }

    public void setAllenPos13(Position AllenPos13) {
        this.AllenPos13 = AllenPos13;
    }

    public Position getAllenPos14() {
        return AllenPos14;
    }

    public void setAllenPos14(Position AllenPos14) {
        this.AllenPos14 = AllenPos14;
    }

    public Position getAllenPos15() {
        return AllenPos15;
    }

    public void setAllenPos15(Position AllenPos15) {
        this.AllenPos15 = AllenPos15;
    }

    public Position getAllenPos16() {
        return AllenPos16;
    }

    public void setAllenPos16(Position AllenPos16) {
        this.AllenPos16 = AllenPos16;
    }

    public Position getAllenPos17() {
        return AllenPos17;
    }

    public void setAllenPos17(Position AllenPos17) {
        this.AllenPos17 = AllenPos17;
    }

    public Position getAllenPos18() {
        return AllenPos18;
    }

    public void setAllenPos18(Position AllenPos18) {
        this.AllenPos18 = AllenPos18;
    }

    public Position getAllenPos19() {
        return AllenPos19;
    }

    public void setAllenPos19(Position AllenPos19) {
        this.AllenPos19 = AllenPos19;
    }

    public Position getAllenPos20() {
        return AllenPos20;
    }

    public void setAllenPos20(Position AllenPos20) {
        this.AllenPos20 = AllenPos20;
    }

    public Position getAllenPos21() {
        return AllenPos21;
    }

    public void setAllenPos21(Position AllenPos21) {
        this.AllenPos21 = AllenPos21;
    }

    public Position getAllenPos22() {
        return AllenPos22;
    }

    public void setAllenPos22(Position AllenPos22) {
        this.AllenPos22 = AllenPos22;
    }

    public Position getAllenPos23() {
        return AllenPos23;
    }

    public void setAllenPos23(Position AllenPos23) {
        this.AllenPos23 = AllenPos23;
    }

    public Position getAllenPos24() {
        return AllenPos24;
    }

    public void setAllenPos24(Position AllenPos24) {
        this.AllenPos24 = AllenPos24;
    }

    public Position getAllenPos25() {
        return AllenPos25;
    }

    public void setAllenPos25(Position AllenPos25) {
        this.AllenPos25 = AllenPos25;
    }

    public Position getAllenPos26() {
        return AllenPos26;
    }

    public void setAllenPos26(Position AllenPos26) {
        this.AllenPos26 = AllenPos26;
    }

    public Position getAllenPos27() {
        return AllenPos27;
    }

    public void setAllenPos27(Position AllenPos27) {
        this.AllenPos27 = AllenPos27;
    }

    public Position getAllenPos28() {
        return AllenPos28;
    }

    public void setAllenPos28(Position AllenPos28) {
        this.AllenPos28 = AllenPos28;
    }

    public Position getAllenPos29() {
        return AllenPos29;
    }

    public void setAllenPos29(Position AllenPos29) {
        this.AllenPos29 = AllenPos29;
    }

    public Position getAllenPos30() {
        return AllenPos30;
    }

    public void setAllenPos30(Position AllenPos30) {
        this.AllenPos30 = AllenPos30;
    }

    public Position getAllenPos31() {
        return AllenPos31;
    }

    public void setAllenPos31(Position AllenPos31) {
        this.AllenPos31 = AllenPos31;
    }

    public Position getAllenPos32() {
        return AllenPos32;
    }

    public void setAllenPos32(Position AllenPos32) {
        this.AllenPos32 = AllenPos32;
    }

    public Position getAllenPos33() {
        return AllenPos33;
    }

    public void setAllenPos33(Position AllenPos33) {
        this.AllenPos33 = AllenPos33;
    }

    public Position getAllenPos34() {
        return AllenPos34;
    }

    public void setAllenPos34(Position AllenPos34) {
        this.AllenPos34 = AllenPos34;
    }

    public Position getAllenPos35() {
        return AllenPos35;
    }

    public void setAllenPos35(Position AllenPos35) {
        this.AllenPos35 = AllenPos35;
    }

    public Position getEddyPos2() {
        return EddyPos2;
    }

    public void setEddyPos2(Position EddyPos2) {
        this.EddyPos2 = EddyPos2;
    }

    public Position getEddyPos3() {
        return EddyPos3;
    }

    public void setEddyPos3(Position EddyPos3) {
        this.EddyPos3 = EddyPos3;
    }

    public Position getEddyPos4() {
        return EddyPos4;
    }

    public void setEddyPos4(Position EddyPos4) {
        this.EddyPos4 = EddyPos4;
    }

    public Position getEddyPos5() {
        return EddyPos5;
    }

    public void setEddyPos5(Position EddyPos5) {
        this.EddyPos5 = EddyPos5;
    }

    public Position getEddyPos6() {
        return EddyPos6;
    }

    public void setEddyPos6(Position EddyPos6) {
        this.EddyPos6 = EddyPos6;
    }

    public Position getEddyPos7() {
        return EddyPos7;
    }

    public void setEddyPos7(Position EddyPos7) {
        this.EddyPos7 = EddyPos7;
    }

    public Position getEddyPos8() {
        return EddyPos8;
    }

    public void setEddyPos8(Position EddyPos8) {
        this.EddyPos8 = EddyPos8;
    }

    public Position getEddyPos9() {
        return EddyPos9;
    }

    public void setEddyPos9(Position EddyPos9) {
        this.EddyPos9 = EddyPos9;
    }

    public Position getEddyPos10() {
        return EddyPos10;
    }

    public void setEddyPos10(Position EddyPos10) {
        this.EddyPos10 = EddyPos10;
    }

    public Position getEddyPos11() {
        return EddyPos11;
    }

    public void setEddyPos11(Position EddyPos11) {
        this.EddyPos11 = EddyPos11;
    }

    public Position getEddyPos12() {
        return EddyPos12;
    }

    public void setEddyPos12(Position EddyPos12) {
        this.EddyPos12 = EddyPos12;
    }

    public Position getEddyPos13() {
        return EddyPos13;
    }

    public void setEddyPos13(Position EddyPos13) {
        this.EddyPos13 = EddyPos13;
    }

    public Position getEddyPos14() {
        return EddyPos14;
    }

    public void setEddyPos14(Position EddyPos14) {
        this.EddyPos14 = EddyPos14;
    }

    public Position getEddyPos15() {
        return EddyPos15;
    }

    public void setEddyPos15(Position EddyPos15) {
        this.EddyPos15 = EddyPos15;
    }

    public Position getEddyPos16() {
        return EddyPos16;
    }

    public void setEddyPos16(Position EddyPos16) {
        this.EddyPos16 = EddyPos16;
    }

    public Position getEddyPos17() {
        return EddyPos17;
    }

    public void setEddyPos17(Position EddyPos17) {
        this.EddyPos17 = EddyPos17;
    }

    public Position getEddyPos18() {
        return EddyPos18;
    }

    public void setEddyPos18(Position EddyPos18) {
        this.EddyPos18 = EddyPos18;
    }

    public Position getEddyPos19() {
        return EddyPos19;
    }

    public void setEddyPos19(Position EddyPos19) {
        this.EddyPos19 = EddyPos19;
    }

    public Position getEddyPos20() {
        return EddyPos20;
    }

    public void setEddyPos20(Position EddyPos20) {
        this.EddyPos20 = EddyPos20;
    }

    public Position getEddyPos21() {
        return EddyPos21;
    }

    public void setEddyPos21(Position EddyPos21) {
        this.EddyPos21 = EddyPos21;
    }

    public Position getEddyPos22() {
        return EddyPos22;
    }

    public void setEddyPos22(Position EddyPos22) {
        this.EddyPos22 = EddyPos22;
    }

    public Position getEddyPos23() {
        return EddyPos23;
    }

    public void setEddyPos23(Position EddyPos23) {
        this.EddyPos23 = EddyPos23;
    }

    public Position getEddyPos24() {
        return EddyPos24;
    }

    public void setEddyPos24(Position EddyPos24) {
        this.EddyPos24 = EddyPos24;
    }

    public Position getEddyPos25() {
        return EddyPos25;
    }

    public void setEddyPos25(Position EddyPos25) {
        this.EddyPos25 = EddyPos25;
    }

    public Position getEddyPos26() {
        return EddyPos26;
    }

    public void setEddyPos26(Position EddyPos26) {
        this.EddyPos26 = EddyPos26;
    }

    public Position getEddyPos27() {
        return EddyPos27;
    }

    public void setEddyPos27(Position EddyPos27) {
        this.EddyPos27 = EddyPos27;
    }

    public Position getEddyPos28() {
        return EddyPos28;
    }

    public void setEddyPos28(Position EddyPos28) {
        this.EddyPos28 = EddyPos28;
    }

    public Position getEddyPos29() {
        return EddyPos29;
    }

    public void setEddyPos29(Position EddyPos29) {
        this.EddyPos29 = EddyPos29;
    }

    public Position getEddyPos30() {
        return EddyPos30;
    }

    public void setEddyPos30(Position EddyPos30) {
        this.EddyPos30 = EddyPos30;
    }

    public Position getEddyPos31() {
        return EddyPos31;
    }

    public void setEddyPos31(Position EddyPos31) {
        this.EddyPos31 = EddyPos31;
    }

    public Position getPearlPos2() {
        return PearlPos2;
    }

    public void setPearlPos2(Position PearlPos2) {
        this.PearlPos2 = PearlPos2;
    }

    public Position getPearlPos3() {
        return PearlPos3;
    }

    public void setPearlPos3(Position PearlPos3) {
        this.PearlPos3 = PearlPos3;
    }

    public Position getPearlPos4() {
        return PearlPos4;
    }

    public void setPearlPos4(Position PearlPos4) {
        this.PearlPos4 = PearlPos4;
    }

    public Position getPearlPos5() {
        return PearlPos5;
    }

    public void setPearlPos5(Position PearlPos5) {
        this.PearlPos5 = PearlPos5;
    }

    public Position getPearlPos6() {
        return PearlPos6;
    }

    public void setPearlPos6(Position PearlPos6) {
        this.PearlPos6 = PearlPos6;
    }

    public Position getPearlPos7() {
        return PearlPos7;
    }

    public void setPearlPos7(Position PearlPos7) {
        this.PearlPos7 = PearlPos7;
    }

    public Position getPearlPos8() {
        return PearlPos8;
    }

    public void setPearlPos8(Position PearlPos8) {
        this.PearlPos8 = PearlPos8;
    }

    public Position getPearlPos9() {
        return PearlPos9;
    }

    public void setPearlPos9(Position PearlPos9) {
        this.PearlPos9 = PearlPos9;
    }

    public Position getPearlPos10() {
        return PearlPos10;
    }

    public void setPearlPos10(Position PearlPos10) {
        this.PearlPos10 = PearlPos10;
    }

    public Position getPearlPos11() {
        return PearlPos11;
    }

    public void setPearlPos11(Position PearlPos11) {
        this.PearlPos11 = PearlPos11;
    }

    public Position getPearlPos12() {
        return PearlPos12;
    }

    public void setPearlPos12(Position PearlPos12) {
        this.PearlPos12 = PearlPos12;
    }

    public Position getPearlPos13() {
        return PearlPos13;
    }

    public void setPearlPos13(Position PearlPos13) {
        this.PearlPos13 = PearlPos13;
    }

    public Position getPearlPos14() {
        return PearlPos14;
    }

    public void setPearlPos14(Position PearlPos14) {
        this.PearlPos14 = PearlPos14;
    }

    public Position getPearlPos15() {
        return PearlPos15;
    }

    public void setPearlPos15(Position PearlPos15) {
        this.PearlPos15 = PearlPos15;
    }

    public Position getPearlPos16() {
        return PearlPos16;
    }

    public void setPearlPos16(Position PearlPos16) {
        this.PearlPos16 = PearlPos16;
    }

    public Position getPearlPos17() {
        return PearlPos17;
    }

    public void setPearlPos17(Position PearlPos17) {
        this.PearlPos17 = PearlPos17;
    }

    public Position getPearlPos18() {
        return PearlPos18;
    }

    public void setPearlPos18(Position PearlPos18) {
        this.PearlPos18 = PearlPos18;
    }

    public Position getPearlPos19() {
        return PearlPos19;
    }

    public void setPearlPos19(Position PearlPos19) {
        this.PearlPos19 = PearlPos19;
    }

    public Position getPearlPos20() {
        return PearlPos20;
    }

    public void setPearlPos20(Position PearlPos20) {
        this.PearlPos20 = PearlPos20;
    }

    public Position getPearlPos21() {
        return PearlPos21;
    }

    public void setPearlPos21(Position PearlPos21) {
        this.PearlPos21 = PearlPos21;
    }

    public Position getPearlPos22() {
        return PearlPos22;
    }

    public void setPearlPos22(Position PearlPos22) {
        this.PearlPos22 = PearlPos22;
    }

    public Position getPearlPos23() {
        return PearlPos23;
    }

    public void setPearlPos23(Position PearlPos23) {
        this.PearlPos23 = PearlPos23;
    }

    public Position getPearlPos24() {
        return PearlPos24;
    }

    public void setPearlPos24(Position PearlPos24) {
        this.PearlPos24 = PearlPos24;
    }

    public Position getPearlPos25() {
        return PearlPos25;
    }

    public void setPearlPos25(Position PearlPos25) {
        this.PearlPos25 = PearlPos25;
    }

    public Position getPearlPos26() {
        return PearlPos26;
    }

    public void setPearlPos26(Position PearlPos26) {
        this.PearlPos26 = PearlPos26;
    }
}
