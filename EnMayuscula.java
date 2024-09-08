import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String texto = lector.nextLine(), textoConMayusculas = "";
        String caracterAuxiliar;
        lector.close();
        for (int k = 0; k < texto.length(); k++) {
            if (k < 1) {
                caracterAuxiliar = texto.substring(k, k + 1).toUpperCase();
            } else {
                if (texto.substring(k - 1, k).equals(" ")) {
                    caracterAuxiliar = texto.substring(k, k + 1).toUpperCase();
                } else {
                    caracterAuxiliar = texto.substring(k, k + 1);
                }
            }
            textoConMayusculas += caracterAuxiliar;
        }
        System.out.print(textoConMayusculas);
    }
}