package Hw4;
//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)
public class Hw4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] charArray = new char[s.length()]; //字元陣列
		
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = s.charAt(i); //拿出第i個字元，放進陣列
		}
		
		for(int n = charArray.length - 1 ; n >= 0; n--) {
			System.out.print(charArray[n]);
		}
	}
}
