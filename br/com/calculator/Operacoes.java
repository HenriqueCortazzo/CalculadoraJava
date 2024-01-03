package br.com.calculator;

import javax.swing.*;

public class Operacoes {
    void adicao(Calculadora calculadora) {
        double soma = 0;
        double[] valoresAOperar = calculadora.valores;
        for (double v : valoresAOperar) {
            soma += v;
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", soma));
        calculadora.continuar = JOptionPane.showInputDialog(null, "Deseja continuar?");
    }

    void subtracao( Calculadora calculadora) {
        double sub;
        double[] valoresAOperar = calculadora.valores;
        sub = valoresAOperar[0];
        for (int i = 1; i < valoresAOperar.length; i++) {
            sub -= valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", sub));
        calculadora.continuar = JOptionPane.showInputDialog(null, "Deseja continuar?");
    }

    void multiplicacao(Calculadora calculadora) {
        double mult = 1;
        double[] valoresAOperar = calculadora.valores;
        for (double v : valoresAOperar) {
            mult *= v;
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", mult));
        calculadora.continuar = JOptionPane.showInputDialog(null, "Deseja continuar?");
    }

    void divisao(Calculadora calculadora) {
        double divisao;
        double[] valoresAOperar = calculadora.valores;
        divisao = valoresAOperar[0];
        for (int i = 1; i < valoresAOperar.length; i++) {
            divisao /= valoresAOperar[i];
        }
        JOptionPane.showMessageDialog(null, String.format("Resultado da operação: %.1f", divisao));
        calculadora.continuar = JOptionPane.showInputDialog(null, "Deseja continuar?");
    }

}
