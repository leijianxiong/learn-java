package day20210514;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List.of("2021-05-01 01:02:03", "2021-05-02 02:02:03", "2021-05-03 03:04:05").stream().map(time -> LocalDateTime.parse(time, f)).forEach(System.out::println);
    }
}
