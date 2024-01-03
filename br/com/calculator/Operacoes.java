package br.com.calculator;

import javax.swing.*;

public class Operacoes {
    void adicao(double a, Calculadora calculadora) {
        double soma = 0;
        int newA = (int) a;
        double[] valoresAOperar = calculadora.valores;
        for (int i = 0; i < valoresAOperar.length; i++) {
            soma += valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", soma));
    }

    void subtracao(double a, Calculadora calculadora) {
        double sub = 0;
        int newA = (int) a;
        double[] valoresAOperar = calculadora.valores;
        sub = valoresAOperar[0];
        for (int i = 1; i < valoresAOperar.length; i++) {
            sub -= valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", sub));
    }

    void multiplicacao(double a, Calculadora calculadora) {
        double mult = 1;
        int newA = (int) a;
        double[] valoresAOperar = calculadora.valores;
        for (int i = 0; i < valoresAOperar.length; i++) {
            mult *= valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", mult));
    }

    void divisao(double a, Calculadora calculadora) {
        double divisao = 1;
        int newA = (int) a;
        double[] valoresAOperar = calculadora.valores;
        for (int i = 0; i < valoresAOperar.length; i++) {
            divisao /= valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", divisao));
    }
}
