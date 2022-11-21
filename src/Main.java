import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("****Menu****\n1.Largest of 3 Numbers\n2.Smallest of 3 Numbers\n3.Check Prime or Not\n4.Even or Not\n5.Reverse of a Number\n6.Exit");

        while (true)
        {
            System.out.println("Enter your choice ");

            int ch = reader.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter 3 numbers ");
                    int n1 = reader.nextInt();
                    int n2 = reader.nextInt();
                    int n3 = reader.nextInt();

                    if(n1>n2&&n1>n3)
                    {
                        System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is" +n1);
                    } else if (n2>n1&&n2>n3) {
                        System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is" +n2);
                    } else if (n3>n1&&n3>n2) {
                        System.out.println("largest of these numbers "+n1+" "+n2+" "+n3+" is" +n3);
                    }
                    else
                    {
                        System.out.println("3 numbers are equal");
                    }


                case 2:
                    System.out.println("Enter 3 numbers ");
                    int s1 = reader.nextInt();
                    int s2 = reader.nextInt();
                    int s3 = reader.nextInt();

                    if(s1<s2&&s1<s3)
                    {
                        System.out.println("smallest of these numbers "+s1+" "+s2+" "+s3+" is" +s1);
                    } else if (s2<s1&&s2<s3) {
                        System.out.println("largest of these numbers "+s1+" "+s2+" "+s3+" is" +s2);
                    } else if (s3<s1&&s3<s2) {
                        System.out.println("largest of these numbers "+s1+" "+s2+" "+s3+" is" +s3);
                    }
                    else
                    {
                        System.out.println("3 numbers are equal");
                    }


            }
        }

    }

}
