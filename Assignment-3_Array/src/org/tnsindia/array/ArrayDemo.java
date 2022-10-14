package org.tnsindia.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= new int [20];
		int arr1[]= {1,2,4,6,9};
		int arr11[]= {3,5,6};
		System.out.println(arr1[2]);
		arr[0]=12;
		System.out.println(arr[0]);
		
		/*int arr3[]=new int[3]{11,22,33};
		 * do not declare the size at the end if you are initializing the array
		 */
		int arr3[]= new int[]{11,22,33};
		System.out.println("The array index value is: "+arr3[2]);
		/*Array index out of bound exception as index is 3 we are accessing
		  and last index is 2
		System.out.println("The array index value is: "+arr[3]);*/
	}

}
