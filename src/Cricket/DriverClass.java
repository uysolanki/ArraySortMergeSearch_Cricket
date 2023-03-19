package Cricket;

public class DriverClass {
public static void main(String[] args) {
	int arr[]= {7,6,6,6};
	int k=4;
	Cricket c=new Cricket();
	int mnot=c.noOfTeams(arr,k);
	System.out.println("Maximum Number Of Teams Possible"+mnot);
}
}
