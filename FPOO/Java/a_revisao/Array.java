package a_revisao;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] valores = { 11,9,8,56,12,32,13,25 };
        int[] par = {};
        int[] impar = {};
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                par = Arrays.copyOf(par, par.length+1);
                par[par.length-1] = valores[i];
            }
            else {
                impar = Arrays.copyOf(impar, impar.length+1);
                impar[impar.length-1] = valores[i];
            }
        }
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
    }
}
