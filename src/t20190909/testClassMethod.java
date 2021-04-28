package t20190909;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testClassMethod {
    public static void main(String[] args) throws Exception {
        test1();
    }

    public static void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Method m1 = studentClass.getMethod("getScore", String.class);

        int i = Integer.parseInt("123");
        
    }

    public void test2() {

    }

    /*
    类
     */
    class Person {
        public String getName() {
            return "name1";
        }
    }

    class Student extends Person {
        public int getScore(String type) {
            return 99;
        }

        private int getGrade(int year) {
            return 1;
        }
    }
}
