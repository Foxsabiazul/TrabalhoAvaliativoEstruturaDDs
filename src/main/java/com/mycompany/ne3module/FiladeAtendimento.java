/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ne3module;

import java.util.LinkedList;

/**
 *
 * @author marco
 */
public class FiladeAtendimento {
    private LinkedList<Paciente> fila;
    
    public FiladeAtendimento(){
        fila = new LinkedList<>();
    }
    
    public void adicionarPaciente(Paciente p){
        fila.addLast(p);
    }
    
    public Paciente atenderPaciente(){
            if(!fila.isEmpty()){
            return fila.removeFirst();
        }
        return null; // verifica se a fila esta vazia; 
    }
    public boolean filaVazia(){
        return fila.isEmpty();
    }
    
    public void mostrarFila(){
        if (fila.isEmpty()){
            System.out.println("A fila está vazia.");    
        }else{
            System.out.println("Fila de Atendimento: ");
            for (Paciente p : fila){
            }
            System.out.println(p.exibirInfo());
        }
    }
}
