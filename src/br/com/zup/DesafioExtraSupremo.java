package br.com.zup;

import java.util.Scanner;

public class DesafioExtraSupremo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //criando variáveis
        int qtdDeNumeros;
        int contador = 1;
        int numeroDigitado;
        int menorValor = 0;
        int maiorValor = 0;
        int soma = 0;

        System.out.println("Olá, qual será a quantidade de números que você irá digitar?");
        qtdDeNumeros = leitor.nextInt();

        while (contador <= qtdDeNumeros) {
            System.out.println("Digite o número " + contador + " :");
            numeroDigitado = leitor.nextInt();

            if (contador == 1) {
                menorValor = numeroDigitado;
                maiorValor = numeroDigitado;
            }
            if (numeroDigitado < menorValor) {
                menorValor = numeroDigitado;
            }
            if (numeroDigitado > maiorValor) {
                maiorValor = numeroDigitado;
            }

            soma = soma + numeroDigitado;

            contador++;
        }

        System.out.println("O menor valor que você digitou foi o " + menorValor);
        System.out.println("O maior valor que você digitou foi o " + maiorValor);
        System.out.println("A soma de todos os valores digitados é " + soma);

    }

}
