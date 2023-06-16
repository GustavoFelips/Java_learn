import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
    @Autor: Gustavo Felipe.
 */

public class TrabalhoFinal {
    //Cadastrar Estudantes
    public static void estudantes20(){

    }
    //Média de aprovetamento
    public static Float ma(float nota1,float nota2,float nota3, float ME){
        return ((nota1+2*nota2+3*nota3+ME)/7);
    }
    //Classificação de aproveitamento
    public static char tipo_aproveitamento(float ma){
        if (ma >= 9.0 && ma <= 10){
            return 'A';
        }
        else if ( 7.5 <= ma && ma < 9) {
            return 'B';
        }
        else if (ma >= 6 && ma < 7.5) {
            return 'C';
        }
        else if (ma >=4 && ma < 6) {
            return 'D';

        }
        return 'E';
    }
    public static void main(String[] args){
        String opcao = "a";
        Scanner teclado = new Scanner(System.in);
        estudantes20();
        float nota1,nota2,nota3, media, ma;
        char conceito;
        int estudantes = 1,id;
        int estAB = 0 , estCD = 0,estE = 0, estA = 0;

        while (opcao.equals("a")) {
            while (estudantes <= 2) {
                System.out.print("Número de identificação: ");
                id = teclado.nextInt();

                System.out.print("Nota 1 do aluno (0,0 a 10,0): ");
                nota1 = teclado.nextFloat();
                System.out.print("Nota 2 do aluno (0,0 a 10,0): ");
                nota2 = teclado.nextFloat();
                System.out.print("Nota 3 do aluno (0,0 a 10,0): ");
                nota3 = teclado.nextFloat();
                System.out.print("Qual a média dos exercícios? (0,0 a 10,0)");
                media = teclado.nextFloat();
                System.out.println(" ");
                estudantes++;
                ma = ma(nota1, nota2, nota3, media);
                conceito = tipo_aproveitamento(ma);
                if (conceito == 'A' || conceito == 'B') {
                    estAB++;
                } else if (conceito == 'C' || conceito == 'D') {
                    estCD++;
                } else if (conceito == 'E') {
                    estE++;
                }
                if (conceito == 'A') {
                    estA++;
                }
            }
            while (opcao.equals("a")) {
                System.out.println("---------------------Menu-----------------------");
                System.out.println("[a] Para cadastrar as médias dos 20 estudantes");
                System.out.println("[b] Para apresentar o número de estudantes que tiveram o aproveitamento com conceitos A e B.");
                System.out.println("[c] Para apresentar o número de estudantes que tiveram o aproveitamento com conceitos C e D.");
                System.out.println("[d] para apresentar o número de estudantes que tiveram o aproveitamento com conceito abaixo de D.");
                System.out.println("[e] Para apresentar o número de estudantes que tiveram o aproveitamento com conceito acima de B.");
                System.out.println("[f] Para sair do programa.");
                System.out.print(": ");
                opcao = teclado.next();
                if (opcao.equals("a")) {
                    estudantes = 1;
                    estAB = 0 ; estCD = 0; estE = 0; estA = 0;
                    break;
                }
                else if (opcao.equals("b")) {
                    System.out.printf("A quantidade de estudantes é %d \n",estAB);
                    opcao = "a";

                }
                else if(opcao.equals("c")){
                    System.out.printf("A quantidade de estudantes é %d \n",estCD);
                    opcao = "a";

                }
                else if(opcao.equals("d")){
                    System.out.printf("A quantidade de estudantes é %d \n",estE);
                    opcao = "a";

                }
                else if (opcao.equals("e")) {
                    System.out.printf("A quantidade de estudantes é %d \n", estA);
                    opcao = "a";

                }
                else if (opcao.equals("f")) {
                    break;
                }
                else {
                    System.out.println("ERRO! Essa opção não existe.");
                }
            }

        }

    }
}
