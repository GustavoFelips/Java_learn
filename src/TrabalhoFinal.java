import java.util.Scanner;
/**
    @Autores: Clara Oliveira, Gustavo Felipe, Helder Bernardo e Lucas Carneiro.
 */

public class TrabalhoFinal {
    //Adicionar Notas
    public static Float nota(int ord){
        Scanner teclado = new Scanner(System.in);
        float nota;
        System.out.printf("Nota %d do aluno (0,0 a 10,0): ",ord);
        nota = teclado.nextFloat();
        while (nota > 10 || nota < 0){
            System.out.println("\nPor Favor, digite uma nota entre 0 e 10");
            System.out.printf("Nota %d do aluno (0,0 a 10,0): ",ord);
            nota = teclado.nextFloat();
        }
        return nota;
    }
    //Adicionar médias
    public static Float media() {
        Scanner teclado = new Scanner(System.in);
        float media;
        System.out.print("Qual a média dos exercícios? (0,0 a 10,0): ");
        media = teclado.nextFloat();
        while (media > 10 || media < 0) {
            System.out.println("\nPor Favor, digite uma nota entre 0 e 10");
            System.out.print("Qual a média dos exercícios? (0,0 a 10,0): ");
            media = teclado.nextFloat();
        }
        return media;
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
        float nota1,nota2,nota3, media, ma;
        char conceito;
        int estudantes = 0,id, c = 0;
        int estAB = 0 , estCD = 0,estE = 0, estA = 0;

        System.out.print("Digite a quantidade de alunos para o cadastro: ");
        estudantes = teclado.nextInt();


        while (opcao.equals("a")) {
            while (c < estudantes) {
                System.out.print("Número de identificação: ");
                id = teclado.nextInt();
                nota1 = nota(1);
                nota2 = nota(2);
                nota3 = nota(3);
                media = media();
                System.out.println(" ");
                c++;
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
                System.out.println("[a] Para cadastrar as médias dos estudantes");
                System.out.println("[b] Para apresentar o número de estudantes que tiveram o aproveitamento com conceitos A e B.");
                System.out.println("[c] Para apresentar o número de estudantes que tiveram o aproveitamento com conceitos C e D.");
                System.out.println("[d] para apresentar o número de estudantes que tiveram o aproveitamento com conceito abaixo de D.");
                System.out.println("[e] Para apresentar o número de estudantes que tiveram o aproveitamento com conceito acima de B.");
                System.out.println("[f] Para sair do programa.");
                System.out.print(": ");
                opcao = teclado.next();
                if (opcao.equals("a")) {
                    estudantes = 0; c = 0;
                    estAB = 0 ; estCD = 0; estE = 0; estA = 0;
                    System.out.print("Digite a quantidade de alunos para cadastrar as notas: ");
                    estudantes = teclado.nextInt();
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
                    opcao = "a";
                }
            }

        }

    }
}
