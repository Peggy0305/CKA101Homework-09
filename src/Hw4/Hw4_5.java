package Hw4;
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
import java.util.Scanner;
public class Hw4_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入年: ");
		int year = sc.nextInt();
		
		System.out.print("請輸入月: ");
		int month = sc.nextInt();
		
		System.out.print("請輸入日: ");
		int day = sc.nextInt();
		
		boolean isLeap = false;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //4年一閏100年不閏400年再閏
			isLeap = true;
		}
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(isLeap) {
			days[1] = 29;
		}
		
		int total = 0;
		
		for(int i = 0; i < month - 1; i++) {
			total = total + days[i];
		}
		
		total = total + day;
		
		System.out.println("這一天是今年第 " + total + " 天");
		
		sc.close();
		
	}
}
