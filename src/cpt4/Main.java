package cpt4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		ex1
//		System.out.print("Enter the length from the center to a vertex :");
//		double r = in.nextDouble();
//		double s = 2*r*Math.sin((double)Math.PI/5);
//		double low = 4 * Math.tan((double)Math.PI/5);
//		double ss = (double)(5*s*s)/(low);
//		//保留小数点后两位
//		System.out.printf("%.2f",ss);
//		
//		ex2
//		double x1,x2,y1,y2;
//		System.out.print("Enter point1 (latitude and longitude) in degrees :");
//		x1 = in.nextDouble();
//		y1 = in.nextDouble();
//		System.out.print("Enter point2 (latitude and longitude) in degrees :");
//		x2 = in.nextDouble();
//		y2 = in.nextDouble();
//		double r = 6371.01;
//		double d = r * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
//			      Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
//			      Math.cos(Math.toRadians(y1 - y2)));
//	    System.out.println("The distance between the two points is " + d + " km");
	
//		ex5
//		System.out.print("Enter the number of sides : ");
//		int n = in.nextInt();
//		System.out.print("Enter the side : ");
//		double s = in.nextDouble();
//		double area = (double)(n*s*s)/(4*Math.tan((double)Math.PI/n));
//		System.out.println("The area of the polygon is "+ area);
	
//		ex7
//		double r = 100;
//		System.out.print("Enter the radius of the bounding circle : "+r);
//		for (int i = 0; i < 5; i++) {
//			double a = Math.random() * 2 * Math.PI;
//			double x = r * Math.cos(a);
//			double y = r * Math.sin(a);
//			System.out.println("("+x+" , "+y+")");
//		}
		
//		ex8 ASCII码的转换
//		int ascii = ;
//		char ch = (char)ascii;
//		System.out.println(ch);
		
//		ex9 给出字符的unicode码
//		String m = in.nextLine();
//		int t = (int)(m.charAt(0));
//		System.out.println(t);
//		
//		ex11   十进制转换成十六进制
//		int decimal;
//		System.out.print("Enter a decimal value(0 to 15) :");
//		decimal = in.nextInt();
//		char hex;
//		if(decimal<10){
//			System.out.println("The hex value is "+decimal);
//		}else if(decimal>=10&&decimal<=15){
//			hex = (char) (decimal+'A'-10);
//			System.out.println("The hex value is "+hex);
//		}else{
//			System.out.println(decimal+" is an invalid input"); 
//		}
//		
//		ex 12	十六转二
//		System.out.print("ENTER A HEX DIGIT : ");
//		char hex = in.nextLine().charAt(0);
//		int deci = hex-'A'+10;
//		int binary = 0;
//		int i = 0;
//		while(deci!=0){
//			binary += (int)(deci%2)*(Math.pow(10, i));
//			deci = deci/2;
//			i++;
//		}
//		System.out.println(binary);
//		
//		ex_16	
//		int random = (int)(Math.random()*26);
//		System.out.println(random);
//		char rad = (char) (random+'A');
//		System.out.println(rad);
		
//		ex_21
//		String m = in.nextLine();
//		int i = 0;
//		if (m.length()!=11 || m.charAt(3)!='-' || m.charAt(6)!='-') {
//			System.out.println(m+" is an invalid social security number");
//		}else{
//			for(i = 0;i<m.length()&&i!=3&&1!=6;i++){
//				if (m.charAt(i)<48||m.charAt(i)>57) {
//					break;
//				}
//			}
//			if (i == m.length()) {
//				System.out.println(m+" is a valid social security number");
//			}else{
//				System.out.println(m+" is an invalid social security number");
//				
//			}
//		}
		
//		ex 22
//		String s1 = in.nextLine();
//		String s2 = in.nextLine();
//		if(s1.contains(s2)){
//			System.out.println(s2+" is a substring of "+s1);
//		}else{
//			System.out.println(s2+" is not a substring of "+s1);
//		}
//		ex 24
//		String s1 = in.nextLine();
//		String s2 = in.nextLine();
//		String s3 = in.nextLine();
//		if(s1.compareTo(s2)>0){
//			String temp = s1;
//			s1 = s2;
//			s2 = temp;
//		}
//		if(s1.compareTo(s3)>0){
//			String temp = s1;
//			s1 = s3;
//			s3 = temp;
//		}
//		if(s2.compareTo(s3)>0){
//			String temp = s2;
//			s2 = s3;
//			s3 = temp;
//		}
//		System.out.println(s1+" "+s2+" "+s3);
		
		
		
	}
		
}
