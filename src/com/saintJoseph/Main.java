package com.saintJoseph;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers=generateRandomInt(20,50);
        display(numbers);
        System.out.println("\n the smallest number is " +smallest(numbers));
        System.out.println("The biggest number is "+biggest(numbers));
        System.out.println("The range is "+range(numbers));
        System.out.println("The mean is "+mean(numbers));
        System.out.println("The standard deviation is "+ stdev(numbers));
	// write your code here
    }
    static void display(int[]numbers)
    {
        for(int i=0;i<numbers.length;++i)
            System.out.print(numbers[i]+"\t");
    }

    static int[] generateRandomInt(int max,int size)
    {
        Random random=new Random();
        int[]numbers=new int[size];
        for(int i=0;i<size;++i)
            numbers[i]=random.nextInt(max);
        return numbers;
    }
    static int smallest(int[]numbers)
    {
        int min=numbers[0];
        for(int i=1;i<numbers.length;++i)
        {
            if(min >numbers[i])
                min=numbers[i];
        }
        return min;
    }
    static int biggest(int[]numbers)
    {
        int biggest =numbers[0];
        for(int i=1; i<numbers.length;++i)
        {
            if( biggest <numbers[i])
                biggest=numbers[i];
        }
      return biggest;
    }
    static int range(int[] numbers)
    {
       return (biggest(numbers)-smallest(numbers));
    }
    static double mean(int[]numbers)
    {
        double sum=0.0;
        for(int i=0; i<numbers.length;++i)
            sum =sum+numbers[i];
       return sum/numbers.length;
    }
    static double stdev(int[]numbers)
    {
        double avg=mean(numbers);
        double variance=0.0;
        for(int i=0; i<numbers.length;++i)
            variance =variance +Math.pow(numbers[i]-avg,2);
       return Math.sqrt(variance/numbers.length);
    }
}
