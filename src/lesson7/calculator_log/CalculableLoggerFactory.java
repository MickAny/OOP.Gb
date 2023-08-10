package lesson7.calculator_log;
import lesson7.calculator_log.CalculatorLogger;
import lesson7.calculator.Calculable;
import lesson7.calculator.Calculator;
import lesson7.calculator_creation.ICalculableFactory;
import lesson7.log.ConsoleLogger;

public class CalculableLoggerFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(new Calculator(primaryArg), new ConsoleLogger());
    }
}
