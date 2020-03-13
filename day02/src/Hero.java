public class Hero {
    String name;
    float hp;
    float armor;
    int movespeed;
    void keng(){
        System.out.println("666");
    }
    float getHp(){
        return hp;
    }
    float addMovespeed(float num){
        return movespeed+num;
    }


    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "电子科大";
        h1.armor = 34;
        h1.hp = 33;
        h1.movespeed = 330;
        System.out.println(h1.armor);
        h1.keng();
        System.out.println(h1.getHp());
        System.out.println(h1.addMovespeed(99));
    }
}
