package com.gl.skyscappers;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building: ");
		int n = sc.nextInt();
		int[] floors = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1) + ":");
			floors[i] = sc.nextInt();
		}
		sc.close();
		SkyScrappers ss = new SkyScrappers();
		ss.floorConstruction(n,floors);

	}
}
