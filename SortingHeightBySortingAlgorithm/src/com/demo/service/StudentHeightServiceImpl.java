package com.demo.service;

import com.demo.dao.StudentHeightDao;
import com.demo.dao.StudentHeightDaoImpl;

public class StudentHeightServiceImpl implements StudentHeightService{

	private StudentHeightDao sdao;

	public StudentHeightServiceImpl() {
		super();
		sdao = new StudentHeightDaoImpl();
	}

	@Override
	public int[] sortByBubbleSort(int[] stdarr) {
		
		return sdao.showByBubbleSort(stdarr);
	}

	@Override
	public void displaySortedHeight(int[] arr) {
		sdao.showSortedHeight(arr);
		
	}

	@Override
	public int[] sortByInsertionSort(int[] stdarr) {
		
		return sdao.showByInsertionSort(stdarr);
	}

	@Override
	public int[] sortBySelectionSort(int[] stdarr) {
		
		return sdao.showBySelectionSort(stdarr);
	}

	@Override
	public int[] sortByHeapSort(int[] stdarr) {
		
		return sdao.showByHeapSort(stdarr);
	}

	
		
	}

	
	
	

