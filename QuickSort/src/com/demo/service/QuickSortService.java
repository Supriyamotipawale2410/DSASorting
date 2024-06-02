package com.demo.service;

import java.util.Scanner;

public class QuickSortService{

	public static void acceptData(int[] arr) {			//accept array elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static void displayData(int[] arr) {			//display array elemnts
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int start, int end) {		//quickSort call for full array
		if(start<end) {								//terminating condn for recurssion call to quickSort
			int p =partition(arr,start,end);	//partitioning array
			quickSort(arr,start,p-1);	//quickSort call to partition 1
			quickSort(arr,p+1,end);		//quickSort call to partition 2
		}
	}

	private static int partition(int[] arr, int start, int end) {		//patitioning
		int pivot=start;
		int i=start;
		int j = end;
		
		while(i<j) {													
			while(i<end && arr[i]<arr[pivot]) {		//condition to increment i
				i++;
			}
			while(j>pivot && arr[j]>arr[pivot]) {		//condition to increment j
				j--;
			}
			if(i<j) {					
				int temp = arr[i];						//swap i & j after above two conditions
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];			//if i>j swap j with pivot
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		
		return j;			//returns j and now j will become partition for further execution
	}
	
}