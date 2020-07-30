import java.io.File;
import java.io.FileInputStream;

public class TestException8 {
    public static void main(String[] args) {
        int k = 5/0;

        int []j = new int[5];
        j[10] = 10;

        String str = null;
        str.length();
    }
}
