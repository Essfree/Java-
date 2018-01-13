package cpt3;

import java.util.Scanner;

public class Ex_1_34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		ex1
//		double a,b,c;
//		System.out.println("enter a,b,c ");
//		a = in.nextDouble();
//		b = in.nextDouble();
//		c = in.nextDouble();
//		double r1,r2;
//		double del = (b*b-4*a*c);
//		if (del == 0) {
//			r1 = (-b+Math.pow(del, 0.5))/(2*a);
//			System.out.println("the equation has one root "+r1);
//		}else if (del < 0) {
//			System.out.println("the equation has no real roots");
//		}else if (del > 0){
//			r1 = (-b+Math.pow(del, 0.5))/(2*a);
//			r2 = (-b-Math.pow(del, 0.5))/(2*a);
//			System.out.println("the equation has two roots "+ r1 +" and "+ r2);
//		}
		
//		ex5
//		System.out.print("enter today's day : ");
//		int t,f;
//		t = in.nextInt();
//		System.out.print("enter number os days elapse since today : ");
//		f = in.nextInt();
//		switch (t) {
//		case 0:
//			System.out.print("today is sunday ");
//			break;
//		case 1:
//			System.out.print("today is monday ");
//			break;
//		case 2:
//			System.out.print("today is tuesday ");
//			break;
//		case 3:
//			System.out.print("today is wednesday ");
//			break;
//		case 4:
//			System.out.print("today is thursday ");
//			break;
//		case 5:
//			System.out.print("today is friday ");
//			break;
//		case 6:
//			System.out.print("today is saturday ");
//			break;
//		default:
//			break;
//		}
//		t = (t + f)%7;
//		switch (t) {
//		case 0:
//			System.out.println("and the future day is sunday");
//			break;
//		case 1:
//			System.out.println("and the future day is monday");
//			break;
//		case 2:
//			System.out.println("and the future day is tuesday");
//			break;
//		case 3:
//			System.out.println("and the future day is wednesday");
//			break;
//		case 4:
//			System.out.println("and the future day is thursday");
//			break;
//		case 5:
//			System.out.println("and the future day is friday");
//			break;
//		case 6:
//			System.out.println("and the future day is saturday");
//			break;
//		default:
//			break;
//		}
		
//		ex9
//		System.out.println("Enter the first 9 digits of an ISBN as integer : ");
//		int first9;
//		int all = 0;
//		first9 = in.nextInt();
//		int t[] = new int[10];
////		System.out.println(first9/(int)(Math.pow(10, 8))%10);
//		for(int i = 0;i<9;i++){
//			int temp = (first9/(int)(Math.pow(10, i))%10)*(9-i);
//			all += temp;
//			t[i] = first9/(int)(Math.pow(10, 8-i))%10;
//			System.out.print(t[i]);
//		}
//		int isbn = all%11;
//		if(isbn == 10){
//			System.out.println("X");
//		}else{
//			System.out.println(isbn);
//		}
		
//		 ex21
//		int h,q,m,j,k;
//		int year;
//		System.out.print("Enter year : ");
//		year = in.nextInt();
//		System.out.print("Enter month : ");
//		m = in.nextInt();
//		if(m == 1){
//			m = 13;
//			year = year - 1;
//		}else if(m == 2){
//			m = 14;
//			year = year - 1;
//		}
//		System.out.print("Enter the day of the month : ");
//		q = in.nextInt();
//		k = year % 100;
//		j = Math.abs(year/100);
//		h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j)%7;
//		String day = "";
//		switch (h) {
//		case 0:
//			day = "saturday";
//			break;
//		case 1:
//			day = "sunday";
//			break;
//		case 2:
//			day = "monday";
//			break;
//		case 3:
//			day = "tuesday";
//			break;
//		case 4:
//			day = "wednesday";
//			break;
//		case 5:
//			day = "thurday";
//			break;
//		case 6:
//			day = "friday";
//			break;
//		default:
//			break;
//		}
//		System.out.println("Day of the week is "+day);
		
//		ex22
	}
}
