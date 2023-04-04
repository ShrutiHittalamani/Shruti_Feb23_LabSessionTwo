package com.greatlearning.currency;

public class Driver {
	public static void main(String[] args) {
	//	IntegerSorting sorting = new BubbleSort();
		IntegerSorting sorting = new MergeSort();
		NotesCount counting = new NotesCount();
		int[] denominations = {60,5,12,78,25};
		sorting.sort(denominations);
		counting.calculateNotesCount(denominations,3);
	}
}
