import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the " + size + "Elements");
		for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
		
		
		System.out.println("Before Sorting "+ Arrays.toString(arr));
		
		MergeSort ms=new MergeSort();
		ms.sort(arr,0,size-1);
		System.out.println("After Sorting "+ Arrays.toString(arr));
		
		int midElement=size/2;
		
		ArrayRotation ar=new ArrayRotation();
		ar.rotate(arr,midElement );
		
		System.out.println("After Rotation "+ Arrays.toString(arr));
		
		BinarySearch bs=new BinarySearch();
		System.out.println("Enter Number to search");
		int s=sc.nextInt();
			int index=bs.search(arr,arr.length-1,s);
			if(index==-1)
				System.out.println("Number Not Found");
			else
				System.out.println("Number Found at Index "+index);
	}	
}
