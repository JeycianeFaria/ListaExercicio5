package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int qtdDeNumeros;
        int contador;
        int numero = 0;
        int numerosPares = 0;

        System.out.println("Por favor digite a quantidade de números que você irá digitar");
        qtdDeNumeros = leitor.nextInt();

        for(contador = 1; contador <= qtdDeNumeros; contador++) {
            System.out.println("Digite o número " + contador + " :");
            numero = leitor.nextInt();

            if (numero % 2 == 0){
                numerosPares += 1;
            }

        }

        System.out.println("A quantidade de numeros pares digitados é de : " +  numerosPares);
    }
}
