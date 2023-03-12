package aula2.exercicios;

import java.util.Scanner;

public class EX01 {

    // Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor do número: " + num + " é " + antecessor);
        System.out.println("O sucessor do número: " + num + " é " + sucessor);
    }

}
