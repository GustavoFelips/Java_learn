package UI;

import Classes.Conta;
import Negocio.ControladorConta;

public class Fachada {
    private ControladorConta controConta = new ControladorConta();

    public void inserir(Conta c){
        this.controConta.inserir(c);
    }
    public void mostrar(){
        this.controConta.mostrar();
    }
}
