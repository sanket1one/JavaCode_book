package leetcode;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "IX";
		int current = 0;
		int prev = 0;
		int sum = 0;
		char[] ch = str.toCharArray();
		for(int i =0; i<ch.length; i++) {
			switch(ch[i]) {
			case 'I': current = 1;
					break;
			case 'V': current = 5;
					break;
			case 'X': current = 10;
					break;
			case 'L': current = 50;
					break;
			case 'C': current = 100;
					break;
			case 'D': current = 500;
					break;
			case 'M': current = 1000;
					break;
			}
			if(prev == 0) {
				sum = current;
			}else {
				if(current <= prev) {
					sum += current;
				}else {
					sum += current - 2*prev;
				}
			}
			prev = current;
		}
		System.out.println(sum);
		
		
	}

}
