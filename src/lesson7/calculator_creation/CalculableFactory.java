package lesson7.calculator_creation;
import lesson7.calculator_creation.ICalculableFactory;
import lesson7.calculator.Calculable;
import lesson7.calculator.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
