import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int cantidadDivisores = 0;
        lector.close();
        for (int k = 1; k <= numero; k++) {
            if (numero % k == 0) {
                cantidadDivisores++;
            }
        }
        if (cantidadDivisores == 2) {
            System.out.println("El numero que ingresaste es primo");
        } else {
            System.out.println("El numero que ingresaste no es primo");
        }

        System.out.println("Ahora veras una lista de los numeros primos del 1-100");
        for (int k = 2; k <= 100; k++) {
            cantidadDivisores = 0;
            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                    cantidadDivisores++;
                }
            }
            if (cantidadDivisores == 2) {
                System.out.println(k);
            }
        }
    }
}