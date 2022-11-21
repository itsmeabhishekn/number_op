import java.util.*;

public class Main {

    Scanner reader = new Scanner(System.in);
    void largest()
    {
        System.out.println("Enter 3 numbers ");
        int n1 = reader.nextInt();
        int n2 = reader.nextInt();
        int n3 = reader.nextInt();

        if(n1>n2&&n1>n3)
        {
            System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is " +n1);
        } else if (n2>n1&&n2>n3) {
            System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is " +n2);
        } else if (n3>n1&&n3>n2) {
            System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is " +n3);
        }
        else
        {
            System.out.println("3 numbers are equal");
        }
    }

    void smallest()
    {
        System.out.println("Enter 3 numbers ");
        int s1 = reader.nextInt();
        int s2 = reader.nextInt();
        int s3 = reader.nextInt();

        if(s1<s2&&s1<s3)
        {
            System.out.println("smallest of these numbers "+s1+" "+s2+" "+s3+" is " +s1);
        } else if (s2<s1&&s2<s3) {
            System.out.println("largest of these numbers "+s1+" "+s2+" "+s3+" is " +s2);
        } else if (s3<s1&&s3<s2) {
            System.out.println("largest of these numbers "+s1+" "+s2+" "+s3+" is " +s3);
        }
        else
        {
            System.out.println("3 numbers are equal");
        }
    }


    void primeOrNot()
    {
        System.out.println("Enter the number to check prime or not");
        int number = reader.nextInt();

        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {

            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }

    void evenOrNot()
    {
        System.out.println("Enter the number to check odd or even");
        int evenOdd = reader.nextInt();

        if(evenOdd%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("THe given number is odd");
        }
    }

    void reverseNum()
    {
        int reversed = 0;

        System.out.println("Enter the number to reverse");

        int num = reader.nextInt();

        System.out.println("Original Number: " + num);

                while(num != 0) {

                    int digit = num % 10;
                    reversed = reversed * 10 + digit;

                    num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }



    public static void main(String[] args) {



        System.out.println("****Menu****\n1.Largest of 3 Numbers\n2.Smallest of 3 Numbers\n3.Check Prime or Not\n4.Even or Not\n5.Reverse of a Number\n6.Exit");

        while (true)
        {
            System.out.println("Enter your choice ");

            Scanner reader = new Scanner(System.in);

            int ch = reader.nextInt();

            Main m1 = new Main();

            switch(ch)
            {
                case 1:

                    m1.largest();
                    break;


                case 2:

                   m1.smallest();
                    break;

                case 3:
                    m1.primeOrNot();
                    break;

                case 4:
                    m1.evenOrNot();
                    break;

                case 5:
                    m1.reverseNum();
                    break;

                case 6:
                    System.exit(0);
            }

            }
        }

    }
