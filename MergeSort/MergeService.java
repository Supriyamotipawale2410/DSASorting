package com.demo.service;

import java.util.Scanner;

public class MergeService {

	public static void Acceptdetails(int[] arr) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter elements in array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
		
	}

	public static void displaydata(int[] arr) {
		System.out.println("elements in array are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static void MergeSort(int[] arr, int start, int end) {
		if(start<end) {
		int mid=(int)(start+end)/2;
		MergeSort(arr,start,mid);
		MergeSort(arr,(mid+1),end);
		Merge(arr,start,mid,end);
		
		
		}
		
	}

	private static void Merge(int[] arr, int start, int mid, int end) {
		 {
		int n1=mid-start+1;//size of left arr
		int n2=end-mid;//size of right arr
		int[] leftarr=new int[n1];//create leftarr
		int[] rightarr=new int[n2];//create right arr
		
		for(int i=0;i<n1;i++)//copy of leftarray
		{
			leftarr[i]=arr[start+i];
		}
		for(int i=0;i<n2;i++)//copy of right array
		{
			rightarr[i]= arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2)//
		{
			if(leftarr[i]<=rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			}else
			{
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		while(i<n1)//copy remaining elements  from left array
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2)//copy remaining elements  from right array
		{
			arr[k]=rightarr[j];
			j++;
			k++;
		}
			
	}

}
}