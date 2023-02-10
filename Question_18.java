import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question_18
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1[][], arr2[][];
		System.out.print("enter row & col number : ");
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		System.out.println("enter values of 1st matrix : ");
		arr1 = new int[r][c];
		arr2 = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				arr1[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("enter values for 2nd matrix : ");
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				arr2[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("1st matrix : ");
		for(int i[] : arr1) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix : ");
		for(int i[] : arr2) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int addArr[][] = new int[r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				addArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("addition of two matrices : ");
		for(int i[] : addArr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int s = 0;
		for(int i[] : arr1) {
			for(int j : i) {
				s = s + j;
			}
		}
		System.out.print("Summation of two matrix : " + s);
		
		System.out.println("transpose of 1st matrix : ");
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				System.out.print(arr1[j][i] + " ");
			}
			System.out.println();
		}
	}
}
