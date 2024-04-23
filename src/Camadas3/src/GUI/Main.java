package Camadas3.src.GUI;

import Camadas3.src.Classes.Conta;
import Camadas3.src.UI.Fachada;
import Camadas3.src.UI.IFachada;
import Camadas3.src.Excecao.ExcecaoElementoInexistente;


import java.util.Scanner;

public class Main{
    public static IFachada Fachada = new Fachada();
    public static void main(String[] Args){
        Conta c = new Conta("Adao","1",100);
        Conta c2 = new Conta("Eva","2",500);
        Fachada.inserirConta(c);
        Fachada.inserirConta(c2);
        Fachada.mostrarContas();

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i!=0){
            System.out.println("-------------- MENU ---------------");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Inserir Conta");
            System.out.println("[2] - Remover Conta");
            System.out.println("[3] - Alterar Conta");
            System.out.println("[4] - Buscar Conta");
            System.out.println("[5] - Relatorio de todas contas");
            System.out.print("Escolha uma opção: ");
            i =sc.nextInt();
            switch (i){
                case 1:
                    try {
                        System.out.print("Numero da Conta: ");
                        String numeroConta = sc.next();

                        System.out.print("Titular da Conta: ");
                        String titular = sc.next();
                        System.out.print("Insira o valor inicial: R$ ");
                        double saldo = sc.nextDouble();

                        Fachada.inserirConta(new Conta(titular,numeroConta,saldo));

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try{
                        System.out.print("Numero da Conta: ");
                        String numero = sc.next();
                        Fachada.removerConta(numero);
                        System.out.println("Conta removida com sucesso!");
                    }catch (Exception e){
                        System.out.println("Lista de contas está vazia!");
                    }
                    break;

                case 3:
                try{
                    System.out.print("Digite o numero da conta que deseja alterar: ");
                    String numC = sc.next();
                    Fachada.alterarConta(numC);
                }catch(Exception e){
                    System.out.println("Erro ao alterar");
                }
                    break;
                    
                case 4:
                    try {
                        System.out.print("Numero da Conta: ");
                        String num = sc.next();
                        System.out.println(Fachada.buscarConta(num));

                    }catch (ExcecaoElementoInexistente e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    Fachada.mostrarContas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção indisponivel!");
            }
            System.out.println();
        }
    }
}

