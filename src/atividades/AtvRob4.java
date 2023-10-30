package atividades;

import java.util.Scanner;

public class AtvRob4 {
    public static void main(String[] args){
        //Faça um programa que solicita ao usuário um número inteiro positivo e, em seguida,
        //calcula e exibir o fatorial do número digitado.

        int num;
        long fat = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o fatorial: ");
        num = teclado.nextInt();

        while (num >= 1){
            System.out.printf("%d ",num);
            if (num > 1){
                System.out.print("x ");
            }
            fat = fat * num--;
        }
        System.out.printf("= %d",fat);
    }

}
