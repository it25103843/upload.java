class Calculator {
    public int add(int n1, int n2) { return n1 + n2; }
    public int multiply(int n1, int n2) { return n1 * n2; }
    public int square(int n) { return n * n; }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int result1 = calc.square(calc.add(part1, part2));
        System.out.println("Result 1: " + result1);

        int term1 = calc.square(calc.add(4, 7));
        int term2 = calc.square(calc.add(8, 3));
        int result2 = calc.add(term1, term2);
        System.out.println("Result 2: " + result2);
    }
}