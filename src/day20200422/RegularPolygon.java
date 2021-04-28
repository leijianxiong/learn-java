package day20200422;

public enum RegularPolygon {
    // 有参数的枚举必须使用分号
    TRIANGLE(3), SQUARE(4), PENTAGON(5), HEXAGON(6);

    public final int value;

    private String s1;

    public String getS1() {
        return s1;
    }

    private RegularPolygon(int sides) {
        value = sides;
        switch (sides) {
            case 3:
                // 假设这些形状的构造方法接收的参数是边长和角度
                s1 = "s1:TRIANGLE";
                break;
            case 4:
                s1 = "s1:SQUARE";
                break;
            case 5:
                s1 = "s1:PENTAGON";
                break;
            case 6:
                s1 = "s1:HEXAGON";
                break;
        }
    }
}