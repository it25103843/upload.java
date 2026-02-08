class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return (i % 2 == 0);
    }
}

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber checker = new EvenOddNumber();

        int num = 15;

        if (checker.findEvenOrOdd(num)) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}
