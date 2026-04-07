package Hw4;
//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數(提示:二維陣列)

public class Hw4_6 {
	public static void main(String[] args) {
		int[][] scores = {
						 { 10, 35, 40, 100, 90, 85, 75, 70 },
				         { 37, 75, 77, 89, 64, 75, 70, 95 },
				         { 100, 70, 79, 90, 75, 70, 79, 90 },
				         { 77, 95, 70, 89, 60, 75, 85, 89 },
				         { 98, 70, 89, 90, 75, 90, 89, 90 },
				         { 90, 80, 100, 75, 50, 20, 99, 75 } 		
		};
		
		//紀錄8位同學為最高分的次數
		int[] result = new int[8];
		
		int max = 0;
		int student = 0; //紀錄最高分學生的索引值
		
		for(int i = 0; i < scores.length; i++) {
			for(int n = 0; n <scores[i].length; n++) {
				if(scores[i][n] > max) {
					max = scores[i][n];
					student = n;
				}
			}
			result[student]++;		
			max = 0;
		}
		
		for(int t = 0; t < result.length; t++) {
			System.out.println("第" + (t + 1) + "位同學的最高分次數為： " + result[t] + "次");
		}	
	}
}
