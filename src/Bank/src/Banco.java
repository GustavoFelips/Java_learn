import java.lang.Exception;
import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public void adicionar(Conta c){
        contas.add(c);
    }
    public void remover_conta(Conta c){
        contas.remove(c);
    }
    public void mostrar_contas(){
        if(contas.size() > 0){
            for(Conta conta : contas){
                System.out.println(conta);
            }
        }
        else System.out.println("Sem contas");
    }
    public Conta buscarContaPorNumero(String numeroConta) {
        for (Conta c : contas) {
            if (c.getNum_conta().equals(numeroConta)) {
                return c;
            }
        }
    }

}
