

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
    public int getSum () {
        int sum = (a + b);
        return sum;
    }
    public int getDifference() {
        int difference = (a - b);
        return difference;
    }
    public int getProductOfNumbers () {
        int product = (a * b);
        return product;
    }
    public int getAverageOfNumbers() {
        int average = ((a + b) / 2);
        return average;
    }
    public int getMaximumOfNumbers () {

        int maxOfNumbers = Math.max(a, b);
        return maxOfNumbers;
    }
    public int getMinimumOfNumbers () {

        int minOfNumbers = Math.min(a, b);
        return minOfNumbers;
    }
    public Arithmetic (int a, int b) {

        this.a = a;
        this.b = b;
}
    public static void main(String[] args) {

        Arithmetic numbers = new Arithmetic(70,50);
        System.out.println(" Арифметические действия: ");
        System.out.println( " Сумма чисел :" + '\t'+'\t' +'\t'+ '\t' + numbers.getSum());
        System.out.println( " Разность чисел :" + '\t'  +'\t' + '\t' + numbers.getDifference());
        System.out.println( " Произведение чисел :"  +'\t' +'\t' + numbers.getProductOfNumbers());
        System.out.println(" Среднее значение чисел: " + '\t' + numbers.getAverageOfNumbers());
        System.out.println(" Максимальное из чисел: "  +  '\t' + numbers.getMaximumOfNumbers ());
        System.out.println(" Минимальное из чисел: "   +'\t' +'\t' + numbers.getMinimumOfNumbers ());

    }
}






