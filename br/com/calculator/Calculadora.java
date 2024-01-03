package br.com.calculator;

import javax.swing.*;

public class Calculadora {
    double[] valores;
    double numeroDeValoresConvertido;

    void receberDados() {
        String numeroDeValores = JOptionPane.showInputDialog(null, "Com quantos numeros você deseja operar?");
        numeroDeValoresConvertido = Double.parseDouble(numeroDeValores);
        valores = new double[(int) numeroDeValoresConvertido];

        for (int i = 0; i < numeroDeValoresConvertido; i++) {
            String valor = JOptionPane.showInputDialog(null, String.format("Digite o %d° valor", i + 1));
            double valorConvetido = Double.parseDouble(valor);
            valores[i] = valorConvetido;
        }
        String[] options = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int x = JOptionPane.showOptionDialog(
                null,
                "Qual operação você deseja fazer?",
                "Operações",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, options[0]
        );
        switch (x) {
            case 0:
                Operacoes operar = new Operacoes();
                operar.adicao(numeroDeValoresConvertido, this);
                break;

            case 1:
                Operacoes operar1 = new Operacoes();
                operar1.subtracao(numeroDeValoresConvertido,this);
                break;
            case 2:
                Operacoes operar2 = new Operacoes();
                operar2.multiplicacao(numeroDeValoresConvertido,this);
                break;
        }
    }
}
