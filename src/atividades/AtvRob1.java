package atividades;

import java.util.Scanner;

public class AtvRob1 {
    public static void main(String[] args){
        //1) Escreva um programa para ler o número de estudantes existentes em uma turma e, em
        //seguida, ler as notas destes estudantes, calcular e escrever a média aritmética dessas notas
        //lidas. OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.

        float estudantes , nota ,soma = 0;
        float media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de alunos na Turma: ");
        estudantes = teclado.nextInt();

        for (int c = 1; c <= estudantes; c++){
            System.out.print("Digite a nota do aluno " + c + ": ");
            nota = teclado.nextInt();
            System.out.println("");

            while (nota < 0 || nota > 10) {
                System.out.println("ERRO! Digite uma nota de 0 à 10");
                System.out.print("Digite a nota do aluno " + c + ": ");
                nota = teclado.nextInt();
                System.out.println(" ");
            }
            soma = soma + nota;
        }
        media = soma/estudantes;
        System.out.printf("\nA média da turma é %.2f",media);
    }
}
