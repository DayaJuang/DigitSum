package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = sumDigits(244);

        System.out.println(ans);
    }

    public static int sumDigits(int num){
        // Check if the number is greater or equal to 10
        if(num < 10)
            return -1;

        // Calculate the sum
        int sum = 0;
        while(num > 0){
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

}