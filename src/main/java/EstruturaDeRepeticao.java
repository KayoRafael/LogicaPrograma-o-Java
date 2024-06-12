import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        listadePalavras();
        ForClassico();
        ForPuro();
        inverteString();
    }

    private static void listadePalavras() {
        ArrayList<String> palavraList  = new ArrayList<>();

        palavraList.add("Goku");
        palavraList.add("Naruto");
        palavraList.add("Luffy");
        palavraList.add("Kirito");

        for(String palavra : palavraList){
            System.out.println(palavraList);
        }

        palavraList.forEach(palavra -> System.out.println(palavra));
    }

    private static void ForClassico(){
        System.out.println(" ------------------------------------------------- ");
        ArrayList<String> palavraList  = new ArrayList<>();

        palavraList.add("Goku");
        palavraList.add("Naruto");
        palavraList.add("Luffy");
        palavraList.add("Kirito");

        for(int posicao = 0; posicao <palavraList.size(); posicao++ ){
            System.out.println(palavraList.get(posicao));
        }
    }

    private static void ForPuro(){

        for(int posicao = 0; posicao <= 10; posicao = posicao + 1 ){
            System.out.println(posicao);
        }
    }

    private static void inverteString(){
        String normal = "12345";

        String invertida = "";

        for(int posicao = normal.length() - 1; posicao >=0; posicao--){
            invertida = invertida + normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
}
