
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int ladoTamaño=lector.nextInt();
        lector.close();
        int[][] triangulo = new int[ladoTamaño][];
        for (int k=0;k<ladoTamaño;k++){
            triangulo[k]=new int [k+1];
            triangulo[k][0]=1;
            triangulo[k][k]=1;
            for (int i=1; i<k;i++){
                triangulo[k][i]=triangulo[k-1][i-1]+triangulo[k-1][i];
            }
        }
        for (int k=0;k<ladoTamaño;k++){
            for (int j=ladoTamaño-k-1;j>=0;j--){
                System.out.print(" ");
            }
            for (int i=0; i<triangulo[k].length; i++){
                System.out.print(triangulo[k][i]+" ");
            }
            System.out.println();
        }
    }
}