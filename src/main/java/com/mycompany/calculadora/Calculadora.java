/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 * con retorno
 * @author DELL 7490
 */
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
        
        Operaciones op=new Operaciones();
        int suma=op.sumar(n1, n2);
        int resta=op.restar(n1, n2);
        int multiplicacion=op.multiplicar(n1, n2);
        int division=op.dividir(n1, n2);
        int modulo=op.modulo(n1, n2);
        op.mostrarResultados(suma,resta,multiplicacion,division,modulo);
        
        op.mostrarResultados(op.sumar(n1,n2),op.restar(n1,n2),op.multiplicar(n1,n2),op.dividir(n1,n2),op.modulo(n1,n2));
        
    }
}
