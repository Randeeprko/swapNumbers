package demo;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1,num2;
		num1 = sc.nextInt();  // suppose num1 = 3 and num2 =4
		num2 = sc.nextInt();
		System.out.println("Numbers before Swapping : "+num1+" "+num2);
		num1 = num1 + num2;    //   num1 = 3 + 4 = 7
 		num2 = num1 - num2;    //   num2 = 7 - 4 = 3
		num1 = num1 - num2;    //   num1 = 7 -3 = 4
		System.out.println("Numbers After Swapping : "+num1+" "+num2);    // so num1 = 4 and num2 = 3
		
		// Second method using bitwise XOR operator
		System.out.println("Enter next numbers");
		int num3,num4;
		num3 = sc.nextInt();     //   suppose num3 = 3 and num4 =4
		num4 = sc.nextInt();     //   simple binary representation of num3 = 011 and num4 = 100
		System.out.println("Numbers before Swapping : "+num3+" "+num4);
		num3 = num3 ^ num4;      //   num3 = 011 ^ 100 =  111
		num4 = num4 ^ num3;      //   num4 = 100 ^ 111 =   011
		num3 = num3 ^ num4;      //   num3 = 111 ^ 011 = 100
		System.out.println("Numbers After Swapping : "+num3+" "+num4);   // so num3 = 100 = 4 and num4 = 011 = 3		
		
		sc.close();
		

	}

}
