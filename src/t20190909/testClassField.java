package t20190909;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

public class testClassField {
    public static void main(String[] args) throws Exception {
        //String2 s1 = new testClassField().new String2(new String[] {"a", "b"});
        String2 s1 = new testClassField().new String2("abc".getBytes());
        Field f = s1.getClass().getDeclaredField("value");
        Class<?> type = f.getType();
        Object v = f.get(s1);
        System.out.println("v type: "+type);
        System.out.println("v value: "+v);
    }

    public class String2 {
        public byte[] value;

        public String2(byte[] value) {
            this.value = value;
        }
    }
}
