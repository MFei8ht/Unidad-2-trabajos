package cajeroautomatico;
import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    System.out.println("1.Consultar saldo");
    System.out.println("2.Depositar dinero");
    System.out.println("3.Retirar dinero");
    
    System.out.println("Elija la opcion con un numero ");
    int opc=scanner.nextInt();
    double saldo=2500;
    
    switch (opc) {
        case 1:
            System.out.println("Su saldo es de:$"+saldo);
            break;
        case 2:
            System.out.println("Ingrese el saldo que va a depositar");
            double deposito=scanner.nextDouble();
            saldo=saldo+deposito;
            System.out.println("Ahora cuenta con un saldo de: $"+saldo);
            break;
        case 3:
            System.out.println("¿Cuanto dinero quiere retirar?");
            double retiro=scanner.nextDouble();
            if (retiro<=saldo) {
                saldo=saldo-retiro;
                System.out.println("Su retiro fue exitoso");
                System.out.println("Ahora su saldo es de:$"+saldo); 
            }
            else{
                System.out.println("Fondos insuficientes");
            }
            break;
            
        default:
            System.out.println("Opcion no valida.Por favor seleccione una opcion valida.");
        break;
    }
}    
    }    
