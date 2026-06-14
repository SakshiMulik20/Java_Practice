package com;
import java.util.Scanner;

public class Test_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter category : oils , grains ,other");
		String cate=sc.next();
		
		Category  prdCate = Category.oils;
		System.out.println(prdCate);
		
		Category pc = Category.valueOf(cate);
		System.out.println("Category is " + pc);

	}

}
