package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minCost {

	  public static int minWire(List<Integer> a) {
	        int n = a.size();
	        int[] left = new int[n];
	        int[] right = new int[n];

	        // Calculating the nearest opposite bit to the left of each element
	        int nearestOppositeLeft = -1;
	        for (int i = 0; i < n; i++) {
	            if (a.get(i) == 1) {
	                nearestOppositeLeft = i;
	            }
	            left[i] = i - nearestOppositeLeft;
	        }

	        // Calculating the nearest opposite bit to the right of each element
	        int nearestOppositeRight = n;
	        for (int i = n - 1; i >= 0; i--) {
	            if (a.get(i) == 1) {
	                nearestOppositeRight = i;
	            }
	            right[i] = nearestOppositeRight - i;
	        }

	        int cost = 0;
	        for (int i = 0; i < n; i++) {
	            if (a.get(i) == 0) {
	                if (left[i] == n || right[i] == n) {
	                    // It's not possible to set all bits to 1
	                    return -1;
	                }
	                cost += Math.min(left[i], right[i]);
	            }
	        }

	        return cost;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        List<Integer> A = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            A.add(scanner.nextInt());
	        }
	        int result = minWire(A);
	        System.out.println(result);
	    }
}
