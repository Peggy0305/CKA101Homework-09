package hw2;
//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Hw2_7 {
    public static void main(String[] args) {
    	
    	for(char i = 'A'; i <= 'F'; i++) {
    		for(int j = 1; j <= (i - 'A' + 1); j++) {
    			System.out.print(i);
    		}
    		
    		System.out.println();
    	}	
    	
    }	
}
