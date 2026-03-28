package hw2;

public class Hw2_5 {
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//	04 14 24 34 44 40-49 >>　X4 && 4X	
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 49; i++) {
			int n = i % 10; //個位數是否為4 4x
			int m = i / 10; //十位數是否為4 x4
			
			if(n != 4 && m != 4) {
				System.out.print(i + " ");
				count++;
			}
			
		}
		
		System.out.println();
		System.out.println("總共有" + count + "個");
	}
}	
