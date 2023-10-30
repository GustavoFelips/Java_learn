public class Ordenar {
    public static void main(String args[]){
        int[] vetor = {7,12,1,0,23};
        ordenar(vetor);
        for (int c = 0; c < vetor.length;c++){
            System.out.print(vetor[c]+" ");
        }

    }

    public static void ordenar(int[] vet){
        int temp;
        int i = vet.length;
        while (i >= 2){
            for (int j = 0; j < vet.length-1;j++){
                if (vet[j] > vet[j+1]){
                    temp = vet[j+1];
                    vet[j+1] = vet[j];
                    vet[j] = temp;
                }
            }
            i--;
        }
    }

}
