package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Hw1_3 {
    public static void main(String[] args) {
    	int total = 256559;
    	int day = total / (24 * 60 * 60);
    	int hr = total % (24 * 60 * 60) / 3600;
    	int min = (total % 3600) / 60;
    	int sec = total % 60;
    	
    	System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");
    	
    }
}
