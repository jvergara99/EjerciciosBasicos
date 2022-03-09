// Programa que genera tabla de multiplicar del 1 al 10
//2 x 1 = 2
import java.util.Scanner;
public class TablaMultiplicar {
    
    public static void main(String [] args) {
        
        Scanner entrada = new Scanner(System.in);
        //int numero;

        System.out.print("Ingrese número de tabla a multiplicar: ");
        int numero = entrada.nextInt();
        
        System.out.println("El número ingresado es:" + numero);     

        for (int i=1; i<=10 ; i++) {
            System.out.println(numero+ " x "+ i + " = "+ numero*i);
        }
    }
}
