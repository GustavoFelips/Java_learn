import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("01", "Gustavo", 100);
        Banco banco = new Banco();
        banco.adicionar(conta);
        banco.mostrar_contas();
        System.out.println("-------------------");
        banco.buscarContaPorNumero("01");

    }
}