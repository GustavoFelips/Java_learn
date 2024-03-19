package POO;

import java.util.Scanner;

public class main {
    public void menu(){
        String nome;
        double saldo;
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("---------------MENU----------------");
        System.out.println("0 - para sair\n2 - Para Adicionar Conta\n3 - Para Remover conta\n 4 - Para buscar uma conta");
        op = sc.nextInt();
        switch (op) {
            case 0:
                return;
            case 1:
                System.out.print("Nome : ");
                nome = sc.nextLine();
                System.out.print("Saldo: ");
                saldo = sc.nextDouble();
                //Conta c = new Conta(nome, saldo)

            default:
                break;
        }

    }
    public static void main(String[]args) throws ContaNaoEncontradaException {

        Banco imobiliario = new Banco();
        Conta c1= new Conta("Alice",20000);
        imobiliario.addConta(c1);

        Conta c2 = new Conta("Bruno",2000);
        imobiliario.addConta(c2);

        Conta c3 = new Conta("Clara",100);
        imobiliario.addConta(c3);

        System.out.println(imobiliario.buscaContaPorTitular("Alice"));

    }
}
