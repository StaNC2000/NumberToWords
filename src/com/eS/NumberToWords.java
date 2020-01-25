package com.eS;

public class NumberToWords {

    public static void numberToWords(int number){

    }

    public static int reverseNumber(int number){

        return - 1;
    }


    public static int getDigitCount(int number){
        int counter;
        int digit = number;
        if (number <= 0){
            return - 1;
        }

        for (counter = 0; counter <= digit; counter++){
            if (digit <= number){
                digit = digit / 10;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(getDigitCount(656465));

    }
}
