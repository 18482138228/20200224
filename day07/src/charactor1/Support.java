package charactor1;

import charactor.Hero;

public class Support extends Hero {
    public void heal(){

    }
    public void heal(Hero h){
        System.out.println(h.name);
    }
    public void heal(Hero h,int xp){
        h.hp = h.hp + xp;
        System.out.println(h.hp);
    }

    public static void main(String[] args) {
        Support s = new Support();
        s.name = "星妈" ;
        Hero h = new Hero();
        h.name = "盖伦";
        h.hp = 1000;
        s.heal();
        s.heal(h);
        s.heal(h,30);

    }
}
