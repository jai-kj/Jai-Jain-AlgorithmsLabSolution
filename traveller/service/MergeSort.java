package com.greatlearning.lab2.traveller.service;

public class MergeSort {
	private int arr[];
	private int n;
	
	public MergeSort() {
		arr = new int[0];
		n = 0;
	}
	
	public MergeSort(int arr[], int n) {
		this.arr = arr;
		this.n = n;
	}
	
	private void mergeDescending(int start, int mid, int end) {
		int i = start, j = mid + 1, index = start, temp[] = new int[n];
		
		while(i <= mid && j <= end) {
			if(arr[i] > arr[j])
				temp[index++] = arr[i++];
			else
				temp[index++] = arr[j++];
		}
		
		if(i > mid) 
			while(j <= end)
				temp[index++] = arr[j++];
		else
			while (i <= mid)
				temp[index++] = arr[i++];
		
		for(int k = start; k < index; k++)
			arr[k] = temp[k];
	}

	private void mergeAscending(int start, int mid, int end) {
		int i = start, j = mid + 1, index = start, temp[] = new int[n];
		
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j])
				temp[index++] = arr[i++];
			else
				temp[index++] = arr[j++];
		}
		
		if(i > mid) 
			while(j <= end)
				temp[index++] = arr[j++];
		else
			while (i <= mid)
				temp[index++] = arr[i++];
		
		for(int k = start; k < index; k++)
			arr[k] = temp[k];
	}
	
	public void startMerge(int start, int end, char order) {
		if(start < end) {			
			int mid = start + (end - start) / 2;
			startMerge(start, mid, order);
			startMerge(mid + 1, end, order);

			if(order == 'A')
				mergeAscending(start, mid, end);
			else 
				mergeDescending(start, mid, end);
		}
	}
	
	public int[] sorted() {
		return arr;
	}
}
