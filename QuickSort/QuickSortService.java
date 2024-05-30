package com.demo.service;

import java.util.Scanner;

public class QuickSortService {

	public static void acceptdetails(int[] arr) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements of array");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		
	}

	public static void displaydetails(int[] arr) {
		System.out.println("Elements in array are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	public static void quicksort(int[] arr, int start, int end) {
		if(start<end) {
		//for partition
			int p=Sortarray(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
		}
	}

	public static int Sortarray(int[] arr, int first, int last) {
		
		int pivot =first;
		int i=first;
		int j=last;
		
		while(i<j)//atleast 2 elements should be there in arr
		{
			while(i<last && arr[i]<=arr[pivot])
			i++;
			while(j>first && arr[j]>arr[pivot])
				j--;
			
				if(i<j) 
				{
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
			System.out.println("pivot"+arr[j]+" is placed at" +j +" position");
			displaydetails(arr);
			return j;
			
		}
	}


