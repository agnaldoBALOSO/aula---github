package Utilitarios;
import java.util.Scanner;

public class Vetores2 {  
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner (System.in);
    
            double [] notas = new double [5];
    
            for (int i = 0; i < 5; i++){
            System.out.println ("Digite um Nota:" + (i + 1)  );
            notas [i] = entrada.nextDouble();
            }
            
            System.out.println("Notas Digitadas");
            for (int i = 0; i < 5; i++){
            
            System.out.println("Notas:" + (i + 1) + notas[i]);
            }
            
            entrada.close();
    
}
}
