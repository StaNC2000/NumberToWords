package com.eS;

public class NumberToWords {

    public static void numberToWords(int number) {

        int digitStripper = reverse(number);
        int reminder = 0;
        int count = 0;
        int difference = getDigitCount(number) - getDigitCount(digitStripper);
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (count = 0; count < getDigitCount(number); count++){
            if (difference > 0) {
                reminder = digitStripper % 10;
                digitStripper = digitStripper / 10;
                reminder = reminder;
            }
            else if (difference == 0){
                reminder = digitStripper % 10;
                digitStripper = digitStripper / 10;
                reminder = reminder;
            }

            switch (reminder) {
                case 0:
                    System.out.println("Zero");
                    continue;
                case 1:
                    System.out.println("One");
                    continue;
                case 2:
                    System.out.println("Two");
                    continue;
                case 3:
                    System.out.println("Three");
                    continue;
                case 4:
                    System.out.println("Four");
                    continue;
                case 5:
                    System.out.println("Five");
                    continue;
                case 6:
                    System.out.println("Six");
                    continue;
                case 7:
                    System.out.println("Seven");
                    continue;
                case 8:
                    System.out.println("Eight");
                    continue;
                case 9:
                    System.out.println("Nine");
                    continue;
                default:
                    System.out.println();
            }
        }
    }

    public static int reverse(int number) {
        int reversingNumber = number;
        int reminder;
        int reverse = 0;
        int difference = getDigitCount(number) - getDigitCount(reverse);
        int count = 0;


        while (reversingNumber != 0 ) {
            reminder = reversingNumber % 10;
            reverse = (reverse * 10) + reminder;
            reversingNumber = reversingNumber / 10;

            }


        return reverse;
    }

    public static int getDigitCount(int number){
        int counter;
        int digit = number;
        if (number < 0){
            return - 1;
        }

        if ( number == 0){
            return 1;
        }

        for (counter = 0; digit > 0 ; counter++){
            if (digit <= number){
                digit = digit / 10;
            }
            else {
                counter = digit;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("*******");
        numberToWords(-100);
        System.out.println("*******");
        numberToWords(1010);
        System.out.println("*******");
        numberToWords(1000);
        System.out.println("*******");
        numberToWords(1234567890);
        System.out.println("*******");







    }
}
