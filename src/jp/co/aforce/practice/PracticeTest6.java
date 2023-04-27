package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String arg[]) {
		Random random = new Random();
		int Random = random.nextInt(10);
		switch(Random) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;	
		case 3:
			System.out.println("大吉です");
			break;
		default :
			System.out.println("凶です");
			break;
		}
		
		
			for(int i = 1; i <= 100; i++) {
				if(i % 7 == 0) {
					System.out.print(i + ",");
					continue;
				}
				
			}
			
			
			for ( int s = 1; s <= 9; s ++ ) {
				for ( int j = 1; j <= 9; j ++ ) {
				
					int m = s * j;
					System.out.print(" ");

					if ( 10 > m ) 
						System.out.print( " " );

					System.out.print( m );
				}
				System.out.println();
			}
		}
}
				

