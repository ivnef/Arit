

public class Arithmetic {
   private int a;
   private int b;

    public void setA (int a) {
        if (a > 0 ) {
            this.a = a;
        } else {
            System.out.println("Ошибка! Число не может быть отрицательным числом!");
        }
    }

    public void setB (int b) {
        if (b > 0 ) {
            this.b = b;
        } else {
            System.out.println("Ошибка! Число не может быть отрицательным числом!");
        }
    }

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
        System.out.println(" Арифметические действия: ");

        System.out.print( " Сумма чисел :" + '\t'+'\t' +'\t'+ '\t');
        numbers.getSum();

        System.out.print( " Разность чисел :" + '\t'  +'\t' + '\t');
        numbers.getDifference();

        System.out.print( " Произведение чисел :"  +'\t' +'\t');
        numbers.getProductOfNumbers();

        System.out.print(" Среднее значение чисел: " + '\t');
        numbers.getAverageOfNumbers();

        System.out.print(" Максимальное из чисел: "  +  '\t');
        numbers.getMaximumOfNumbers ();

        System.out.print(" Минимальное из чисел: "   +'\t' +'\t');
        numbers.getMinimumOfNumbers ();


    }
}






