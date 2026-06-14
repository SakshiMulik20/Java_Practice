package com.list;

import java.util.Scanner;

import com.myutil.NamesUtil;

import java.util.ArrayList;

public class Menudriven_ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		ArrayList<String> names =new ArrayList<String>();

		System.out.println("1.Add names 2.Display elemnts 3.Search element 4.Show all names ");
		ArrayList<String> names = NamesUtil.getALlNames();
		int ch;

		do {
			System.out.println("Enter choice ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;

			}

		} while (ch != 0);
	}

}
