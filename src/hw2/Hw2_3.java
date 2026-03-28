package hw2;

public class Hw2_3 {
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		while( b <= 10) {
			a *= b; 
			b++;
		}

	System.out.println(a);

    }
}
