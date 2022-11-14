public class Calculator {
    public static void Calculator(String[] args){}
    public int number0;
    public int number1;
    public int number2;
    public int number3;
    public int number4;


    public Calculator(int number0, int number1, int number2, int number3, int number4){
        this.number0 = number0;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;


    }

    public int addNumbers(int number1, int number2){
        return number1 + number2;
    }
    public int subtractNumber(int number1, int number2){
        return number1 - number2;
    }

    public int multiplyNumbers(int number1, int number2){
        return number1 * number2;
    }

    public double divideNumbers(double number1, double number2){
        return number1 / number2;
    }
}
