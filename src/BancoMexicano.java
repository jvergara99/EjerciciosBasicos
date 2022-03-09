import java.util.Scanner;

public class BancoMexicano {

    public static void main(String[] args) {
        int repetidor;
        double arena, metroCuadrado, largo, alto;
        Scanner in =  new Scanner(System.in);
        repetidor = 1;
        
        System.out.println("Bienvenidos al Banco Mexicano");
       
        do {            
            System.out.println("Ingresa el largo:");
            largo = in.nextDouble();
            if (largo <= 0) {
                System.out.println("Error!");
            }
        } while (largo <= 0);
        
        do {            
            System.out.println("Ingresa el alto:");
            alto = in.nextDouble();
            if (alto <= 0) {
                System.out.println("Error!");
            }
        } while (alto <= 0);
        
        metroCuadrado = largo * alto;
        arena = metroCuadrado * 0.5;
        
        System.out.println("La pared mide:"+ metroCuadrado);
        System.out.println("Arena requerida:"+ arena);
    }
}
