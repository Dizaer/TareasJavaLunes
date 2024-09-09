import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String texto = lector.nextLine(), textoConMayusculas = "";
        lector.close();
        String[] palabras = texto.split(" ");
        for (String palabra : palabras){
            textoConMayusculas=palabra.substring(0,1).toUpperCase()+palabra.substring(1);
            System.out.print(textoConMayusculas+" ");
        }
    }
}