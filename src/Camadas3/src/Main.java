import Classes.Conta;
import UI.Fachada;

public class Main {
    public static Fachada IFachada = new Fachada();
    public static void main(String[] Args){
        Conta c = new Conta("Gustavo","1",100);
        Conta c2 = new Conta("Vitor","2",500);
        IFachada.inserir(c);
        IFachada.inserir(c2);
        IFachada.mostrar();
        IFachada.alterarConta(c);
        IFachada.mostrar();
        
    }


}
