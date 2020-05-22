package array;
/*package whatever //do not write package name here */

import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

class FirstRepeatingElement {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int result = -1;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			List<Integer> lst = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
					lst.add(arr[i]);
				}else {
					map.put(arr[i], 1);
				}
			}
			for(int i=0; i<n; i++) {
				if(lst.contains(arr[i])) {
					result = i+1;
					break;
				}
			}
			System.out.print(result);
		}
	}
}