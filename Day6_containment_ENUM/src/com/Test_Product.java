package com;
import java.util.Scanner;

public class Test_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter prid , name , dom , cate ");
		
		int prid = sc.nextInt();
		String pName=sc.next();
		System.out.println(" d m y");
		Date dom=new Date(sc.nextInt(), sc.nextInt() , sc.nextInt());
		String prdCate = sc.next();
		
		Product prd = new Product(prid ,pName ,dom, prdCate);
		System.out.println(prd);
	}

}
