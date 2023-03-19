
public class ArrayRotation {

	public void rotate(int[] arr, int n) {
		
		for(int i=1;i<=n;i++)
		{
			int temp=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
				arr[j]=arr[j+1];
			
			arr[j]=temp;			
		}
	}

}
