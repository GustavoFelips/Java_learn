package Dados;

import java.util.ArrayList;
import java.util.Scanner;

import Classes.Conta;

public class RepositorioConta {
    public ArrayList<Conta> contas;
    public int qtd_contas;
    public Scanner sc = new Scanner(System.in);

    public RepositorioConta(){
        this.contas = new ArrayList<Conta>();
        this.qtd_contas = contas.size();
    }

    public void inserir(Conta c){
        this.contas.add(c);
    }

    public void alterarConta(Conta conta){
        for (Conta c : contas){
            if (c.equals(conta)) {
                System.out.println("Novo número de conta: ");
                c.setNumero(sc.nextLine());
                System.out.println("Novo nome de Titular: ");
                c.setTitular(sc.nextLine());
                System.out.println("Novo saldo");
                c.setSaldo(sc.nextDouble());


                
            }
        }
    } //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    //public void removerConta(int numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    //public Conta buscarAluno(int numero);// throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    //public boolean verificarExistenciaAluno(int numero);
    public void mostrar(){
        for (Conta c : contas){
            System.out.println(c);
        }

    }
}
