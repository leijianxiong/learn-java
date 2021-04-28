package day20200422;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(RegularPolygon.HEXAGON.name());
        System.out.println(RegularPolygon.HEXAGON.value);
        System.out.printf("TRIANGLE: %s, %s\n", RegularPolygon.TRIANGLE, RegularPolygon.TRIANGLE.getS1());
    }
}
