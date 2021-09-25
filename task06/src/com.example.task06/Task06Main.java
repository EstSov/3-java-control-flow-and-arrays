package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int max=0;
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(a >= b && a >= c && a >= d) max = a;
        if(b >= a && b >= c && b >= d) max = b;
        if(c >= b && c >= a && c >= d) max = c;
        if(d >= b && d >= a && d >= c) max = d;
        return max;
    }

}