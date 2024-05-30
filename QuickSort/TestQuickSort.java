package com.demo.test;

import java.util.Scanner;

import com.demo.service.QuickSortService;

public class TestQuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	int[] arr=new int[n];
	QuickSortService.acceptdetails(arr);
	QuickSortService.displaydetails(arr);
	
	
	QuickSortService.Sortarray(arr,0,arr.length-1);
	

	}

}
