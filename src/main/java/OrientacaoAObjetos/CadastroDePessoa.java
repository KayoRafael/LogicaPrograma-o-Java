package OrientacaoAObjetos;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class CadastroDePessoa {

    ArrayList<Pessoa> pessoalist = new ArrayList<>();

    Maternidade maternidade = new Maternidade();

    public static void main(String[] args) throws ParseException {
        new CadastroDePessoa().rodar();
    }
    private void rodar() throws ParseException{
        Pessoa goku = maternidade.nascer("Goku","Masculino");
        Pessoa naruto = maternidade.nascer("Naruto","Masculino");
        Pessoa buuma = maternidade.nascer("Luffy","Feminino");
        Pessoa Sakura = maternidade.nascer("Kirito","Feminino");

        pessoalist.add(goku);
        pessoalist.add(naruto);
        pessoalist.add(buuma);
        pessoalist.add(Sakura);

        ArrayList<Pessoa> homemList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();

        for(Pessoa pessoa : pessoalist){
            if(pessoa.getSexo().equals("Masculino")){
                homemList.add(pessoa);
            }else if (pessoa.getSexo().equals("Feminino")){
                mulherList.add(pessoa);
            }else{
                System.out.println(" Sexo Inexistente ");
            }
        }

        System.out.println("Lista de Homens:");
        for(Pessoa homem : homemList){
            System.out.println(homem.getNome());
        }

        System.out.println("\nLista de Mulheres:");
        for(Pessoa mulher : mulherList){
            System.out.println(mulher.getNome());
        }
    }
}
