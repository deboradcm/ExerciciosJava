/*
 * Faça um programa que peça N números inteiros
 * depois calcule e mostre a quantidade de númeres e números ímpares
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0; 
        int quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count=0;
        do {
            numero =  scan.nextInt();
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            count++;

        } while (count < quantNumeros);

        System.out.print("Quantidade de pares: " +quantPares);
        System.out.print("Quantidade de ímpares: "+quantImpares);
        
    }
}

