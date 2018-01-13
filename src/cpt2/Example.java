package cpt2;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
//		eg1
//		int i,j=0;int k =0;
//		System.out.println(i + " " + j +" " + k);

//		eg2
//		int i=2;
//		int j,k;
//		j = k = 3;
//		System.out.println(i + " " + j +" " + k);
		
//		eg3
//		int sum = 0;
//		sum += 4.5;
//		System.out.println(sum);
		
//		零钱兑整
//		dollar(美元),quarter(2角5分),dime(1角),nickel(5分)，penny(1分)
		Scanner in = new Scanner(System.in);
		System.out.println("enter an amount in double ,for example 11.56");
		double amount = in.nextDouble();
		int remainAmount = (int) (amount*100);
		int dollars = remainAmount/100;
		System.out.println("dollars is "+dollars);
		remainAmount = remainAmount%100;
		int quarters = remainAmount/25;
		System.out.println("quarter is "+quarters);
		remainAmount = remainAmount%25;
		int dime = remainAmount/10;
		System.out.println("dime is "+dime);
		remainAmount = remainAmount%10;
		int nickel = remainAmount/5;
		System.out.println("nickel is "+nickel);
		remainAmount = remainAmount%5;
		int penny = remainAmount/1;
		System.out.println("penny is "+penny);
	}
}
