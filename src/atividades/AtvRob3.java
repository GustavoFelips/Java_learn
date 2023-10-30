package atividades;

import java.util.Scanner;

public class AtvRob3 {
    public static void main(String[] args){
        //Escreva um programa que imprima a tabuada (de 1 a 10). O usuário deve digitar o número
        //(de 1 a 10) para o qual deseja ver a tabuada.

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número para a tabuada: ");
        num = teclado.nextInt();
        System.out.printf("Tabuada de %d \n" ,num);
        for (int c = 0; c <= 10;c++){
            System.out.printf("%d x %d = %d \n",num,c,(num*c));
        }

    }
}
