package ua.kovalev;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number;
    private BigInteger result;

    public Factorial() {
        super();
    }

    public Factorial(int number) {
        super();
        this.number = number;
        this.result = BigInteger.ONE;
    }

    @Override
    public void run() {
        if (number > 0){
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf((i)));
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigInteger getResult() {
        return result;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }
}
