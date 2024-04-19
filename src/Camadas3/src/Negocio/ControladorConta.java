package Negocio;

import Classes.Conta;
import Dados.IRepositorioConta;
import Dados.RepositorioConta;
import Excecao.ExcecaoElementoInexistente;

public class ControladorConta implements IControladorConta{
    private IRepositorioConta reposConta ;
    
    public ControladorConta(){
        this.reposConta = new RepositorioConta();
    }

    public void inserirConta(Conta c){
        this.reposConta.inserirConta(c);
    }

    public void alterarConta(String numero){
        this.reposConta.alterarConta(numero);
    }

    public void removerConta(String numero){
        reposConta.removerConta(numero);
    }
    public Conta buscarConta(String numero) throws ExcecaoElementoInexistente{
        return reposConta.buscarConta(numero);
    }
    
    public boolean verificarExistenciaConta(String numero){
        return reposConta.verificarExistenciaConta(numero);
    }
    
    public void mostrarContas(){
        this.reposConta.mostrarContas();
    }
    
}
