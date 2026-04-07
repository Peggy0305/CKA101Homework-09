package Hw4;

public class Hw4_1 {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void main(String[] args) {
		
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int i;
		int sum = 0;
		
		//算總和
		for(i = 0; i < arr.length; i++) {
			sum = sum + arr[i];	
		}
//		System.out.println(sum);
		
		//算平均值
		int avg = sum / arr.length;
		System.out.println("算平均值 = " + avg);
		
		//大於平均值的元素
		for(i = 0; i <= arr.length; i++) {
			if(arr[i] > avg) {
				System.out.print(arr[i] + " ");
			}
		}	
		
	}
}		
