package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        int suma = a + b;
        return suma;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        int max = a;
        if (a < b){
            max = b;
        }
        return max;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        if (n != 0) {
            return n * factorial(n - 1);
        }
        else{
            return 1;
        }
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        if (input.length() > 0) {
            return input.length();
        }
        else{
            return 0;
        }
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String reversed = "";
        for (int i = input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }
        return reversed;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int min = array[0];
        for(int i = 0; i<array.length; i ++){
            if(array[i] < min){
                min = array[i];
            }

        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int suma = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
        }
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        double fahrenheit = (celsius * ((double) 9 /5)) + 32;
        return fahrenheit;
    }
}
