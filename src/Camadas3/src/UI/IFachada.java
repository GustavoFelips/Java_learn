package UI;

import Classes.Conta;

public interface IFachada {
    public void inserirConta(Conta conta); //throws ExcecaoElementoJaExistente, ExcecaoRepositorio
    public void alterarConta(Conta conta); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public void removerConta(int numero); //throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public Conta buscarAluno(int numero);// throwsExcecaoElementoInexistente, ExcecaoRepositorio;
    public boolean verificarExistenciaAluno(int numero);
}
