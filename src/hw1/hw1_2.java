package hw1;
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
public class hw1_2 {
    public static void main(String[] args) {
    	int egg = 200;
    	int doz = 200 / 12;		
    	int e = 200 % 12 ;
    	    
        System.out.println("共" + doz + "打" + e + "顆");
    }
}
