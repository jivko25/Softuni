package Softuni.Algorithms.RecursionAndBackTracking;

public class BubbleSort {
	static void Print(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
	static void Sort(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int k = 0;k<arr.length-1;k++) {
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
//		for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr.length - 1; j++)
//            {
//                if (arr[j] > arr[j + 1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
		Print(arr);
	}
	public static void main(String [] args) {
		int [] arr = {3, 1, 2};
		Sort(arr);
	}
}
