package ProblemOnSticks;
import java.util.*;
import java.math.*;
public class Main {
//CORRECT 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = in.nextInt();
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0;i<n;i++) {
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
			}
			Arrays.sort(a);
			if(a[0] == 0) {
				System.out.println(map.values().size()-1);
			}else {
			System.out.println(map.values().size());
			}
		}
	}
	

}
