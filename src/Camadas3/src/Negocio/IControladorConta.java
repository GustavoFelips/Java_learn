package Negocio;
import Classes.Conta;

public interface IControladorConta {
    public void inserirConta(Conta conta); //throws ExcecaoElementoJaExistente, ExcecaoRepositorio
    public void alterarConta(Conta conta); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public void removerConta(int numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public Conta buscarAluno(int numero);// throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public boolean verificarExistenciaAluno(int numero);
}
