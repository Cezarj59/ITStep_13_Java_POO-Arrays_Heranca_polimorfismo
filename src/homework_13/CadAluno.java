package homework_13;

import java.util.Scanner;

public class CadAluno extends Pessoas {

    static Scanner read = new Scanner(System.in);
    static CadAluno[] cadA = new CadAluno[0];

    private String turma, turno;

    public CadAluno(String turma, String turno, String nome, String dataNasc, String cpf) {
        super(nome, dataNasc, cpf);
        this.turma = turma;
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static void cadastroAluno() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE ALUNOS---\n");
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNasc = read.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = read.nextLine();

        System.out.print("Digite a turma: ");
        String turma = read.nextLine();

        System.out.print("Digite o turno: ");
        String turno = read.nextLine();

        cadA = aumentaArray(cadA);
        cadA[cadA.length - 1] = new CadAluno(turma, turno, nome, dataNasc, cpf);

        System.out.println("\nCadastro efetuado com sucesso!!!\n");
    }

    public static void exibeAluno() {

        System.out.println("\n\n==============Relatório de Cadastro de Alunos==============");

        if (cadA[0] == null) {
            System.out.println("\n ## Não há alunos Cadastrados! ##\n\n");
        } else {

            for (int i = 0; i < cadA.length; i++) {

                if (cadA[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                    System.out.println("\nNome: " + cadA[i].getNome()
                            + "\nData de Nascimento: " + cadA[i].getDataNasc()
                            + "\nCPF: " + cadA[i].getCpf()
                            + "\nMatérias: " + cadA[i].getTurma()
                            + "\nTurnos: " + cadA[i].getTurno()
                    );

                } else {
                    break;
                }

            }

        }
    }

    private static CadAluno[] aumentaArray(CadAluno[] c) {
        CadAluno[] aux = new CadAluno[c.length + 1];
        if (c.length > 0) {
            for (int i = 0; i < c.length; i++) {
                aux[i] = c[i];
            }
        }
        return aux;
    }

}
