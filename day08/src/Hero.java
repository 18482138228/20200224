public class Hero {
    public String name;
    protected float hp;
    int armor;

    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();
        h = ad;
        Hero h2 = new ADHero();
        ADHero ad2 = (ADHero)h2;
    }
}
