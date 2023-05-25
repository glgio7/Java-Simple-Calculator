import javax.swing.JOptionPane;

class Calculator {
    public static void main (String entrada[]) {
        // Variables declaration
        float num1, num2, result;
        char operator;
        
        // Get numbers and operator from user input using JOptionPane lib
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
        operator = JOptionPane.showInputDialog(null, "Digite o operador matemático:").charAt(0);
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
        

        // Get result from math operation
        switch (operator){
            // Single quotes '' are used to represent char, while double quotes "" are used to represent strings
            case '/':
                result = num1 / num2;
                JOptionPane.showMessageDialog(null, "O resultado da operação é: " + result);
                break;
            case '*':
                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "O resultado da operação é: " + result);
                break;
            case '+':
                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "O resultado da operação é: " + result);
                break;
            case '-':
                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "O resultado da operação é: " + result);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido!");
                break;
        }
    }
}
