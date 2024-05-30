package com.demo.test;

import com.demo.service.BubbleSortService;

public class TestbubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[5];
		BubbleSortService.acceptArray(arr);
		BubbleSortService.displayArray(arr);
		arr=BubbleSortService.bubbleSorting(arr);
		BubbleSortService.displayArray(arr);
	}

}
