package Hw5;

public class Hw5_2 {
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中
//	取平均值並印出這10個亂數與平均值,如圖:
	public static void randAvg() {
		
		int[] r = new int[10];
		int sum = 0;
		
		for (int i = 0; i < r.length; i++) {
			r[i] = (int)(Math.random()* 101);
			sum += r[i];
		}
		
		System.out.print("本次亂數結果：");
		
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		
		System.out.println();
		
		double avg = (double)sum / r.length;
		
		System.out.print("平均值：" + avg);
		
	}

	public static void main(String[] args) {
		randAvg();
	}
}
