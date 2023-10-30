package atividades;

import java.util.Scanner;

public class AtvRob2 {
    public static void main(String[] args){
        //2) Faça um programa que leia 50 valores e no final, escreva o maior e o menor valor lido.

        float valor, maior = 0, menor = 0;
        Scanner teclado = new Scanner(System.in);

        for (int c = 1; c <= 50;c++){
            System.out.printf("Digite o valor %d : ",c);
            valor = teclado.nextFloat();
            if (valor > maior){
                maior = valor;
            }
            else if (valor < menor){
                menor = valor;
            }
        }
        System.out.printf("O maior número digitado é: %.2f\n",maior);
        System.out.printf("O menor Número digitado é : %.2f",menor);

    }
}
