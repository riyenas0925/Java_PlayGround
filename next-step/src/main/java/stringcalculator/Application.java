package stringcalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        String[] values = value.split(" ");
        
        Calculator calculator = new Calculator(values[0]);

        for(int i = 1; i < values.length; i = i + 2) {
            String operand = values[i];
            String operator = values[i+1];
            calculator.execute(operator, operand);
        }

        System.out.println(calculator.getResult());
    }
}
