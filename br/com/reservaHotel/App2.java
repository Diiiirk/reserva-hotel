package br.com.reservaHotel;

import java.util.Scanner;

// Escreva um programa Java que faça a troca de quartos entre dois
// hóspedes. O programa deve receber o nome de um cliente e a idade dele
// (este cliente, a princípio, será hospedado no quarto A), depois receber o
// nome de outro cliente e a idade (este, se for mais jovem, ficará no quarto
// B, mas, se for mais velho que o primeiro cliente, ficará no quarto A e o
// primeiro cliente ficará no quarto B). Além disso, se a pessoa mais velha
// for idosa (tem 60 anos ou mais), ela terá desconto de 40%. O programa
// deve mostrar, ao final, qual cliente ficou no quarto A e o desconto, se
// houver, e qual ficou no quarto B.

public class App2 {

    public static void trocaQuarto() {

        Scanner leia = new Scanner(System.in);
        String nome, quartoA = "", quartoB;
        byte idade, maiorIdade = 0, count = 0;

        do {
            System.out.println("Digite um nome: ");
            nome = leia.next();
            System.out.println("Qual a idade: ");

            idade = leia.nextByte();
            if (idade > maiorIdade) {
                maiorIdade = idade;
                quartoB = quartoA;
                quartoA = nome;
            } else {
                quartoB = nome;
            }
            count++;

        } while (count < 2);

        if (maiorIdade >= 60) {
            System.out.println("Quarto A: " + quartoA + " com desconto de 40%; Quarto B: " + quartoB);
        } else {
            System.out.println("Quarto A: " + quartoA + " Quarto B: " + quartoB);
        }

    }
}
