package com.demo.service;

import java.util.Scanner;

public class BubbleSortService {

	public static void acceptArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static void displayArray(int[] arr) {
		System.out.println("----------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "\t");
		}
		System.out.println();
	}

	public static int[] bubbleSorting(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			flag=false;
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					flag=true;
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(!flag) {
				break;
			}
		}
		return arr;
	}

}
