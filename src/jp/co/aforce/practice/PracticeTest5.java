package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String args[]) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");
		
		String dog;
		dog = "犬";
		
		if(dog.contains("犬")) {
			System.out.println(dog + "はリストに含まれています");
		} else {
			System.out.println(dog + "はリストに含まれていません");
		}
		
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH);
			
			switch(month) {
			case 1:
				System.out.println("冬物セール");
				break;
			case 2:
				System.out.println("春物を売る");
				break;
			case 3:
				System.out.println("春物を売る");
				break;
			case 4:
				System.out.println("春物を売る");
				break;	
			case 5:
				System.out.println("春物セール");
				break;
			case 6:
				System.out.println("夏物を売る");
				break;	
			case 7:
				System.out.println("夏物を売る");
				break;
			case 8:
				System.out.println("夏物セール");
				break;	
			case 9:
				System.out.println("秋物を売る");
				break;	
			case 10:
				System.out.println("冬物を売る");
				break;
			case 11:
				System.out.println("冬物を売る");
				break;
			case 12:
				System.out.println("冬物を売る");
				break;
			default :
				System.out.println("不正な月");
				break;
				
			}
	}

}
