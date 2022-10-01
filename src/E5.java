/*
MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL SECUNDARIA
*/
import java.util.*;
public class E5 {
    public static void main(String[] args){
        int [][]matriz=new int[10][10];
        int suma=0,cont;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el numero en la posicion {"+i+"}{"+j+"} : ");
                matriz[i][j]=(int) (Math.random()*100);
                System.out.println(" "+matriz[i][j]);
            }
        }
        cont=9;
        for (int i = 0; i < 10; i++) {
            suma=suma+matriz[i][cont];
            cont--;
        }
        System.out.println("La suma de la diagonal secundaria es : "+suma);
    }
}
