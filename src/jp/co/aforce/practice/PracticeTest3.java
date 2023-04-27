package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main (String args[]) {
		String[] bungu = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		System.out.println(bungu[1]);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("山田太郎");
		names.add("鈴木花子");
		names.add("佐藤二朗");
		names.add("山田太郎");
		names.add("高橋三郎");
		System.out.println(names.get(2));
		
	}

}
