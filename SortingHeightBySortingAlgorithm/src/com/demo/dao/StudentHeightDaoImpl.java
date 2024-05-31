package com.demo.dao;

public class StudentHeightDaoImpl implements StudentHeightDao{

public void showSortedHeight(int[] stdarr) {
		
		for(int i = 0;i<stdarr.length;i++) {
			System.out.println("Student "+(i+1)+" : Height ---->"+stdarr[i]);
		}
		System.out.println("=========================================================================");
	}

	public int[] showByBubbleSort(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			if(!flag) {
				
				break;
			}
		}
		return arr;
		
	}

	public int[] showByInsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//value we want to insert into sorted portion
			int key=arr[i]; 
			//j is placed at end of sorted portion
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		return arr;
	}

	@Override
	public int[] showBySelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minidx=findMinForSelecSort(arr,i,arr.length);
		int temp=arr[i];
		arr[i]=arr[minidx];
		arr[minidx]=temp;
		}
		return arr;
	}

	private int findMinForSelecSort(int[] arr, int start, int end) {
		int min = arr[start];
		int minidx=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minidx=i;
			}
			
		}
		return minidx;
	}

	@Override
	public int[] showByHeapSort(int[] arr) {
int n=arr.length;
		
		//build a maxheap
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		//swap the first element with the last element of unsorted part
		for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		
		heapify(arr,i,0);
		}
		return arr;
	}

	private static void heapify(int[] arr, int n, int i) {
		//find the largest among root, left child, right child
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
			largest=right;
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
		
	}
		
}
