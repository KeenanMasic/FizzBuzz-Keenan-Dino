package com.company;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 101; i++)

        {
            if(i % 3 == 0 && i % 5 == 0) {System.out.println("FizzBuzz");}

            if(i == 42) {System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");}

            else if(i % 3 == 0) {System.out.println("Fizz");}

            else if(i % 5 == 0) {System.out.println("Buzz");}

            else {System.out.println(i);}
        }

    }
}
