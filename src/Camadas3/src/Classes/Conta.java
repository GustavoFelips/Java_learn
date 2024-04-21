package Camadas3.src.Classes;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular,String numero , double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void saque(double valor){
        if ((this.getSaldo() - valor >=0) && (valor>0)){
            this.setSaldo(this.getSaldo()-valor);
        }
    }

    public String toString(){
        return String.format("Nome : %s \nNumero de Conta: %s \nSaldo:R$ %.2f\n",this.getTitular(),this.getNumero(),this.getSaldo());
    }

    public boolean equals(Object o){
        if (o != null){
            if (o == this){
                return true;
            }
            if(o instanceof Conta){
                Conta c = (Conta) o;
                if (c.getNumero() == (this.getNumero())){
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }


}