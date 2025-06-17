package day20241031;

public class Demo4_4 {
    public static void main(String[] args) {
      int i = 100;
      int j = 100;
      compare(i, j);
    }

    public static void compare(Integer obj1, Integer obj2) {
      Integer obj3 = obj1+1;
      Integer obj4 = obj2+1;
      System.out.println("" + (obj3==obj4));
    }
  }