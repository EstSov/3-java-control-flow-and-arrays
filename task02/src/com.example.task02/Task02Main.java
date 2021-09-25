package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if(monthNumber<=2 || monthNumber==12)
        {
            return ("зима");
        }
        if((monthNumber<=5) && (monthNumber >2))
        {
            return ("весна");
        }
        if((monthNumber<=8) && (monthNumber >5))
        {
            return ("лето");
        }
        if((monthNumber<=11) && (monthNumber >8))
        {
            return ("осень");
        }

        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}