package jp.co.aforce.sample;

public class SeigyoSample {
	public static void main(String[] args) {
		/*int x = 200;
		if(x < 100) {
			System.out.println("xは100より小さい");
		} else if(x < 200) {
			System.out.println("xは200より小さい");
		} else {
			System.out.println("xは200以上");
		}
		
		
		int value = 10;
		if(value == 0) {
			System.out.println("値は0です");
		} else if(value >= 1 && value <=5) {
			System.out.println("値は1以上５以下です");
		} else {
			System.out.println("値は" + value + "です");
		}
		
		
		int x = 4;
		switch(x) {
		case 1:
			System.out.println("xの値は1です");
			break;
		case 2:
			System.out.println("xの値は2です");
			break;
		default:
			System.out.println("xの値は1でも2でもないです");
		}
		

		Calendar calendar = Calendar.getInstance();
		String dayOfWeek;
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "日";
			break;
		case 2:
			dayOfWeek = "月";
			break;	
		case 3:
			dayOfWeek = "火";
			break;	
		case 4:
			dayOfWeek = "水";
			break;
		case 5:
			dayOfWeek = "木";
			break;
		case 6:
			dayOfWeek = "金";
			break;	
		default :
			dayOfWeek = "土";
			break;	
		}
		System.out.println("今日は" + dayOfWeek + "曜日です");
		
		
		int x = 1;
		int amount =0;
		
		while(amount < 100) {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		}
		System.out.println("合計は" + amount);
		
		
		int num = 1;
		while(num <= 30 ) {
			if(num % 3 == 0) {
			System.out.println(num);
		}
		num++;
		}
		
		
		int x = 1;
		int amount = 0;
		
		do {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		}while(amount < 4);
		System.out.println("合計は" + amount);
		
		
		int num = 1;
		
		do {
			if(num % 2 == 0) {
			System.out.println(num);
			}	
			num++;
		}while(num < 10 && num >= 2 );
		
		-------------------------------
		
		int number = 2;
		do {
			System.out.println(number);
			number += 2;
		}while(number < 10);
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("手順Qの実行:" + i + "回目");
		}
		
		
		for(int i = 1; i < 10; i++) {
			System.out.println("4×" + i + "=" + (4 * i));
		}
		
		
		String[] fruits = new String[3];
		fruits[0] = "りんご";
		fruits[1] = "オレンジ";
		fruits[2] = "ブドウ";
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println(fruits.length);
		
		
		String[] x = new String[7];
		x[0] = "日";
		x[1] = "月";
		x[2] = "火";
		x[3] = "水";
		x[4] = "木";
		x[5] = "金";
		x[6] = "土";
		
		String[] y = new String[7];
		y[0] = "sun";
		y[1] = "mon";
		y[2] = "tue";
		y[3] = "wed";
		y[4] = "thu";
		y[5] = "fri";
		y[6] = "sat";
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i] + "曜HashSet<E> + y[i] + "です");
		}
		
		
		HashSet<String> books = new HashSet<>();
		books.add("不思議の国のアリス");
		books.add("ヘンゼルとグレーテル");
		books.add("銀河鉄道の夜");
		
		for(String book: books) {
			System.out.println(book);
		}
		
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		
		int count = 0;
				while(true) {
					if(count == 5) {
						break;
					}	
					count++;
				}
				System.out.println(count);
		
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("プログラムの終了");*/
		
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	}	
	


