import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> calculator = Calculator::new;

    BinaryOperator<Integer> add = (x,y) -> x + y;
    BinaryOperator<Integer> sub = (x,y) -> x - y;
    BinaryOperator<Integer> mul = (x,y) -> x * y;
    BinaryOperator<Integer> dev = (x,y) -> {
        if (y == 0) throw new ArithmeticException("На ноль делить нельзя!");
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> result = System.out::println;



}