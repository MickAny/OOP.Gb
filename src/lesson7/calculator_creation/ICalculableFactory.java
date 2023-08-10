package lesson7.calculator_creation;
import lesson7.calculator.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
