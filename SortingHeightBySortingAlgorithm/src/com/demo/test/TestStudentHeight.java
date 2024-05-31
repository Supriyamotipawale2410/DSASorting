package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentHeightService;
import com.demo.service.StudentHeightServiceImpl;

public class TestStudentHeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentHeightService sservice= new StudentHeightServiceImpl();
		int choice = 0;
		int[] stdarr= new int[10];
				
		System.out.println("Enter array elements:");
		for(int i=0;i<stdarr.length;i++) {
			stdarr[i] = sc.nextInt();
		}
		
		do {
			System.out.println("Choose sorting algorithm to find sorted order height:");
			System.out.println("1. Bubble Sort\t2. Insertion Sort\t3. Selection Sort\t4. Heap Sort\t5. Exit\n---------------\nEnter choice");
			 choice=sc.nextInt();
			 switch(choice) {
			 case 1:
				 int[] arr=sservice.sortByBubbleSort(stdarr);
				 sservice.displaySortedHeight(arr);
				 break;
				 
			 case 2:
				 arr=sservice.sortByInsertionSort(stdarr);
				 sservice.displaySortedHeight(arr);
				 break;
				 
			 case 3:
				 arr=sservice.sortBySelectionSort(stdarr);
				 sservice.displaySortedHeight(arr);
				 break;
				 
			 case 4:
				 arr=sservice.sortByHeapSort(stdarr);
				 sservice.displaySortedHeight(arr);
				 break;
				 
			 case 5:
				 System.out.println("Exit..........\nThank you for visiting");
				 break;	 
				 
			default:
				System.out.println("Invalid choice..................................");
			 }
		}while(choice!=5);
	}
}
//1. bubble sort
