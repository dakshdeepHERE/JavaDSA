import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(1, 2, 3, 4, 6 ,6 ,7778 ,8);
    multiple(4,5, "Daksh", "Rohan","okpa","iojdaoihwdiuhbau");
    }
    static void  multiple(int a , int b , String ...v){
        System.out.println(Arrays.toString(new String[]{a + b + " " + v}));
    }
    static void fun(int ...v){ //here v will be array of integers
        System.out.println(Arrays.toString(v));

    }
}
