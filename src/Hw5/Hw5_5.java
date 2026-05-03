package Hw5;

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,
//請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,
//此驗證碼內容包含了英文大小寫
//與數字的亂數組合,如圖:

public class Hw5_5 {
	public static String genAuthCode() {

		// 將所有合法字元存成字串
		String str = "";
		for (char c = 'A'; c <= 'Z'; c++)
			str += c;
		for (char c = 'a'; c <= 'z'; c++)
			str += c;
		for (char c = '0'; c <= '9'; c++)
			str += c;

		// 從 str 字串隨機抽取8個字元存為驗證碼
		String code = "";
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * str.length()); 	
			code += str.charAt(index);							
		}

		return code;
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:" + genAuthCode());
	}
	

}
