import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = s.nextInt();
        System.out.println("请输入第二个数字：");
        int b = s.nextInt();
        System.out.println("总数是"+(a+b));
    }
}
