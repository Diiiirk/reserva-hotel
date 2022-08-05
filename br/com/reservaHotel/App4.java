package br.com.reservaHotel;

import java.util.Scanner;

// Monte um algoritmo em que o usuário poderá cadastrar e pesquisar
// hóspedes. O algoritmo deve oferecer um menu com três opções ao
// usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve
// permitir que o usuário informe um nome de hóspede, gravando-o em
// memória (máximo de 15 cadastros; caso atinja essa quantidade, o
// programa deve mostrar “Máximo de cadastros atingido”). A opção
// “pesquisar” deve permitir que o usuário informe um nome e, caso seja
// encontrado um nome exatamente igual, mostre a mensagem “Hóspede
// (nome) foi encontrado no índice (índice onde foi cadastrado)”. Se o nome
// não foi encontrado, o programa deve mostrar “Hóspede não encontrado”.
// O algoritmo deve permitir que o usuário realize essas operações repetidas
// vezes, até que use a opção “3”, que encerra o algoritmo.

public class App4 {

    public static void cadastroHospede() {

        Scanner leia = new Scanner(System.in);

        String[] hospedes = new String[15];
        byte opcao;
        String nome;

        while (true) {
            System.out.println(
                    "Cadastro de hóspedes, escolha uma das opções \n[1] Cadastrar \n[2] Pesquisar \n[3] Sair ");
            opcao = leia.nextByte();
            if (opcao == 3) {
                break;
            }

            switch (opcao) {

                case 1:
                    int i = 0;
                    if (i > 14) {
                        System.out.println("Limite de cadastro atingido!");
                    } else {
                        System.out.println("Nome do hóspede: ");
                        nome = leia.next();
                        hospedes[i] = nome;
                        System.out.println(hospedes[0] + "<<<<<<<<<");
                        i++;
                    }
                    break;

                case 2:

                    System.out.println("Nome do hóspede: ");
                    nome = leia.next();
                    int a = 0;
                    while (a <= 14 && hospedes[a] != nome) {
                        a++;
                    }
                    if (a > 14) {
                        System.out.println("hóspede não encontrado");
                    } else {
                        System.out.println(nome + " foi encontrado no índice " + a);
                    }

                default:
                    while (opcao < 1 || opcao > 3) {
                        System.out.println("Opção inválida. Digite novamente: ");
                        opcao = leia.nextByte();
                    }

            }

        }

    }

}
