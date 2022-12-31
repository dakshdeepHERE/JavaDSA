public class Swapping {
    public static void main(String[] args) {
        int a = 24;
        int b = 21;
        change(a,b);
        System.out.println(a + " " + b);

    }

    private static void change(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
    }


}
