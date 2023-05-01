package com.gl.skyscappers;

import java.util.*;



public class SkyScrappers {
		Stack<Integer> stack = new Stack<Integer>();
		public void floorConstruction(int n , int[] floors) {
		int currentFloor = n - 1;
		for (int i = 0; i < n; i++) {
			if (floors[i] == currentFloor + 1) {
				System.out.println("Day: " + (i + 1));
				System.out.print(floors[i]+" ");
				currentFloor--;
				while (!stack.empty() && stack.peek() == currentFloor + 1) {
					System.out.print(stack.pop()+" ");
					currentFloor--;
				}
				System.out.println();
			} else {
				System.out.println("Day: " + (i + 1));

				stack.push(floors[i]);

			}
		}
		while (!stack.empty()) {
			System.out.println();
			stack.pop();
		}
	}
}



