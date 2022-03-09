import java.util.Scanner;
public class Main {
  public static void main(String [] args) {
    int suma = 0;
    double calif = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("¿Cuántos alumnos tienes?");
    int numAlumnos = in.nextInt();

    for (int i = 0; i < numAlumnos; i++ ) {
      do {
        System.out.print("Ingresa la calificación " + (i+1)+ " de "+ numAlumnos+":");
        calif= in.nextDouble();
      } while (calif <0 || calif >100);
      suma +=calif;
    }
    double promedio = suma / numAlumnos;
    System.out.printf("El promedio es: %.2f \n", promedio);
  }
}