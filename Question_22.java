import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question_22 
{
	public static void main(String args[]) throws Exception
	{
		
		//merge two sorted arrays
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter no of inputs for 1st array : ");
		int n1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[n1];
		System.out.println("enter inputs in sorted order for 1st array : ");
		for(int i = 0; i<n1; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("enter no of inputs for 2nd array : ");
		int n2 = Integer.parseInt(br.readLine());
		int arr2[] = new int[n2];
		System.out.println("enter inputs in sorted order for 2nd array : ");
		for(int i = 0; i<n2; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("1st array : ");
		for(int val : arr1) { System.out.print(val + " "); }
		
		System.out.println("2nd array : ");
		for(int val : arr2) { System.out.print(val + " "); }
		
		int mergeArr[] = new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]>arr2[j]) {
				mergeArr[k] = arr2[j];
				j++;
			}
			else {	
				mergeArr[k] = arr1[i];
				i++;
			}
			k++;
		}
		while(i<n1) {
			mergeArr[k] = arr1[i];
			i++;
		}
		while(j<n2) {
			mergeArr[k] = arr2[j];
			j++;
		}
		System.out.println("merge array : ");
		for(int val : mergeArr) { System.out.print(val + " "); }
	}
}
