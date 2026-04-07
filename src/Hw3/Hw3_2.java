package Hw3;
//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//猜錯會顯示錯誤訊息，猜對則顯示正確訊息

import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*10);
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int data = sc.nextInt();
			
			if(data == i) {
				System.out.println("答對了！");
				break;
			}
			else
				System.out.println("猜錯囉");
		}
	}

}
