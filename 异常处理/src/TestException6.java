import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException6 {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try{
            FileInputStream fis = new FileInputStream(f);

        }
        catch (FileNotFoundException e){
            System.out.println("该文件不存在");
            e.printStackTrace();
        }
        finally {
            System.out.println("finally will be executed");
        }
    }
}
