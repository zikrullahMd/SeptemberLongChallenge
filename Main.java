package ChefinaAndSwap2;
import java.util.*;
import java.math.*;
public class Main {
	//                                       Semi Correct
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			int temp = 1;
			for(int i = 0;i<n;i++) {
				a[i] = temp;
				temp++;
			}
			int sum = n*(n+1)/2;
			int count = 0;
			int sumHalf = sum/2;
			if(sum % 2 == 1) {
				System.out.println(0);
				continue;
			}else {
				int suml = 0;
				int i = n-1;
				while(suml <= sumHalf) {
					if(suml==sumHalf) {
						count+= (i*(i+1)/2) + count * (count-1)/2;
						suml += a[i];
						i--;
						continue;
					}
					suml += a[i];
					i--;
					count++;
				}
				
			}
			System.out.println(count);
		}
	}

}
