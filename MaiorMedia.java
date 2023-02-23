import java.util.Scanner;

/*Faça um programa que peça 5 números
 * e informe o maior número
 * e a média desses números
 */

public class MaiorMedia {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
       
        int contador = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            
            if (numero>maior) maior = numero;

            contador++;

        } while(contador<5);

        System.out.println("Maior: "+ maior);
        System.out.println("Media: "+ soma/5);

    }
}

