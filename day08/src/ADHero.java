public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }
    public void die(){
        System.out.println("AD挂了");
    }

    public static void battlewin(){
        System.out.println("ad hero battle win");
    }


    public ADHero(String name){
        super(name);
        System.out.println("ADHero的构造方法");
    }

    public static void main(String[] args) {
        Hero h = new ADHero("德莱文");
        System.out.println(h.name);

    }
}
