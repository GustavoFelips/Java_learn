package Camadas3.src.UI;

import Camadas3.src.Classes.Conta;
import Camadas3.src.Excecao.ExcecaoElementoInexistente;
import Camadas3.src.Negocio.ControladorConta;
import Camadas3.src.Negocio.IControladorConta;

public class Fachada implements IFachada{
    private IControladorConta controConta;

    public Fachada(){
        this.controConta = new ControladorConta();
    }

    public void inserirConta(Conta c){
        this.controConta.inserirConta(c);
    }
    public void alterarConta(String numero){
        this.controConta.alterarConta(numero);
    }

    public void removerConta(String numero){
        this.controConta.removerConta(numero);
    }
    public Conta buscarConta(String numero) throws ExcecaoElementoInexistente {
        return this.controConta.buscarConta(numero);
    }
    public boolean verificarExistenciaConta(String numero){
        return this.controConta.verificarExistenciaConta(numero);
    }
    public void mostrarContas(){
        this.controConta.mostrarContas();
    }
}
