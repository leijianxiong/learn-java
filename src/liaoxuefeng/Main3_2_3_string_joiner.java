package liaoxuefeng;

public class Main3_2_3_string_joiner {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        String select = String.join(", ", fields);
        return String.format("SELECT %s FROM employee", select);
        // return "SELECT " + select + " FROM employee";
    }
}
