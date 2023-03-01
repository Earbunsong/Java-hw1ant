import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a score");

        int score=s.nextInt();
        if(score>=85){
            System.out.println("i got grade A");
        } else if (score>=75)   {
            System.out.println("i got grade B");
        } else if (score>=65) {
            System.out.println("i got grade C");
        } else if (score>=60) {
            System.out.println("i got grade D");
        } else if (score>50) {
            System.out.println("i got grade E");
        }else {
            System.out.println("i got grade F");
        }
    }
}


