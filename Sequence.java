package Fibonacci;

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        int w = 0,x = 1,y,z, count ; // count = how many numbers will appear on the output
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        count = scanner.nextInt();

        System.out.println("The result of Fibonacci Sequence is:");
        System.out.print(w + " " + x);

        for(z=2;z<count;z++){
            y= w+x;//F(n)=Fn-1 + Fn-2
            System.out.print(" "+ y);
            w = x;
            x = y;

        }
    }
    


}
