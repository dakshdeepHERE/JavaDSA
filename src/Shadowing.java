public class Shadowing {
    static int x = 90; // this will be shadowed at line 6 when u try to print the other x and this is known as shadowing
    public static void main(String[] args) {
        System.out.println(x);
        fun();
        int x = 40;
        System.out.println(x);
        fun();


    }
    static void fun(){
        System.out.println(x);
    }
}
