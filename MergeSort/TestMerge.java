package com.demo.test;

import java.util.Scanner;

import com.demo.service.MergeService;

public class TestMerge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		MergeService.Acceptdetails(arr);
		MergeService.displaydata(arr);
        MergeService.MergeSort(arr,0,arr.length-1);
        MergeService.displaydata(arr);
	}

}
