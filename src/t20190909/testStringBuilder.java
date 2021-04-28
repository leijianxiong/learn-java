package t20190909;

public class testStringBuilder {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql2(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s);
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        //return "";

        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO " + table + " (");
//        sb.append(table);
//        sb.append(" (");

        int length = fields.length;
        for (int i = 0; i < length; i++) {
            String field = fields[i];
            sb.append(field);
            if (i < length - 1) {
                sb.append(", ");
            }
        }

        sb.append(") VALUES (?, ?, ?)");

        return sb.toString();
    }

    static String buildInsertSql2(String table, String[] fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(table).append(" (");
        for (String field : fields) {
            sb.append(field).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(") VALUES (?, ?, ?)");
        return sb.toString();
    }
}
