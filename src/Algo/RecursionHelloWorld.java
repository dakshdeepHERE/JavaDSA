package Algo;

//Question here is to write functions to print hello world 5 times but the rule is simple you cant call functions
//again and again or write hello world 5 times inside a single function itself
// we will practice recursion in this class and see by basics to understand the concept of recursion.

// Conclusion :- So by this question we understood what recursion is and it is to call different functions
// through 1 function itself to ease the work and so we don't have to call the functions again and again.

public class RecursionHelloWorld {
    public static void main(String[] args) {
    message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
}
