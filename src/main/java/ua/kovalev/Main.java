package ua.kovalev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        Factorial[] factorials = new Factorial[100];
        for (int i = 0; i < 100; i++) {
            factorials[i] = new Factorial(i);
            threads[i] = new Thread(factorials[i]);
            threads[i].start();
        }

        for (Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Arrays.stream(factorials).forEach(f-> System.out.println(String.format("!%d = %s", f.getNumber(), f.getResult())));
    }
}
