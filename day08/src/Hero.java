public class Hero extends Object{
    public String name;
    protected float hp;
    int armor;
    public void useItem(Item i){
        i.effect();
    }
    public void kill(Mortal m){
        m.die();
    }
    public static void battlewin(){
        System.out.println("hero battle win");
    }


    public Hero(){
        System.out.println("Hero的构造方法");
    }
    public Hero(String name){
        System.out.println("Hero的有参构造方法");
        this.name = name;
    }

    public static void main(String[] args) {
        new Hero();

    }
}
