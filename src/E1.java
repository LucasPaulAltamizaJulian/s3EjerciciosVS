/**Leer la altura de n personas y calcular la media 
 * Mostrar cuantos hay superiores a la media 
 */
import java.util.*;
public class E1 {
    public static void main(String[] args){
        float numer [],a=1,media=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el numero de personas");
            numer =new float[sc.nextInt()];
            for (int i = 0; i < numer.length; i++) {
                System.out.print("Ingrese la altura de la persona "+a+" : ");
                numer[i]=sc.nextFloat();
                media=media+numer[i];
                a++;
            }
        }
        media=media/numer.length;
        a=0;
        for(int i=0;i<numer.length;i++){
            if(media<numer[i])
            a++;
        }
        System.out.println("La media de "+numer.length+" personas es : "+media);
        System.out.println("Hay "+a+" personas superiores a la media.");
    }
}
