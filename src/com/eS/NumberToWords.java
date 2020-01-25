package com.eS;

public class NumberToWords {

    public static void numberToWords(int number){

    }

    public static int reverseNumber(int number){
        int reversingNumber = number;
        int reminder;
        int reverse = 0;

        while (reversingNumber != 0){
            reminder = reversingNumber % 10;
            reverse = (reverse * 10) + reminder;
            reversingNumber = reversingNumber / 10;
        }

        return reverse;
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
        return counter + 1;
    }

    public static void main(String[] args) {
	// write your code here

//        System.out.println(getDigitCount(102));
        System.out.println(reverseNumber(12));
    }
}
