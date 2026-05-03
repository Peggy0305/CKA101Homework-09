package Hw6;

public class Calculator {

	public static int powerXY(int x, int y) throws CalException{
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，如果回傳不為整數!");
		} else {
			int result = (int) Math.pow(x, y);
			return result;
		}
	}

}
