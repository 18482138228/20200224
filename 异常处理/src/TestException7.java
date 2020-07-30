import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException7 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        try{
            method2();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void method2() throws FileNotFoundException{
        File f = new File("d:/LOL.exe");
        FileInputStream fis = new FileInputStream(f);

    }
}
