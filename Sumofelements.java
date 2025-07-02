package projectfor10259;

import java.util.Arrays;

public class Sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key = 3;
		int arr[]= {1,1,2,5,4,3,13}; // 5 ,{ 1,4} {2,3}
		
		System.out.println(Arrays.binarySearch(arr, key));
		Arrays.sort(arr);
		
		for(int y : arr)
		{
			System.out.println(y);
		}
		
		
		/*
		 * for(int i = 0 ; i < arr.length ; i++) { for(int j = i+1; j < arr.length ;
		 * j++) { if(arr[i] + arr[j] == key) { System.out.println(arr[i] + " " +
		 * arr[j]); }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

	}

}
