class EnemyHeroIsDeadException extends Exception{
    public EnemyHeroIsDeadException(){//无参构造方法

    }
    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }
}
