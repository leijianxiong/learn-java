package helloworld;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("byte:"+(new byte[1])[0]);
        System.out.println("short:"+(new short[1])[0]);
        System.out.println("int:"+(new int[1])[0]);
        System.out.println("long:"+(new long[1])[0]);

        System.out.println("float:"+(new float[1])[0]);
        System.out.println("double:"+(new double[1])[0]);

        System.out.println("boolean:"+(new boolean[1])[0]);
        System.out.println("char:"+(new char[1])[0]);

        System.out.println("String:"+(new String[1])[0]);
        /*
byte:0
short:0
int:0
long:0

float:0.0
double:0.0

boolean:false
char: 

String:null
         */
    }
}