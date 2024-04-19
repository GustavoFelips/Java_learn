package Negocio;

import Classes.Conta;
import Dados.RepositorioConta;

public class ControladorConta {
    private RepositorioConta reposConta = new RepositorioConta();

    public void inserir(Conta c){
        this.reposConta.inserir(c);
    }
    public void alterarConta(Conta conta){
        this.reposConta.alterarConta(conta);
    }
    public void mostrar(){
        this.reposConta.mostrar();
    }
}
