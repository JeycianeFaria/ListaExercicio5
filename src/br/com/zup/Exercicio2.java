package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int contador = 1;
        int numero = 0;
        int qtdDeNumeros = 0;
        int numerosImpares = 0;

        System.out.println("Qual a quantidade de numeros que você irá digitar?");
        qtdDeNumeros = leitor.nextInt();

        while(contador <= qtdDeNumeros){
            System.out.println("Digite o numero " + contador + " :");
            numero = leitor.nextInt();

            if (numero % 2 != 0){
                numerosImpares += 1;
            }

            contador++;
        }

        System.out.println("A quantidade de números ímpares digitados é de  " + numerosImpares);

    }

}
