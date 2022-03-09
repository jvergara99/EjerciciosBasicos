
import java.util.Scanner;

public class inicialesNombre {
    public static void main(String[] args) {
        String nombreCompleto;
        int espacio;
        String primerNombre;
        String apellido;
        Scanner in = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Ingresa tu primer nombre y apellido separado "
                + "por espacio:");
        nombreCompleto = in.nextLine();
        
        espacio = nombreCompleto.indexOf(' ');
        primerNombre = nombreCompleto.substring(0, espacio);
        apellido = nombreCompleto.substring(espacio + 1);
        
        System.out.println("Tu primer nombre es " + primerNombre + ", el "
                + "cual tiene "
                + primerNombre.length() + " caracteres" );
        System.out.println("Tu apellido es " + apellido + ", el cual tiene " + 
                apellido.length() + " caracteres");
        System.out.println("Tus iniciales son " + primerNombre.charAt(0) + 
                apellido.charAt(0));
    }
}
