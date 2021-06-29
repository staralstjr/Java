package 별찍기_6월22일_과제;

import java.util.Scanner;


public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i = 0; i <= star; i++) {
			for(int j = 0; j < star - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = star; i > 0; i--) {
			for(int j = 0; j < star - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
