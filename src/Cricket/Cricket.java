package Cricket;

public class Cricket {

	public int noOfTeams(int[] arr, int k) {
		int min=0;
		int max=10;
		int mid;
		while(min<=max)
		{
			mid=(min+max)/2; //assume mid teams
			if(countOfTeam(arr,mid,k))
			{
				if(!countOfTeam(arr,mid+1,k))
				{
					return mid;
				}
				else
					min=mid+1;
			}
			else
			max=mid-1;
		}
		return 0;	
	}

	private boolean countOfTeam(int[] arr, int mid, int k) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+Math.min(mid, arr[i]);
		}
		
			if(sum>=mid*k)
				return true;
			else
				return false;
	}

}
