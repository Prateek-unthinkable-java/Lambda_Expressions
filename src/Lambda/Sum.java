package Lambda;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        SumInter s = (int a,int b)-> System.out.println("Sum is: " +(a+b));
        s.sum(var1,var2);
        sc.close();
    }
}

@FunctionalInterface
interface SumInter{
    public void sum(int a,int b);
}