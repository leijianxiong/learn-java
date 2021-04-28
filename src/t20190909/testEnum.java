package t20190909;

public class testEnum {
    public static void main(String[] args) {
        Color red = Color.RED;
        Color green = Color.GREEN;
        Color blue = Color.BLUE;
        System.out.println("red:"+red);
        System.out.println("green:"+green);
        System.out.println("blue:"+blue.value);
        System.out.println("blue:"+blue.ordinal());

    }

    enum Color {
        RED(1),
        GREEN(2),
        BLUE(3);

        public final int value;

        private Color(int value) {
            this.value = value;
        }
    }
}
