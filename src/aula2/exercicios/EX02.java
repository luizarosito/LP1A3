package aula2.exercicios;
import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        //Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num3 = sc.nextInt();

        var media = (num1 + num2 + num3) / 3;
        
        System.out.println("A média aritmética é: " + media);
        
    }
}