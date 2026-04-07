package Hw4;
//• 有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class Hw4_3 {
	public static void main(String[] args) {
		
		//先建立陣列、count
		String[] planets = {"mercury", "venus", "earth", "mars","jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		int i = 0;
		
		//第一層for跑每個單字
		for(i = 0; i < planets.length; i++) {
		
		//第二層for跑每個字母
			String word = planets[i];
			
			for(int j = 0; j < word.length(); j++) {
				
				char c = word.charAt(j); //拿出每個字元
					
					if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						count++; //判斷是不是母音
					}
			}
		}
		
		System.out.println(count);
	}	
}