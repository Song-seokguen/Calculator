package org.opentutorials.javatutorials.git_cal;
import java.util.Scanner;

class cal extends mul{
	public void sum(int a, int b){
		System.out.println("++계산결과 : "+ (a+b));
	}
	public void min(int a, int b){
		System.out.println("--계산결과: "+ (a-b));
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		cal obj = new cal();
		obj.sum(a,b);
		obj.min(a,b);
		obj.mul(a, b);
	}

}
