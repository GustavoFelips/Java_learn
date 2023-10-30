public class Pesquisar {
    public static void main(String[] args){
        int[] vet = {12,36,1,0,2,10};
        Ordenar.ordenar(vet);
        System.out.println(pesquisa(vet,36));
    }

    public static int pesquisa(int[] vet,int chave){
        int inicio = 0 ; int meio = 0 ; int fim = vet.length; boolean achou = false;
        while (inicio <= fim){
            meio = (inicio+fim)/2;
            if(vet[meio] == chave){
                achou = true;
                break;
            }
            else if (vet[meio] > chave){
                fim = meio - 1;
            }
            else {
                inicio = meio+1;
            }
        }
        if (achou){
            return meio;
        }
        else {
            return -1;
        }
    }
}
