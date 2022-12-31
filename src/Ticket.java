import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ticket {
    static int counter =10;
    static Queue<String > names = new LinkedList<String>();
    public static void getReserve(int tickets){
        Scanner sc = new Scanner(System.in);
        if(tickets<=counter){
            for (int i=0; i<tickets; i++){
                System.out.println("Enter name please");
                String s = sc.next();
                names.add(s);
                counter--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        do {
            System.out.println("---- Ticket booking system");
            System.out.println("-----1 For reservation -----");
            System.out.println("-----2 View remaining tickets");
            System.out.println("-----3 Sold ticket lists");
            System.out.println("-----4 Exit");
            System.out.println("Enter your input: ");
            choice = in.nextInt();




            switch (choice){
                case 1:
                    System.out.println("Enter how many tickets you want to buy: ");
                    int ticket = in.nextInt();
                    System.out.println("I am for reservation");
                    break;
                case 2:
                    System.out.println("I am for remaining tickets");
                    break;
                case 3:
                    System.out.println("I am for sold tickets");
                    break;
            }

        }
        while(choice!=4);
        System.out.println("Thanks for using the ticket system");

        }

    }

