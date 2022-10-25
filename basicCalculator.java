//Jesie Llanes
//CpE 3A
//10/25/22
//Basic Calculator using JOptionPane
import javax.swing.JOptionPane;
public class basicCalculator {
  public static void main(String[] args) {
    String operation;
    do{
        do {
            operation = JOptionPane.showInputDialog("Enter the operation you want to use:\n\n'+'     for addition\n'-'     for subtraction\n'*'     for multiplication\n'/'     for division\n'q'     to quit");
        } while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("q"));
        try{
        switch (operation) {
        case "+":
        getSum(getNumber("Enter the augend"), getNumber("Enter the addend"));
        break;

        case "-":
        getDifference(getNumber("Enter the minuend"), getNumber("Enter the subtrahend"));
        break;

        case "*":
        getProduct(getNumber("Enter the multiplicand"), getNumber("Enter the multiplier"));
        break;

        case "/":
        getQuotient(getNumber("Enter the dividend"), getNumber("Enter the divisor"));
        break;

        }}catch(Exception e){JOptionPane.showMessageDialog(null, "You have entered an invalid number.");}
    }while(!operation.equals("q"));
  }

  public static double getNumber(String text) {
    return Double.parseDouble(JOptionPane.showInputDialog(text));
  }

  public static void getSum(double number1, double number2) {
    JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + (number1 + number2));

  }

  public static void getDifference(double number1, double number2) {
    JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " + (number1 - number2));
  }

  public static void getProduct(double number1, double number2) {
    JOptionPane.showMessageDialog(null, number1 + " * " + number2 + " = " + (number1 * number2));
  }

  public static void getQuotient(double number1, double number2) {
    if (number2 == 0) {
      JOptionPane.showMessageDialog(null, number1 + " / " + number2 + " = " + "Undefined");
    } else {
      JOptionPane.showMessageDialog(null, number1 + " / " + number2 + " = " + (number1 / number2));
    }
  }
}