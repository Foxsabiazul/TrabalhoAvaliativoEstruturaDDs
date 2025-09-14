/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ne3module;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Paciente p1 = new Paciente("Marcos Vinicius", 19, "Alergia Hereditária");
        Paciente p2 = new  Paciente("Nathallya Adrovwski", 30, "Enxaqueca/Dor de Cabeça");
        
        System.out.println(p2.exibirInfo());
        System.out.println(p1.exibirInfo());
    }
        sc.close();
}

