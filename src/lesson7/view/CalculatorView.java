package lesson7.view;



import lesson7.calculator_creation.ICalculableFactory;
import lesson7.calculator.Calculable;

import java.util.Scanner;

public class CalculatorView {
    private final ICalculableFactory calculableFactory;
    public CalculatorView(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первое число: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String var = prompt("Введите команду (*, :, +, =) : ");
                if (var.equals("*")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.multi(arg);
                    continue;
                }
                if (var.equals("+")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.sum(arg);
                    continue;
                }if (var.equals(":")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.division(arg);
                    continue;
                }if (var.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Продолжить? (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
