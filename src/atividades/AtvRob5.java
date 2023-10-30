package atividades;

import java.util.Scanner;

public class AtvRob5 {
    public static void main(String[] args){
        //A prefeitura da cidade XXXX deseja fazer uma pesquisa entre seus habitantes. Faça um
        //programa para coletar dados sobre a renda e número de filhos de cada família e, após as
        //leituras, mostrar:
        //• A renda média da população;
        //• A média do número de filhos;
        //• O maior salário dos habitantes;
        //• O percentual de habitantes com renda menor que R$ 200,00.
        //OBS: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

        Scanner teclado = new Scanner(System.in);
        int familia, filho, filhoS = 0,renda200 = 0;
        float renda, rendaS = 0,maiorS = 0, rendaM, filhoM, renda200P;

        System.out.print("Número de familias da cidade: ");
        familia = teclado.nextInt();

        for(int c = 1; c <= familia; c++){
            System.out.println("");
            System.out.printf("Renda Total da familia %d: ",c);
            renda = teclado.nextFloat();
            System.out.printf("Número de filhos da família %d: ",c);
            filho = teclado.nextInt();
            if (maiorS <= renda || c == 1){
                maiorS = renda;
            }
            if (renda < 200){
                renda200++;
            }
            rendaS = (rendaS + renda);
            filhoS = (filhoS + filho);

        }
        rendaM = rendaS/familia;
        filhoM = filhoS/familia;
        renda200P = (renda200/familia)*100;
        System.out.println("----------------------------------------");
        System.out.printf("A renda média da população é: R$%.2f \n",rendaM);
        System.out.printf("A média do número de filhos é: %.2f \n",filhoM);
        System.out.printf("O maior salário familiar é no valor de: R$%.2f \n",maiorS);
        System.out.printf("O percentual de habitantes com renda menor que R$200 é: %.1f",renda200P);
        System.out.println("%");
        System.out.println("----------------------------------------");
    }
}

