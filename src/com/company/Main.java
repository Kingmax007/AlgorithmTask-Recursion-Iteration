package com.company;

public class Main {
    //Given an array of ints, compute if the array contains a 6.
    //iteration
    public static boolean iterativeArray(int[] arr) {
        for (int element : arr) {
            if (element == 6) {
                return true;
            }
        }
        return false;
    }

    //Recursive Array
    public static boolean recursiveArray(int[] nums, int index) {
        if (nums.length == 0) return false;
        if (index < nums.length) {
            if (nums[index] == 6) return true;
        } else {
            return false;
        }
        return recursiveArray( nums, index + 1 );
    }

    //Given a string, compute a new string where all the adjacent chars and not separated by a "*".
    //Recursion
    public static String stringAsterisk(String asterisk) {
        if (asterisk.length() <= 1) {
            return asterisk;
        }
        return asterisk.charAt( 0 ) + "*" + stringAsterisk( asterisk.substring( 1 ) );

    }

    //iteration
    public static String stringAsterisk2(String str) {
        StringBuilder nStr = new StringBuilder();
        for(int i = 0 ; i<str.length() ; i++) {
            nStr.append(str.charAt(i));
            nStr.append("*");
        }
        return nStr.substring(0,nStr.length()-1);
    }

    //3. Given a non-negative int n, return the sum of its digits.
    // Recursion
    public static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumDigits( n / 10 );
    }

    //iteration
    public static int sumDigit2(int iSum) {
        int sum = 0;
        while (iSum != 0) {
            sum = sum + iSum % 10;
            iSum = iSum / 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        //   Given an array of ints, compute if the array contains a 6.

        System.out.println( recursiveArray( new int[]{1, 6, 4}, 0 ) );
        System.out.println( recursiveArray( new int[]{1, 4}, 0 ) );
        System.out.println( recursiveArray( new int[]{6}, 0 ) );

        System.out.println( iterativeArray( new int[]{1, 6, 4} ) );
        System.out.println( iterativeArray( new int[]{1, 4}) );
        System.out.println( iterativeArray( new int[]{6}) );


        //3. Given a non-negative int n, return the sum of its digits.

        System.out.println( sumDigits( 345 ) );
        System.out.println( sumDigits( 126 ) );
        System.out.println( sumDigits( 49 ) );
        System.out.println( sumDigits( 12 ) );

        System.out.println( sumDigit2( 345 ) );
        System.out.println( sumDigit2( 126 ) );
        System.out.println( sumDigit2( 49 ) );
        System.out.println( sumDigit2( 12 ) );

        //Given a string, compute a new string where all the adjacent chars and not separated by a "*".

        System.out.println( stringAsterisk( "PLAYER" ) );
        System.out.println( stringAsterisk( "hello" ) );
        System.out.println( stringAsterisk( "abc" ) );
        System.out.println( stringAsterisk( "ab" ) );

        System.out.println( stringAsterisk2( "PLAYER" ) );
        System.out.println( stringAsterisk2( "hello" ) );
        System.out.println( stringAsterisk2( "abc" ) );
        System.out.println( stringAsterisk2( "ab" ) );

    }
}






