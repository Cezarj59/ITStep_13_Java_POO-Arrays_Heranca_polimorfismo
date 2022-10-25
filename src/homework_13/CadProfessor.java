package homework_13;

import java.util.Scanner;

public class CadProfessor extends Pessoas {

    static Scanner read = new Scanner(System.in);
    static CadProfessor[] cadP = new CadProfessor[1];
    static int qtdP = 0;

    private String turnos, materias;

    public CadProfessor(String turnos, String materias, String nome, String dataNasc, String cpf) {
        super(nome, dataNasc, cpf);
        this.turnos = turnos;
        this.materias = materias;
    }

    public String getTurnos() {
        return turnos;
    }

    public void setTurnos(String turnos) {
        this.turnos = turnos;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public static void cadastroProfessor() {

        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE PROFESSORES---\n");
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNasc = read.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = read.nextLine();

        System.out.print("Digite as Matérias: ");
        String materias = read.nextLine();

        System.out.print("Digite os turnos: ");
        String turnos = read.nextLine();

        cadP[qtdP] = new CadProfessor(turnos, materias, nome, dataNasc, cpf);
        qtdP++;
        aumentaArray(cadP);
        
        System.out.println("\nCadastro efetuado com sucesso!!!\n");
    }

    
    public static void exibeProfessor() {

        System.out.println("\n\n==============Relatório de Cadastro de Professores==============");

        if (cadP[0] == null) {
            System.out.println("\n ## Não há professores Cadastrados! ##\n\n");
        } else {

            for (int i = 0; i < qtdP; i++) {
                System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                System.out.println("\nNome: " + cadP[i].getNome()
                        + "\nData de Nascimento: " + cadP[i].getDataNasc()
                        + "\nCPF: " + cadP[i].getCpf()
                        + "\nMatérias: " + cadP[i].getMaterias()
                        + "\nTurnos: " + cadP[i].getTurnos()
                );
            }

        }
    }
    
     private static CadProfessor[] aumentaArray(CadProfessor[] c) {
        CadProfessor[] aux = new CadProfessor[c.length + 1];
        for (int i = 0; i < c.length; i++) {
            aux[i] = c[i];
        }
        return aux;
    }
}
