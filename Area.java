package CalculatorArea;

import java.util.Scanner;


class Areaa{
   double rectangle(double l , double b)
   {
       System.out.println("Area of rectangle is : " + (l*b));
       return 0;
   }
   double square(double a)
   {
       System.out.println("Area of square is : " + (a*a));
       return 0;
   }
   double traingle(double b , double h) {
	   System.out.println("Area of tringle is - " + ((b*h)/2));
	   return 0;
   }
}
public class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number acc to your figure area required");
        System.out.println("1. Square \n 2. Rectangle \n 3. Traingle" );
        int fig_no = sc.nextInt();
        if(fig_no > 3)
        {
            System.out.println("You entered wrong figure no");
            System.exit(0);
        }
        else
        { Areaa a = new Areaa();
            switch(fig_no){
                case 1:
                    System.out.println("Enter length of square side");
                    int sq = sc.nextInt();
                    if(sq<=0)
                    {
                        System.out.println("Square cant have a negative side");
                        System.exit(0);
                    }
                    a.square(sq);
                    break;
                case 2:
                    System.out.println("Enter length of rectangle");
                    int l = sc.nextInt();
                    System.out.println("Enter width of rectangle");
                    int b = sc.nextInt();
                    if((l<=0) || (b<=0))
                    {
                         System.out.println("Square cant have a negative side");
                        System.exit(0);
                    }
                    a.rectangle(l, b);
                    	break;
                case 3:
                	System.out.println("Enter base");
                	int base = sc.nextInt();
                	System.out.println("Enter height");
                	int height = sc.nextInt();
                	if((base<=0) || (height <=0))
                	{
                		 System.out.println("Traingle can't have -ve area");
                		System.exit(0);
                	}
                	a.traingle(base, height);
                	break;
                	
                default:
                	break;            
                }
        }
    }
}
