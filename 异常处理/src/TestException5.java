import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException5 {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try{
            new FileInputStream(f);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");


        }
        catch (FileNotFoundException | ParseException e){
            if(e instanceof FileNotFoundException){
                e.printStackTrace();
            }
            if(e instanceof ParseException){
                e.printStackTrace();
            }
        }
    }
}
