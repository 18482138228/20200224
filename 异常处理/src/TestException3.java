import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException3 {
    public static void main(String[] args) {
        File f = new File("D:/pak.txt");
        try{
            new FileInputStream(f);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2020-07-05");

        }
        catch (FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch(ParseException e2){
            e2.printStackTrace();
        }
    }
}
