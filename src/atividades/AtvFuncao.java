package atividades;

import java.util.Scanner;

public class AtvFuncao {
    public static float volume_cubo(float lado){
        return (lado*lado*lado);
    }
    public static float volume_paralele(float x, float y , float z){
        return (x*y*z);
    }
    public static double volume_esfera(float raio){
        return ((4*Math.PI*Math.pow(raio,3))/3);
    }
    public static double volume_cilindro(float raio, float altura){
        return (Math.PI*Math.pow(raio,2)*altura);
    }
    public static double raiz(float numero){
        return (Math.sqrt(numero));
    }

    public static void menu(){
        System.out.println("------------------ Menu de Opções -------------");
        System.out.println("Escolha qual sólido geométrico você deseja achar o volume: ");
        System.out.println("[0] Encerrar");
        System.out.println("[1] : cubo");
        System.out.println("[2] : Paralelepípedo");
        System.out.println("[3] : esfera");
        System.out.println("[4] : Cilindro");
        System.out.println("[5] : Para achar a raiz de um número\n---------------");
    }

    public static void main(String[] args){
        int opcao , continua = 1;
        float x, a ,b ,c , raio, h, num , raiob;
        double volume, resp;
        Scanner telcado = new Scanner(System.in);
        do {
            menu();
            opcao = telcado.nextInt();
            switch (opcao){
                case (1):
                    System.out.print("Aresta do cubo: ");
                    x = telcado.nextFloat();
                    volume = volume_cubo(x);
                    System.out.printf("\nO volume do cubo tem resultado = %.2fm³",volume);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Informe as seguintes dimensões do paralelepípedo: \n");
                    System.out.print("Altura : ");
                    a = telcado.nextFloat();
                    System.out.print("Largura: ");
                    b = telcado.nextFloat();
                    System.out.print("Comprimento: ");
                    c = telcado.nextFloat();
                    volume = volume_paralele(a,b,c);
                    System.out.printf("O volume do paralelepípedo é %2.fm³",volume);
                    break;
                case 3:
                    System.out.print("Raio da esfera: ");
                    raio = telcado.nextFloat();
                    volume  = volume_cubo(raio);
                    System.out.printf("\nO volume da esfera tem resultado = %.2fm³\n",volume);
                    break;
                case 4:
                    System.out.println("Informe as seguintes dimensões do cilindro: ");
                    System.out.print("Raio da base: ");
                    raiob = telcado.nextFloat();
                    System.out.print("Altura: ");
                    h = telcado.nextFloat();
                    volume = volume_cilindro(raiob,h);
                    System.out.printf("O volume do cilindro é %.2f m³\n",volume);
                    break;
                case 5:
                    System.out.print("Número para achar a raiz: ");
                    num = telcado.nextFloat();
                    resp = raiz(num);
                    System.out.printf("\nA raiz de %.0f é %.0f\n",num,resp);
                    break;
                default:
                    System.out.println("\nOpção Inexistente........");
                    System.out.println("[0] para sair");
            }
            System.out.println("Deseja continuar? [1] - > Sim / [2] - > Não: ");
            opcao = telcado.nextInt();

        }while (opcao!=0);
    }
}
