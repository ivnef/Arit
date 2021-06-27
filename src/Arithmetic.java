


public class Arithmetic {
   private int a;
   private int b;

    public void getSum () {
        int sum = (a + b);
        System.out.println(sum);
    }
    public void getDifference() {
        int difference = (a - b);
        System.out.println(difference);
    }
    public void getProductOfNumbers () {
        int product = (a * b);
        System.out.println(product);
    }

    public void getAverageOfNumbers() {
        int average = ((a + b) / 2);
        System.out.println(average);
    }
    public void getMaximumOfNumbers () {

        int maxOfNumbers = Math.max(a, b);
        System.out.println(maxOfNumbers);
    }

    public void getMinimumOfNumbers () {

        int minOfNumbers = Math.min(a, b);
        System.out.println(minOfNumbers);
    }

    public Arithmetic (int a, int b) {

        this.a = a;
        this.b = b;
}

    public static void main(String[] args) {

        Arithmetic numbers = new Arithmetic(70,50);
        System.out.println("Арифметические действия: ");

        System.out.print( " Сумма чисел :" );
        numbers.getSum();

        System.out.print( " Разность чисел :" );
        numbers.getDifference();

        System.out.print( " Произведение чисел :" );
        numbers.getProductOfNumbers();

        System.out.println("Среднее значение чисел: ");
        numbers.getAverageOfNumbers();

        System.out.println("Максимальное из чисел: ");
        numbers.getMaximumOfNumbers ();

        System.out.println("Минимальное из чисел: ");
        numbers.getMinimumOfNumbers ();



    }
}






