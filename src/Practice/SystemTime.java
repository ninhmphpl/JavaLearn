package Practice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.zip.DataFormatException;

public class SystemTime {
    public static void main(String[] args) {
        Date time = new Date();
        System.out.println("Now is: " + time);
//        tạo thời gian
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(time2);
        System.out.println(time2.getHour());
        //      tạo kiểu hiển thị
        DateTimeFormatter time3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
//        yyyy-MM-dd	"1988-09-29"
//        dd/MM/yyyy	"29/09/1988"
//        dd-MMM-yyyy	"29-Sep-1988"
//        E, MMM dd yyyy	"Thu, Sep 29 1988"

//        fomat time2 theo kiểu time3 và gán lại cho time4 theo kiểu Sring
        String time4 = time2.format(time3);
        System.out.println(time4);


    }
}
