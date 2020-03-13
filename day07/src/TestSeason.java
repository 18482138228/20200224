public class TestSeason {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        for (Season s2 :Season.values()
                ) {
            System.out.println(s2);

        }
    }
}
