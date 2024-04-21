package Camadas3.src.Negocio;
import Camadas3.src.Classes.Conta;
import Camadas3.src.Excecao.ExcecaoElementoInexistente;

public interface IControladorConta {
    public void inserirConta(Conta conta); //throws ExcecaoElementoJaExistente, ExcecaoRepositorio
    public void alterarConta(String numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public void removerConta(String numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public Conta buscarConta(String numero) throws ExcecaoElementoInexistente;
    public boolean verificarExistenciaConta(String numero);
    public void mostrarContas();
}
