import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese dos números reales");
        System.out.println("separados por uno o mas espacios:");
        
        double n1, n2;
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        System.out.println("Ingresaste los números "+ n1 + " y " + n2);
        
        System.out.println("Ingresa  palabras");
        
        String cadena3;
        cadena3 = entrada.nextLine();
        System.out.println("Ingresaste:" + cadena3);
        
        /*
        String cadena1, cadena2;
        cadena1 = entrada.next();
        cadena2 = entrada.next();
        System.out.println("Ingresaste \"" + cadena1 + "\" y \""+ cadena2 + "\"");
        */
        

    }
}
