package liaoxuefeng;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//LocalDateTime LocalDate LocalTime
//ZonedDateTime

public class Main10_3_and_4_local_date_time {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        System.out.println("取当前时间");
        System.out.println(dt);
        System.out.println(d);
        System.out.println(t);

        // 指定日期和时间:
        // 2006-01-02
        LocalDate d2 = LocalDate.of(2006, 01, 02);
        LocalTime t2 = LocalTime.of(15, 04, 05);
        LocalDateTime dt2 = LocalDateTime.of(2006, 01, 02, 15, 04, 05);
        LocalDateTime dt3 = LocalDateTime.of(d2, t2);
        System.out.println("指定日期和时间");
        System.out.println("d2:" + d2);
        System.out.println("t2:" + t2);
        System.out.println("dt2:" + dt2);
        System.out.println("dt3:" + dt3);

        // 自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("时间解析");
        LocalDateTime dtp = LocalDateTime.parse("2006-01-02T15:04:05");
        LocalDate dp = LocalDate.parse("2006-01-02");
        LocalTime tp = LocalTime.parse("15:04:05");
        System.out.println("dtp: " + dtp);
        System.out.println("dtp format: " + dtp.format(dtf));
        System.out.println("dp: " + dp);
        System.out.println("tp: " + tp);

        LocalDateTime ldt = LocalDateTime.of(2006, 01, 02, 15, 04, 05);
        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime zny = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println("ldt:" + ldt);
        System.out.println("zbj:" + zbj);
        System.out.println("zny:" + zny);

        // 以中国时区获取当前时间:
        ZonedDateTime zbj2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        // 转换为纽约时间:
        ZonedDateTime zny2 = zbj2.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj2);
        System.out.println(zny2);
    }
}
