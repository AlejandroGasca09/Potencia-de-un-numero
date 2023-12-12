import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1,numero2;
        double potencia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base:  ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce la potencia: ");
        numero2 = scanner.nextInt();
        potencia = Math.pow(numero1,numero2);
        System.out.println("La potencia base " + numero1 + " con el exponente " + numero2 + " es igual a : " + potencia);
    }
}


