import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        System.out.println(now.getTime());

        long millis = now.getTime();
        System.out.println(millis);

        Date dateFromTime = new Date(millis);

        long numberOfMilliSeconds = millis/1000;
        Date date2009 = new Date(numberOfMilliSeconds);
        System.out.println(date2009);

        if (date2009.before(now)){
            System.out.println("2009 is earlier than now");
        }
    }
}
