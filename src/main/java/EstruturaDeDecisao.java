import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class EstruturaDeDecisao {

    public static void main(String[] args) throws ParseException {
        numeroPar();
        StringIgual();
        StringInicia();
        datas();
    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            // executo o codigo daqui verdadeiro
            System.out.println("Par");
        } else {
            // executo aqui quando falso
            System.out.println("Impar");
        }
    }

    private static void StringIgual() {
        System.out.println("---------------------------------------------------------");

        String frase = "Hoje e Segunda Feira , Porem são Seis da tarde ";

        if (frase.contains("Segunda Feira")) {
            if (frase.contains(" Seis da tarde ")) {
                System.out.println("Dia De Alegria");
            } else {
                System.out.println(" Dia De Tristeza");
            }
        } else if (frase.contains("Sexta Feira") || frase.contains("Sabado") || frase.contains("Domingo")) {
            System.out.println("Dia Maravilhoso");
        } else {
            System.out.println("Dia Normal");
        }
    }

    private static void StringInicia() {
        System.out.println("---------------------------------------------------------");

        String palavra = "Bobeira ";

        if (palavra.startsWith("a ")) {
            System.out.println("Palavra iniciada em a ");
        } else {
            System.out.println("Palavra iniciada com outra letra");
        }
    }

    private static void datas() throws ParseException {

        System.out.println("---------------------------------------------------------");

        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("07/11/2024");

        if (data.before(new Date())) {
            System.out.println("esse dia ja passou");

        } else {
            System.out.println("esse dia esta por vir");
        }
    }
}

