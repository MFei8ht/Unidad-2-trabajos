package practica1_u3;
import java.util.Scanner;
public class PRACTICA1_U3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num=scanner.nextInt();  
        if (num%2==0){
            System.out.println("su numero es par");
        }
        else{
            System.out.println("su numero no es par");
        }
    } 
}
