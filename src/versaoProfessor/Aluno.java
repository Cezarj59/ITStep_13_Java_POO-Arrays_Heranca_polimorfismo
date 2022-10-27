package versaoProfessor;

import java.util.Scanner;

public class Aluno {

    private String nome, genero, turma;

    public Aluno() {
    }

    public Aluno(String nome, String genero, String turma) {
        this.nome = nome;
        this.genero = genero;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public static Aluno[] cadastra(Aluno[] array) {
        Aluno[] aux = new Aluno[array.length + 1];
        Scanner leia = new Scanner(System.in);
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                aux[i] = array[i];
            }
        }
        System.out.print("Nome do aluno: ");
        String nome = leia.nextLine();
        System.out.print("Gênero: ");
        String genero = leia.nextLine();
        System.out.print("Turma: ");
        String turma = leia.nextLine();
        aux[aux.length - 1] = new Aluno(nome, genero, turma);
        return aux;
    }
}
