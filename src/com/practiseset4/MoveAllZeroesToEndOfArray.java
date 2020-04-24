package com.practiseset4;

//i/p:int array
//move only zeros to end
//Insertion order preserved of non zero numbers, duplicates allowed
//Practicle eg: Messaging application
public class MoveAllZeroesToEndOfArray {

	public static void main(String args[]) {
		int arr[] = {6,0,-3,0,0,4};

		int length = arr.length;
		System.out.print("Original array: ");
		printArray(arr, length);

		if (length > 1) // test cases: empty array, array with 1 element->checking reduce no of operations
		{

			moveZerosToEnd(arr, length);

			System.out.print("\nModified array: ");
			printArray(arr, length);
		} else {
			System.out.print("\nModified array: ");
			printArray(arr, length);
		}

	}

	static void moveZerosToEnd(int a[], int length) {
		int i = 0;//index where to put next non-zero

		for (int j = 0; j < length; j++) { //iterate array  -> O(n)
			if (a[j] != 0) // check current element is zero or not
				a[i++] = a[j]; // put jth non zero element in ith index of same array

		}

		while (i < length)
			a[i++] = 0;// fill the remaining array with zero

	}

	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
