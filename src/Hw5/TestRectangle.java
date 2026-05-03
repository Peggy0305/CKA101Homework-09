package Hw5;

public class TestRectangle {

	 public static void main(String[] args) {

		 	// 第一題：空建構子
	        MyRectangle r1 = new MyRectangle();

	        r1.setWidth(10);
	        r1.setDepth(20);

	        System.out.println(r1.getArea());

	        // 第二題：有參數建構子
	        MyRectangle r2 = new MyRectangle(10, 20);

	        System.out.println(r2.getArea());
	    }
	}
