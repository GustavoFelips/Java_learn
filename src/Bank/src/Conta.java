public class Conta {
     private String num_conta;
     private String nome_titular;
    private double saldo;

    public Conta(String num_conta, String nome_titular, double saldo){
        this.num_conta = num_conta;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }
    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return String.format("Nome titular: %s \nNúmero da conta: %s \nSaldo: R$%.2f",getNome_titular(),getNum_conta(),
                getSaldo());
    }
    public boolean equals(Conta c){
        if(this.num_conta.equals(c.num_conta)){
            return true;
        }
        return false;
    }
}
