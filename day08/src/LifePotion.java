public class LifePotion extends Item{

    @Override
    public void buy(){
        System.out.println("买了血瓶");
    }

    public static void main(String[] args) {
        LifePotion lp = new LifePotion();
        lp.buy();
        Item i = new Item();
        i.buy();
    }
}
