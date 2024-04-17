package Dados;

import Classes.Conta;

public class RepositorioConta {
    public Conta[] contas;
    public  int qtd_contas;
    public RepositorioConta(){
        this.contas = new Conta[100];
        this.qtd_contas = 0;
    }

    public void inserir(Conta c){
        this.contas[qtd_contas++] = c ;
    }
    public void mostrar(){
        for (Conta c : contas){
            System.out.println(c);
        }

    }
}
