package com.mycompany.ne3module;

import java.util.Scanner;

public class GerenciadorClinica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiladeAtendimento fila = new FiladeAtendimento();
        HistoricoAtendimentos historico = new HistoricoAtendimentos();

        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu Clinica APUPR (Atendimento Pessoal Urgente do Paraná)");
            System.out.println("1 - Adicionar paciente à fila");
            System.out.println("2 - Atender próximo paciente");
            System.out.println("3 - Mostrar fila de espera");
            System.out.println("4 - Ver último paciente atendido");
            System.out.println("5 - Mostrar histórico de atendimentos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Entrada inválida! Digite um número de 1 a 6.");
                sc.nextLine();
                continue;
            }

            if (opcao == 1) {
                System.out.print("Nome do paciente: ");
                String nome = sc.nextLine();

                int idade;
                while (true) {
                    System.out.print("Idade do paciente: ");
                    if (sc.hasNextInt()) {
                        idade = sc.nextInt();
                        sc.nextLine();
                        if (idade > 0) break;
                        else System.out.println("Idade deve ser maior que 0.");
                    } else {
                        System.out.println("Digite um número inteiro válido para a idade.");
                        sc.nextLine();
                    }
                }

                System.out.print("Sintomas do paciente: ");
                String sintoma = sc.nextLine();

                Paciente paciente = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(paciente);
                System.out.println("Paciente adicionado à fila.");

            } else if (opcao == 2) {
                Paciente atendido = fila.atenderPaciente();
                if (atendido != null) {
                    System.out.println("Atendendo paciente:");
                    atendido.exibirInfo();
                    historico.adicionarAoHistorico(atendido);
                } else {
                    System.out.println("A fila está vazia!");
                }

            } else if (opcao == 3) {
                fila.mostrarFila();

            } else if (opcao == 4) {
                Paciente ultimo = historico.verUltimoAtendido();
                if (ultimo != null) {
                    System.out.println("Último paciente atendido:");
                    ultimo.exibirInfo();
                } else {
                    System.out.println("Nenhum paciente atendido ainda!");
                }

            } else if (opcao == 5) {
                historico.mostrarHistorico();

            } else if (opcao == 6) {
                System.out.println("Encerrando o programa...");
                sair = true;

            } else {
                System.out.println("Opção inválida! Digite um número de 1 a 6.");
            }
        }

        sc.close();
    }
}
