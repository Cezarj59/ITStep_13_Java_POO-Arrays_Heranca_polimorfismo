
package homework_13;


public class Pessoas {

    private String nome, dataNasc, cpf;

    public Pessoas(String nome, String dataNasc, String cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
