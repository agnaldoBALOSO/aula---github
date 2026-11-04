package Utilitarios;
import java.util.Scanner;

public class Calculadora {

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("\nSoma: " + somar(numero1, numero2));
        System.out.println("Subtração: " + subtrair(numero1, numero2));
        System.out.println("Multiplicação: " + multiplicar(numero1, numero2));
        System.out.println("Divisão: " + dividir(numero1, numero2));

        sc.close();
    }
}