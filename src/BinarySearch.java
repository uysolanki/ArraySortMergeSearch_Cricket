
public class BinarySearch {

	public int search(int[] arr, int right, int s) {
		int pivot=right/2;
		if(s==arr[pivot])
			return pivot;
		else if (s>arr[0])
			return modifySearch(arr,0,pivot-1,s);
		else
			return modifySearch(arr,pivot+1,right,s);
			
	}

	private int modifySearch(int[] arr, int left, int right, int s) {
		if(left>right)
		return -1;
		
		int mid=(left+right)/2;
		if(s==arr[mid])
			return mid;
		else if(s>arr[mid])
			return modifySearch(arr,mid+1,right,s);
		else
			return modifySearch(arr,left,mid-1,s);
			
	}

}
