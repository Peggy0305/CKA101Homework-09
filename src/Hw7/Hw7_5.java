package Hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_5 {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\Object.ser");
	
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
		while(true) {
			// 用 Pet 介面實現多型操作
			Pet pet = (Pet)ois.readObject();
			pet.speak();
//			((Dog)ois.readObject()).speak();
//			((Cat)ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢!");
		}
		ois.close();
		fis.close();

	}
}
