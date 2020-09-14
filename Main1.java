package AdaMatrix;
import java.util.*;
import java.math.*;
public class Main1 {
//CORRECT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0;i<n;i++) 
			{
				for(int j = 0;j<n;j++) 
				{
					a[i][j] = in.nextInt();
				}
			}
			int l;
			int count = 0;
			int ans = 0;
			for(l = n-1 ;l>=0;l--) 
			{
				for(int j=l;j>=0;j--)
				{
				   if(a[l][j] != (l*n)+j+1)
				   {
					   a = trans(a,l);
					   count++;
					   break;
					}
				}
			}
			System.out.println(count);
		}
	}
	static int[][] trans(int a[][] , int l){
		int[][] trans = new int[l][l];
		for(int i = 0;i<l;i++) 
		{
			for(int j = 0;j<l;j++) 
			{
				trans[i][j] = a[j][i];
			}
		}
		return trans;
	}
}