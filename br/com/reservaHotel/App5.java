package br.com.reservaHotel;

import java.util.Scanner;

// Monte um programa Java que mostre na tela em formato de tabela os
// quartos ocupados e os desocupados. Considere que o hotel tem quatro
// andares e três quartos por andar. Primeiro, o usuário registrará os quartos
// ocupados, informando para cada ocupação o número do apartamento
// (andares de 1 a 4 e números de quarto de 1 a 3). O programa deverá
// questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá
// informar quantos quartos quiser, até que responda “N” a essa pergunta.
// Em seguida, o programa mostrará uma tabela, em que o primeiro andar é
// o inferior e o último é o superior, marcando com X o quarto ocupado.

public class App5 {

    public static void quartoOcupado() {

        Scanner leia = new Scanner(System.in);

        String[][] matrix = new String[4][3];
        String[] frase = { "1º andar", "2º andar", "3º andar", "4º andar" };
        int andar;
        int numeroQarto;
        String opcao;
        int count = 0;

        while (true) {
            System.out.println(
                    "Qual número do apartamento? \nApartamento Nº1 [1] \nApartamento Nº2 [2] \nApartamento Nº3 [3]");
            numeroQarto = leia.nextInt();
            System.out.println("Qual andar? \n4º andar [4] \n3º andar [3] \n2º andar [2] \n1º andar [1]");
            andar = leia.nextInt();
            matrix[andar - 1][numeroQarto - 1] = "[X]";

            System.out.println("Deseja informar outra ocupação?");
            opcao = leia.next();
            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Quarto:   1   2   3");
        for (int l = 3; l >= 0; l--) {
            System.out.print(frase[l]);
            for (int c = 0; c < 3; c++) {
                if (matrix[l][c] == null) {
                    matrix[l][c] = "[ ]";
                }
                System.out.print(" " + matrix[l][c]);
            }
            System.out.println();
            count++;
        }
        // for (String[] Linha : matrix) {
        // for (String Coluna : Linha) {
        // System.out.print(Coluna);
        // }
        // System.out.println();
        // }
    }
}
