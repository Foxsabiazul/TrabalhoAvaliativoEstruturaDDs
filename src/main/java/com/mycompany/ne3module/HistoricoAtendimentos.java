/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ne3module;

import java.util.Stack;

/**
 *
 * @author marco
 */
public class HistoricoAtendimentos {
    private Stack<Paciente> historico;

    public HistoricoAtendimentos() {
        this.historico = new Stack<>();
    }

    // add um paciente atendido no topo da pilha
    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    // retirna o último paciente atendid sem remover
    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) {
            return historico.peek();
        } else {
            System.out.println("Nenhum paciente atendido ainda!");
            return null;
        }
    }

    // mostra o histórico 
    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum paciente atendido ainda!");
        } else {
            System.out.println("Histórico de atendimentos:");
            for (int i = historico.size() - 1; i >= 0; i--) {
                historico.get(i).exibirInfo();
            }
        }
    }
}
