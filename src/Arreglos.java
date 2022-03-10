import java.util.Scanner;
public class Arreglos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántas calificaciones desea ingresar:");
        int numCalif = entrada.nextInt();
        double [] calif = new double[numCalif];
        
        for (int i = 0; i < calif.length; i++) {
            System.out.print("Ingresa la calificación " +(i+1)+" de "+ calif.length +":");
            calif[i] = entrada.nextDouble();
        }
        
        for (int i = 0; i < calif.length; i++) {
            System.out.println("La calificación "+ (i+1)+ " es: "+ calif[i]);
        }
    }
    
}
