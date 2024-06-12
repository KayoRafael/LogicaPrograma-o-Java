package OrientacaoAObjetos;

import java.util.Date;

public class Pessoa {
        private String nome;
        private Date dataDeNascimento;
        private String sexo;

        void mudarSexo(String novoSexo, String novoNome){
            sexo = novoSexo;
            nome = novoNome;
        }

        void casar(String antigoSobrenome, String novoSobrenome ){
            nome = nome.replace(antigoSobrenome, novoSobrenome);
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

