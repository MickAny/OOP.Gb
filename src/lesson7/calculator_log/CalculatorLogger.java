package lesson7.calculator_log;
import lesson7.calculator.Calculable;
import lesson7.log.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;

    public CalculatorLogger(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Вычисляется сумма чисел: %d и %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Вычисляется произведение чисел: %d и %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public Calculable division(int arg) {
        logger.log(String.format("Вычисляется деление чисел: %d и %d", calculator.getResult(), arg));
        return calculator.division(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Результат = %d", calculator.getResult()));
        return calculator.getResult();
    }

}
