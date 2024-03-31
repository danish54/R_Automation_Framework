package com.array;

import java.util.ArrayList;

public class Find_unique_Number_from_ARRAY {

	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 }; // Print unique number from the list-

		ArrayList<Integer> AL = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!AL.contains(a[i])) {

				AL.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {

						k++;
					}

				}
				
				if(k==1) {
					
					System.out.println(a[i]+" is the unique number, K => "+ k);
				}

			}
		}

	}

}
