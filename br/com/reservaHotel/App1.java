package br.com.reservaHotel;

import java.util.Scanner;

// Com relação ao atendimento a eventos, o hotel necessita de uma
// funcionalidade que indique qual de seus dois auditórios é o mais
// adequado para um evento. O auditório Alfa conta com 150 lugares e
// espaço para até 70 cadeiras adicionais. O auditório Beta conta com 350
// lugares, sem espaço para mais cadeiras. Desenvolva um programa Java
// que receba o número de convidados do evento e faça uma verificação
// sobre a quantidade: se for maior que 350 ou se for menor que zero, mostre
// a mensagem “Número de convidados inválido”. Se o valor informado for
// válido, mostre na tela qual dos auditórios é o mais adequado. No caso do
// auditório Alfa, calcule ainda quantas cadeiras adicionais serão
// necessárias, observando o limite citado.

public class App1 {

    public static void reservaAuditorio() {

        Scanner entrada = new Scanner(System.in);
        int lugares;
        String singular = "lugar";
        String plural = "lugares";

        System.out.println("### Bem vindo à aplicação de realização de reservas! ###");
        System.out.println("Vamos definir qual o audirório que melhor se adequa as necessidades do cliente.");
        System.out.println("Qual a quantidade necessária de lugares para reserva?");
        lugares = entrada.nextInt();

        while (lugares <= 0) {
            System.out.println("Valor inválido, por favor digite novamente: ");
            lugares = entrada.nextInt();
        }

        if (lugares <= 150) {
            System.out.println("Use o auditório ALFA!");
        } else if (lugares == 151) {
            System.out.println("Use o auditório ALFA, com um adicional de " + (lugares - 150) + " " + singular);
        } else if (lugares > 151 && lugares <= 220) {
            System.out.println("Use o auditório ALFA, com um adicional de " + (lugares - 150) + " " + plural);
        } else if (lugares > 220 && lugares <= 350) {
            System.out.println("Use o auditório BETA!");
        } else if (lugares > 350) {
            System.out.println("Capacidade de lugares não suportada");
        }

    }

}
