public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void physicAttack(){
        System.out.println("物理攻击");
    }
    public void die(){
        System.out.println("AD挂了");
    }
    public static void battlewin(){
        System.out.println("ad hero battle win");
    }


    public ADHero(){
        System.out.println("ADHero的构造方法");
    }
    public ADHero(String name){
        System.out.println("ADHero的有参构造方法");
    }

    public static void main(String[] args) {
        new ADHero("德莱文");
    }
}
