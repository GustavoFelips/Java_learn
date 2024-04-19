import Classes.Conta;
import UI.Fachada;
import java.util.Scanner;
import Excecao.ExcecaoElementoInexistente;

public class Main {
    public static Fachada IFachada = new Fachada();
    public static void main(String[] Args){
        Conta c = new Conta("Gustavo","1",100);
        Conta c2 = new Conta("Vitor","2",500);
        IFachada.inserirConta(c);
        IFachada.inserirConta(c2);
    }  
}
