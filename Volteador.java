import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String texto=lector.nextLine(), textoVolteado="";
        lector.close();
        for (int k= texto.length();k>0;k--){
            textoVolteado+=texto.substring(k-1,k);
        }
        System.out.print(textoVolteado);
}
}