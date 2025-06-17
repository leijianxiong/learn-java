package liaoxuefeng;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//LocalDateTime LocalDate LocalTime
//ZonedDateTime

public class Main10_3_and_4_local_date_time_p1 {
    public static void main(String[] args) {
        LocalDateTime departureAtBeijing = LocalDateTime.of(2019, 9, 15, 13, 0, 0);
        int hours = 13;
        int minutes = 20;
        LocalDateTime arrivalAtNewYork = calculateArrivalAtNY(departureAtBeijing, hours, minutes);
        System.out.println(departureAtBeijing + " -> " + arrivalAtNewYork);
        // test:
        if (!LocalDateTime.of(2019, 10, 15, 14, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 10, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        } else if (!LocalDateTime.of(2019, 11, 15, 13, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 11, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        }
    }

    static LocalDateTime calculateArrivalAtNY(LocalDateTime bj, int h, int m) {
        LocalDateTime arrivalAt = bj.plusHours(h).plusMinutes(m);
        System.out.println("arrivalAt:" + arrivalAt);

        ZonedDateTime zbjAt = arrivalAt.atZone(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime znyAt = zbjAt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("znyAt:" + znyAt);
        return znyAt.toLocalDateTime();
    }
}
