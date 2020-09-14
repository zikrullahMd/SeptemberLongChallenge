package CoronaVirusSpread;
import java.util.*;
public class Main {
	//CORRECT
	static int getLeft(int i , int[] a,int mini) {
		int count = 0;
		for(int j = 0;j<i;j++) {
			if(a[j] > mini) {
				count++;
			}
		}
		return count;
	}
	static int getRight(int i , int[] a,int maxi) {
		int count = 0;
		for(int j = i+1;j<a.length;j++) {
			if(a[j] < maxi) {
				count++;
			}
		}
		return count;
	}
	static int getMin(int i, int[] a) {
		int min = a[i];
		for(int k = i;k<a.length;k++) {
			if(a[k] < min) {
				min = a[k];
			}
		}
		return min;
	}
	static int getMax(int i, int[] a) {
		int max = a[i];
		for(int k = 0;k<i+1;k++) {
			if(a[k] > max) {
				max = a[k];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = in.nextInt();
			ArrayList<Integer> l  = new ArrayList<>();
			for(int i = 0;i<n;i++) {
				int count;
				int mini = getMin(i,a);
				int maxi = getMax(i,a);
				count = getLeft(i,a,mini) + getRight(i,a,maxi); //  3 5 1 4 2
				
				l.add(count+1);
				
			}
			Collections.sort(l);
			System.out.println(l.get(0)+" "+l.get(l.size()-1));
		}
	}

}