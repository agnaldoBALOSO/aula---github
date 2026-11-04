
package Utilitarios;
public class Vetores {

    public static void main(String[] args) {
        int[] notas = {10,15,20,25,30,35,40,45,50,55};

        System.out.println("Total de Notas" + notas.length);
        System.out.println("Notas:");

        for (int i = 0; i <notas.length; i++) {
            System.out.println(notas[i]);
        }
}
}