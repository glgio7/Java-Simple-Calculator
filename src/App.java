import javax.swing.JOptionPane;

class Calculator {
    public static void main (String entrada[]) {
        // Variables declaration
        int num1, num2;
        char operator;
        float result;
        
        // Get numbers and operator from user input using JOptionPane lib
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro:"));
        operator = JOptionPane.showInputDialog(null, "Digite o operador matemático:").charAt(0);
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número inteiro:"));
        

        // Get result from math operation
        result = operator == "/".charAt(0) ? (float)num1 / num2 : operator == "*".charAt(0) ? (float)num1 * num2 : operator == "-".charAt(0) ? (float)num1 - num2 : (float)num1 + num2;
        
        // Show result
        JOptionPane.showMessageDialog(null, "O resultado da operaçãp é: " + result);
    }
}
