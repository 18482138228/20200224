import java.io.File;
import java.io.FileInputStream;

public class TestException2 {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch (Exception e){
            System.out.println("打开失败");
            e.printStackTrace();
        }
    }
}
