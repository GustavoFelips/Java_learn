package Negocio;
import Classes.Conta;
import Excecao.ExcecaoElementoInexistente;

public interface IControladorConta {
    public void inserirConta(Conta conta); //throws ExcecaoElementoJaExistente, ExcecaoRepositorio
    public void alterarConta(String numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public void removerConta(String numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public Conta buscarConta(String numero) throws ExcecaoElementoInexistente;
    public boolean verificarExistenciaConta(String numero);
    public void mostrarContas();
}
