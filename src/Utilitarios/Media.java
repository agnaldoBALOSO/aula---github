package Utilitarios;

import java.util.Scanner;

public class Media {

    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Nome do Aluno:");
        String Aluno = sc.nextLine();

        System.out.print ("Digite o número Nota 1:");
        double nota1 = sc.nextDouble();

        System.out.print ("Digite O número Nota 2:");
        double nota2 = sc.nextDouble();
        double Media = CalcularMedia(nota1, nota2);
        VerificarSituacao(Media);
    }
        
    
    
    
            public static double CalcularMedia (double nota1, double nota2){
            double Media =  (nota1 + nota2) / 2;
            return Media;
        
        }

        public static void VerificarSituacao (double Media){
            
        if (Media >= 7) {
            System.out.print(" Aprovado:" + Media);
        } else if ( Media >= 5){

            System.out.print("Recuperação:" + Media);
        } else if ( Media < 5){

            System.out.print("Reprovado:" + Media);
            
        }
}
}
