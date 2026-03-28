package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		
//		 使用 for 迴圈 + while 迴圈
		
//		int i;
//		for(i = 1; i <= 9; i++) {
//			int j = 1;
//			while(j <= 9) {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
//				j++;
//			}
//		    System.out.println();
//		}
//	}
	

//         使用 for 迴圈 + do while 迴圈

//		int a;
//		for(a = 1; a <= 9 ; a++) {
//			int b = 1;
//			do {
//				System.out.print(a + "*" + b + "=" + a*b + "\t");
//				b++;
//			}while (b <= 9);
//			System.out.println();	
//		}
//	}			
		
//		 使用 while 迴圈 + do while 迴圈
		
		int c = 1;
		while( c <= 9) {
			int d = 1;
			do{
			   System.out.print(c + "*" + d + "=" + c*d + "\t");
			   d++;
		       } while(d <= 9);
			System.out.println();
			c++;
		}
	}
}


