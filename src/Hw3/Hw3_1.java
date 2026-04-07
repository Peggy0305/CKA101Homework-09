package Hw3;
//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形

import java.util.Scanner;

public class Hw3_1{

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); //建立Scanner物件
			System.out.println("請輸入三個數字(數字間空格): ");

			int a = sc.nextInt();			   	 //讀取使用者輸入的數
			System.out.println("第一個數字: " + a); 
			
			int b = sc.nextInt();
			System.out.println("第二個數字: " + b); 
			
			int c = sc.nextInt();
			System.out.println("第三個數字: " + c); 
			

			if (a + b > c && a + c > b && b + c > a) { // 判斷是否為三角形:兩邊和>第三邊
				if (a == b && b == c && a == c) { // 判斷是否為正三角形
					System.out.println("正三角形");
				} 
				else if (a == b || b == c || a == c) { // 判斷是否為等腰三角型
					System.out.println("等腰三角形 ");
				} 
				else {
					System.out.println("其他三角形 "); // 判斷是否為其他三角型
				}
			} 
			else {
				System.out.println("不是三角形 ");
			}
	}

}
