package charactor;

public class Hero {

    public String name; //姓名

    public float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    static String copyright;

    public Hero(){

    }

    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    public static void battleWin(){
        System.out.println("battleWin");
    }


    public static void main(String[] args) {
        Hero h = new Hero();
        Hero.battleWin();
    }

}

