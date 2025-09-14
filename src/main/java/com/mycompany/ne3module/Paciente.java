/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ne3module;

import java.util.Scanner;

/**
 *
 * @author marco
 */

//class paciente
class Paciente {
    private static int contador = 1 ;
    Scanner sc = new Scanner(System.in);
    
    //variables
    int id;
    String nome;
    int idade;
    String sintoma;
    
    //constructor and paramaters
    public Paciente(String nome, int idade, String sintoma){
     this.id = contador++;
     this.nome = nome;
     this.idade = idade;
     this.sintoma = sintoma;
    }
    //getters  
    public int getId(){
        return id;
}
    public String getNome(){
        return nome;
}
    public int getIdade(){
        return idade;

}
     
public String getSintoma(){
    return sintoma;

}
    //setters
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
        
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
        
    }
    
    public void exibirInfo(){
        System.out.println("id" + id);
        System.out.println("nome" + nome);
        System.out.println("iadade" + idade);
        System.out.println("sintomas" + sintoma);
    }
}


