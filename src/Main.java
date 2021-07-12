public class Main {


    public static void main(String[] args) {


        Calculator calc = Calculator.calculator.get();
        int a = calc.add.apply(3,6);
        int b = calc.sub.apply(1,1);
        int c = calc.dev.apply(a, b);
        boolean d = calc.isPositive.test(a);
        calc.result.accept(c);
        calc.result.accept(a);
        System.out.println(d);

    }

}