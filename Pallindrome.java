package PracticeJava;

public class Pallindrome {
	
	static boolean isPallindrome(String s) {
		char[] a = s.toLowerCase().toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j]) return false;
			
			else {
				i++;
				j--;
			}
			
		}
		return true; 
	}

	public static void main(String[] args) {
		String s="Malayalam";
		System.out.println(isPallindrome(s));
		

	}

}
