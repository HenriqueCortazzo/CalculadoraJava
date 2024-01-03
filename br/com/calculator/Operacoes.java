package br.com.calculator;

import javax.swing.*;

public class Operacoes {
    void adicao(double a, Calculadora calculadora) {
        double soma;
        int newA = (int) a;
        JOptionPane.showMessageDialog(null, String.format("Você irá operar com %d valores.", newA));
        double[] valoresAOperar = calculadora.valores;
        for (int i = 0; i <valoresAOperar.length; i++) {
            System.out.println(valoresAOperar[i]);
        }
    }
}
