public class ADAPHero extends Hero implements AD,AP{
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("魔法攻击");
    }
}
