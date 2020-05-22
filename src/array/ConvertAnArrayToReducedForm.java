package array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ConvertAnArrayToReducedForm {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int T = sc.nextInt(); List<Integer[]>
		 * result = new ArrayList<Integer[]>(); for(int k = 0; k< T; k++) {
		 * 
		 * int n = sc.nextInt(); Integer[] arr = new Integer[n]; for(int i=0; i<n; i++)
		 * { arr[i] = sc.nextInt(); } List<Integer> lst = Arrays.asList(arr);
		 * List<Integer> tempLst = new ArrayList<Integer>(lst);
		 * Collections.sort(tempLst);
		 * 
		 * Integer[] newArr = new Integer[n]; for(int i=0; i<n; i++) { newArr[i] =
		 * tempLst.indexOf(lst.get(i)); } result.add(newArr); } sc.close();
		 * 
		 * for(Integer[] ss : result) { for(int i = 0; i<ss.length; i++) {
		 * System.out.print(ss[i]+" "); } System.out.println(); }
		 */
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int arr[] = new int[n];
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				map.put(arr[i], i);
			}
			System.out.println(map);
			int k = 0;
			for (int x : map.keySet()) {
				int index = map.get(x);
				arr[index] = k;
				k++;
			}

			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
	}
}
