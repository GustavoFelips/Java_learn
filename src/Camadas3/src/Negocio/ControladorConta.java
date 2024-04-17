package Negocio;

import Classes.Conta;
import Dados.RepositorioConta;

public class ControladorConta {
    private RepositorioConta reposConra = new RepositorioConta();

    public void inserir(Conta c){
        this.reposConra.inserir(c);
    }
    public void mostrar(){
        this.reposConra.mostrar();
    }
}
