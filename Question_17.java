import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_17 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		System.out.println("enter 10 values:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print("enter value " + i + ":");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("enter a new value : ");
		int val = Integer.parseInt(br.readLine());
		int equal = 0, greater = 0, smaller = 0;
		for(int i : arr) {
			if(val==i)
				equal++;
			else if(val>i)
				smaller++;
			else
				greater++;
		}
		System.out.println("Equal numbers : " + equal);
		System.out.println("greater numbers : " + greater);
		System.out.println("smaller numbers : " + smaller);
	}
}
