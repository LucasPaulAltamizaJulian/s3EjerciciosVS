/**Leer 10 numeros enteros y mostrar la media de los valores positivos y la de los valores negativos
 */

import java.util.*;

public class E2 {
    public static void main(String[] args){
        int numer []=new int [10],a=1;
        float pos=0,neg=0,cp=0,cn=0;
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Numero "+a+" : ");
                numer[i]=s.nextInt();
                if(numer[i]>0){
                    pos=pos+numer[i];
                    cp++;
                }
                else if (numer[i]<0){
                    neg=neg+numer[i];
                    cn++;
                }
                a++;
            }
        }
        pos=pos/cp;
        neg=neg/cn;
        System.out.println("Media de positivos : "+pos);
        System.out.println("Media de negativos : "+neg);
    }
}
