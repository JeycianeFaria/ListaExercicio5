package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variáveis
        int contador;
        int qtdNumeros;
        int numero;
        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Qual a quantidade de numeros que você irá digitar?");
        qtdNumeros = leitor.nextInt();

        for(contador = 1; contador <=qtdNumeros; contador++ ){
            System.out.println("Digite o número " + contador + " :");
            numero = leitor.nextInt();

            if (numero % 2 == 0){
                numerosPares += 1;
            }else{
                numerosImpares += 1;
            }
        }

        System.out.println("A quantidade de números pares digitada é de : " + numerosPares);
        System.out.println("A quantidade de números ímpares digitada é de : " + numerosImpares);
    }

}
