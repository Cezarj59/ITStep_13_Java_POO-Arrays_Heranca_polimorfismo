
package versaoProfessor;
import java.util.Scanner;

public class Menus {
 public static void menu(Aluno[] alunos){
        Scanner leia = new Scanner(System.in);
        while (0==0){
            System.out.println("\n\n====================================");
            System.err.println("================Sistema de Cadastro============");
            System.out.println("===================================");
            System.out.println("Deseja cadastar um novo aluno?(s) SIM (n)NÃO (0)##Sair##");
            String opcao = leia.nextLine();
            switch (opcao.toLowerCase()){
                case "s":
                    alunos = Aluno.cadastra(alunos);
                    break;
                case "0":
                    System.err.println("\n\nSaindo do sistema!!");
                    System.exit(0);
                default:
                    System.err.println("\nOpção inválida\n");
            }
        }
    }
}
