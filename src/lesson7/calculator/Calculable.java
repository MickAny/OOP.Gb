package lesson7.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable division(int arg);
    int getResult();
}
