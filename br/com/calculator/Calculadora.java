package br.com.calculator;

import javax.swing.*;

public class Calculadora {
    void receberDados() {
        String numeroDeValores = JOptionPane.showInputDialog(null, "Com quantos numeros você deseja operar?");
        int numeroDeValoresConvertido = Integer.parseInt(numeroDeValores);
        int[] valores = new int[numeroDeValoresConvertido];

        for (int i = 0; i < numeroDeValoresConvertido; i++) {
            String valor = JOptionPane.showInputDialog(null, String.format("Digite o %d° valor", i+1));
            int valorConvetido = Integer.parseInt(valor);
            valores[i] = valorConvetido;
        }
    }
}
