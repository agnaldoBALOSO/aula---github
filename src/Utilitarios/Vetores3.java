package Utilitarios;

public class Vetores3 {

    public static void main (String [] args) {

    int[] notas = {20,10,15,25,30,35};
    int NotaMaior = 0;

    for (int i = 0;  i < notas.length; i++){
    
    if (notas[i] > NotaMaior) {
        NotaMaior = notas[i];
    }
    }
    System.out. println ("O Maior vetor é" + NotaMaior);   
}
}
