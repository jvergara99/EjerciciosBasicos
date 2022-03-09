
public class Dados {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int totalDados;
        
        dado1 = (int)(Math.random()*6) + 1;
        dado2 = (int)(Math.random()*6) + 1;
        totalDados =  dado1 + dado2;
        
        System.out.println("Resultado del primer dado: " + dado1);
        System.out.println("Resultado del segundo dado: " + dado2);
        System.out.println("Total de ambos dados : " + totalDados);
    }
}
