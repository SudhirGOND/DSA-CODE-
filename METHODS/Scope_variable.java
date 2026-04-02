
public class Scope_variable {
    static int i;

    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        fun();
        System.out.println(i);
    }
    public static void fun() {
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }
}