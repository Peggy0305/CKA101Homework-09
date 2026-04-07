package hw1;
//• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class Hw1_6 {
    public static void main(String[] args) {
    	// 5 + 5 => int + int = 數學加法
    	// 結果 = 10
    	System.out.println(5 + 5);
    	
    	// 5 + '5' => int + char 
    	// '5' 在Java中是ASCII字元，值為53
    	// 所以5 + 53 = 58
    	System.out.println(5 + '5');
    	
    	// 5 + "5" => int + String 
    	// String代表串接
        // 所以5 +"5" = 55
    	System.out.println(5 + '5');
    	
    }
}
