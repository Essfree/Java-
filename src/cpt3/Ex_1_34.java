package cpt3;

import java.util.Scanner;

public class Ex_1_34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a={1,1,1,7,4,671};
		int total = 685;
		double[]e=new double[6];
		for (int i = 0; i < e.length; i++) {
			e[i] = (double)a[i]/total;
		}
		double k = 0;
		for (int i = 0; i < e.length; i++) {
			k =k+(-e[i]*((double)Math.log(e[i])/Math.log(2)));
		}
		System.out.println(k);
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
//		System.out.print("Enter a point with two coordinates : ");
//		int a,b;
//		a = in.nextInt();
//		b = in.nextInt();
//		double distance = Math.pow((a*a+b*b), 0.5);
//		if(distance < 10){
//			System.out.println("point ("+a+","+b+") is in the circle");
//		}else{
//			System.out.println("point ("+a+","+b+") is in not the circle");
//		}
		
//		ex23
//		System.out.print("Enter a point with two coordinates : ");
//		int a,b;
//		a = in.nextInt();
//		b = in.nextInt();
//		if(-5<=a&&a<=5&&-2.5<=b&&b<=2.5){
//			System.out.println("point ("+a+","+b+") is in the rectangle");
//		}else{
//			System.out.println("point ("+a+","+b+") is in not the rectangle");
//		}
		
//		ex24
//		int t = (int) (Math.random()*13+1);
//		String card = "";
//		switch (t) {
//		case 1:
//			card = "Ace";
//			break;
//		case 2:
//			card = "2";
//			break;
//		case 3:
//			card = "3";
//			break;
//		case 4:
//			card = "4";
//			break;
//		case 5:
//			card = "5";
//			break;
//		case 6:
//			card = "6";
//			break;
//		case 7:
//			card = "7";
//			break;
//		case 8:
//			card = "8";
//			break;
//		case 9:
//			card = "9";
//			break;
//		case 10:
//			card = "10";
//			break;
//		case 11:
//			card = "Jack";
//			break;
//		case 12:
//			card = "Queen";
//			break;
//		case 13:
//			card = "King";
//			break;
//		default:
//			break;
//		}
//		int c = (int) (Math.random()*4);
//		String color="";
//		switch (c) {
//		case 0:
//			color = "Clubs";
//			break;
//		case 1:
//			color = "Diamonds";
//			break;
//		case 2:
//			color = "Hearts";
//			break;
//		case 3:
//			color = "Spades";
//			break;
//		default:
//			break;
//		}
//		System.out.println("The card you picked is "+card+" of "+color);
		
//		ex27
//		double x;
//		double y;
//		double a,b;
//		System.out.println("Enter a point's x- and y- coordinates : ");
//		a = in.nextDouble();
//		b = in.nextDouble();
//		y = -0.5*a+100;
//		if(a>=0&&a<=200&&b<=y&&b>=0){
//			System.out.println("the point is in the triangle");
//		}else{
//			System.out.println("the point is not in the tiangle");
//		}
		
//		ex28
//		double x1,x2,y1,y2,h1,h2,w1,w2;
//		System.out.print("Enter r1's center x-,y-coordinates,width,and height : ");
//		x1 = in.nextDouble();
//		y1 = in.nextDouble();
//		w1 = in.nextDouble();
//		h1 = in.nextDouble();
//		System.out.print("Enter r2's center x-,y-coordinates,width,and height : ");
//		x2= in.nextDouble();
//		y2 = in.nextDouble();
//		w2 = in.nextDouble();
//		h2 = in.nextDouble();
//		
//		if(((x1-w1/2)<=(x2-w2/2))&&((x1+w1/2)>=(x2+w2/2))&&((y1-h1/2)<=(y2-h2/2))&&((y1+h1/2)>=(y2+h2/2))){
//			System.out.println("r2 is inside r1");
//		}else if(((x1-w1/2)>(x2+w2/2))||((x1+w1/2)<(x2-w2/2))||((y1-h1/2)>(y2+h2/2))||((y1+h1/2)<(y2-h2/2))){
//			System.out.println("r2 is not overlap r1");
//		}else{
//			System.out.println("r2 is overlap r1");
//		}
//		
//
	
	}
}
