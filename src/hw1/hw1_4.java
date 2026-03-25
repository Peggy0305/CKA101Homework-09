package hw1;
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//圓面積公式(A) = 半徑 * 半徑 * 3.1415
//圓周長公式(B) = 2 * 半徑 * 3.1415
public class hw1_4 {
    public static void main(String[] args) {
    	double pie = 3.1415;
    	double A = 5 * 5 * pie;
    	double B = 2 * 5 * pie;
    		
    	System.out.println("圓面積" + A);
    	System.out.println("圓周長" + B);
    }
}
