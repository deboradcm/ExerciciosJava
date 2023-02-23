/* Programa que recebe dois valores do usuário (nome, idade)
 * Para de ser executado assim que recebe zero.
 */
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = ler.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = ler.nextInt();

        }

        System.out.println("parou aqui ");

       






    }
}

