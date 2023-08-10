package lesson7;

import lesson7.calculator_creation.ICalculableFactory;
import lesson7.calculator_log.CalculableLoggerFactory;
import lesson7.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableLoggerFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
