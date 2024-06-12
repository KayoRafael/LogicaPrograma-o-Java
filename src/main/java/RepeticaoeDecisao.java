import java.util.ArrayList;

public class RepeticaoeDecisao {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for (int posicao = 1; posicao <= 10; posicao++) {
            listaDeUmADez.add(posicao);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : listaDeUmADez) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        for (Integer numeroPar : numerosPares) {
            System.out.println(numeroPar);
        }

        for(Integer numeroImpar : numerosImpares){
            System.out.println(numeroImpar);
        }
    }
}