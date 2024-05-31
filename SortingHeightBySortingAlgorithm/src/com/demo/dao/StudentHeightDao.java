package com.demo.dao;

public interface StudentHeightDao {

	int[] showByBubbleSort(int[] stdarr);

	void showSortedHeight(int[] arr);

	int[] showByInsertionSort(int[] stdarr);

	int[] showBySelectionSort(int[] stdarr);

	int[] showByHeapSort(int[] stdarr);

}
