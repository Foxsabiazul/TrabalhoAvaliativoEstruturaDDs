/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ne3module;


/**
 *
 * @author marco
 */
public class Main {
    public static void main(String[] args) {
    
    FiladeAtendimento fila = new FiladeAtendimento();
    HistoricoAtendimentos historico = new HistoricoAtendimentos();
    Paciente p = new Paciente("nome", 0, "sintoma");
    
        
        Paciente p1 = new Paciente("Marcos Vinicius", 19, "Alergia Hereditária");
        Paciente p2 = new  Paciente("Nathallya Adrovwski", 30, "Enxaqueca/Dor de Cabeça");
        
          fila.adicionarPaciente(p1);
        fila.adicionarPaciente(p2);

        // Mostrando a fila
        fila.mostrarFila();

        // Atendendo paciente
        Paciente atendido = fila.atenderPaciente();
        if (atendido != null) {
            System.out.println("\nPaciente atendido:  ");
            atendido.exibirInfo();
            historico.adicionarAoHistorico(atendido);
        }

        // histórico
        System.out.println("\nHistórico de atendimentos:  ");
        historico.mostrarHistorico();
    }
}


