package com.ss.weekone.loops;

/**
 * @author Matthew Hader
 *
 */
public class LoopsPractice {

	public static void main (String args[]) {
		
		//First print set
		System.out.println("1)");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("...........");
		
		
		//Second print set
		System.out.println("2)");
		System.out.println("...........");
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		//Third print set
		System.out.println("3)");
		for(int i = 0; i < 4; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (2 * i); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("...........");
		
		
		//Fourth print set
		System.out.println("4)");
		System.out.println("...........");
		for(int i = 4; i > 0; i--) {
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
}
