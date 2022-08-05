package br.com.reservaHotel;

import java.util.Scanner;

// Escreva um programa Java que receba o valor padrão de uma diária e,
// em seguida, receba vários nomes de hóspedes e suas idades. Caso o
// hóspede tenha idade menor que 4 anos, ele não paga hospedagem
// (nesse caso, o programa deve mostrar na tela “(Nome do hóspede) possui
// gratuidade”); mas, se o hóspede tiver mais de 80 anos, ele paga metade
// (o programa deve mostrar na tela “(Nome do hóspede) paga meia”). O
// usuário informará hóspedes até digitar a palavra “PARE”, que interrompe
// a entrada de dados. Ao fim, o programa deve mostrar a quantidade de
// gratuidades, a quantidade de meias hospedagens e o valor total,
// considerando todos os hóspedes informados.

public class App3 {

    public static void calculoHospedagens() {

        Scanner leia = new Scanner(System.in);

        int valorDiaria;
        String nome;
        int idade, gratuidade = 0, meia = 0, inteira = 0, formulaMeia, calculoMeia, calculoInteira, total;

        System.out.println("Valor da diária: ");
        valorDiaria = leia.nextInt();

        while (true) {

            System.out.println("Nome do hóspede: ");
            nome = leia.next();
            if (nome.equalsIgnoreCase("pare"))
                break;
            System.out.println("Idade: ");
            idade = leia.nextInt();
            if (idade < 1) {
                System.err.println("Idade inválida, digite novamente: ");
                idade = leia.nextInt();
            } else if (idade <= 4) {
                System.out.println("* " + nome + " possui gratuidade *");
                gratuidade++;
            } else if (idade >= 80) {
                System.out.println("* " + nome + " paga meia *");
                meia++;
            } else {
                inteira++;
            }

        }
        formulaMeia = valorDiaria / 2;
        calculoMeia = formulaMeia * meia;
        calculoInteira = inteira * valorDiaria;
        total = calculoMeia + calculoInteira;

        System.out.println(
                "Total de hospedagens: R$" + total + "; " + gratuidade + " gratuidade(s); " + meia + " meia(s)");

    }
}
