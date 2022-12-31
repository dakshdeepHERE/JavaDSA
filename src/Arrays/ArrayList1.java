package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(199);
//        list.add(89);
//        list.add(19);
//        list.add(122);
//        list.add(121);
//        list.add(199);
//        list.add(89);
//        list.add(19);
//        list.add(122);
//        list.add(121);
//        // we can even add more than 10 items because of the list property
//        System.out.println(list);
//        System.out.println(list.contains(199));
        
        // for input from the system we can follow the down below method given :-

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Arraylist you want :- ");
        int ArraySize = in.nextInt();
        for (int i = 0; i < ArraySize ; i++) {
            list.add(in.nextInt());
        }
        System.out.print(list);

        // how to get the item from the ArrayList

        for (int i = 0; i < ArraySize; i++) {
            System.out.println(list.get(i)); //pass index here list[index] syntax will not work here

        }
        



    }
}
