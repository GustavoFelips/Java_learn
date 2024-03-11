package POO;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removeConta(Conta conta) {
        this.contas.remove(conta);
    }

    public Conta buscaContaPorNumero(String numero) throws ContaNaoEncontradaException {
        for (Conta conta : this.contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada");
    }
    public Conta buscaConta(Conta conta) throws ContaNaoEncontradaException {
        if (this.contas.contains(conta)) {
            return conta;
        }
        throw new ContaNaoEncontradaException("Conta não encontrada");
    }
}
