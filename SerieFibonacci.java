package seriefibonacci;
import java.util.Scanner;
public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0,y=1;
        int fib;
        System.out.println("Ingrese cuantos numeros quiere ver ");
        int num=scanner.nextInt();
        scanner.close();

        for (int i =1; i <=num; i++) {
            fib=x;
            x=y+x;
            y=fib;
            System.out.println(fib);

        }
                    System.out.println("Octavio Becerril Olivares");
    }
}