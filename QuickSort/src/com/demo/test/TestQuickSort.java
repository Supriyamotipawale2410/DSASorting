package com.demo.test;

import java.util.Scanner;

import com.demo.service.QuickSortService;

public class TestQuickSort{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int size = sc.nextInt();				//accepting array size from user
		int[] arr = new int[size];
		
		QuickSortService.acceptData(arr);		//accepting array elements from user
		QuickSortService.displayData(arr);		//displaying array elements
		QuickSortService.quickSort(arr,0,arr.length-1);		//quickSort call for array arr
		System.out.println("Sorted array : ");
		QuickSortService.displayData(arr);  //displaying array after sorting
	}
}