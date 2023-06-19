import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        /* ---------------------------------------------------------------------
         *int numero = 3;
         *int numero1 = (int) 3; //typecast
         *Integer numero2 = new Integer(3); //Objeto; Classe wrapper-Invólucro
         ------------------------------------------------------------------------*/

        //Saída de dados
        /*----------------------------------------------------------
         *float nota = 8.5f; // ou float(8.5)

         * !println - > pula linha
         *System.out.println("A nota é " + nota);

         * !printf - > formatação com % e a inicial do tipo
         *System.out.printf("A nota é %.2f \n", nota);

         * !format - > Mesmo funcionamento do printf
         *System.out.format("A nota é %.2f \n", nota);
         -------------------------------------------------------------*/

        //Entrada de dados
        /*-------------------------------------------------------
         *Importar o java.util.Scanner
         *Scanner teclado = new Scanner(System.in);
         *System.out.println("Digite o nome: ");
         *String nome = teclado.nextLine();
         *System.out.println("Digite a nota: ");
         *float not = teclado.nextFloat();
         *System.out.printf("A nota de %s é %.2f \n", nome, nota);
         ----------------------------------------------------------*/

        //Conversão de tipos
        /* --------------------------------------------------
        //Inteiro para string
        int idade = 30;
        String valor = Integer.toString(idade);

        //String para inteiro
        String notaS = "10";
        int notaI = Integer.parseInt(notaS);

        //String para float
        String numeroI = "7";
        float numeroF = Float.parseFloat(numeroI);
         ------------------------------------------------*/

        //Estrutura ternária
        /*------------------------------------------
        *Scanner teclado = new Scanner(System.in);
        *String esc = teclado.nextLine();
        *int g = (esc.equals("oi"))?5:0;
        *System.out.println(g);
       ----------------------------------------------*/
        //Operadores Lógicos
        /*
        * && - > and
        * || - > or
        * ^ - > xor
        */

        //Estruturas de repetição
        // while - > enquanto(condição)
        /*----------------------------------------------
        *int c = 0;
        *while (c < 10){
        *    c++;
        *    System.out.println(c);
        *}
        -------------------------------------------------*/
        //do | while
        /* -------------------------------------------
        *int c = 0;
        *do {
        *    System.out.println(c);
        *    c++;
        *}while (c <= 4);
        -------------------------------------------------/*
         */
        // For - > faça
        /*
        *for (int c = 0; c <=3;c++){
        *    System.out.println(c);
        *}
        */
        //Continue - > dentro de um if para retorna ao começo
        //break - > Interrompe o laço

        //vetores
        //int n[] = new int[4];
        //Adiconar elementos
        /*
        *int p[] = {1,2,3,4,5};

        *for (int c =0;c<=p.length-1;c++){
        *    System.out.println(p[c]);
        *}
         */
        //Atributos do vetor
        //p.lenght - > Quantidade de elementos
        //System.out.println("Número de elementos: "+p.length);
        //Arrays.sort(vetor) - > Ordena o vetor
        //Arrays.binarySearch(vet,1) - > Busca a posição do valor
        //Arrais.fill(v,0) - preenchimento do vetor


        //for it
        /*
        *int num[] = {1,2,3,4};
        *for (int valor:num){
        *    System.out.print(valor+" ");
        *}
        *System.out.println("");
        *int p = Arrays.binarySearch(num,2);
        *System.out.println("Valor encontrado na posição "+ (p+1));
        *Arrays.fill(num,1);
        *for (int valor:num){
        *    System.out.print(valor+" ");
        *}
        */
        //Metódos
        //Procedimento
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o valor 2 ");
        int n2 = teclado.nextInt();
        soma(n1,n2);
        int s = somaF(n1,n2);
        System.out.println("Soma com função: "+s);
         */
        float nota1;

        nota1 = nota(1);
        System.out.println(nota1);

    }
    //Procedimento
    static void soma(int a,int b){
        int s = a + b;
        System.out.println("A soma é "+s);
    }
    private static int somaF(int a, int b){
        return (a+b);
    }

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
}