package Recursividade;

import Util.Util;

public class L10E8 {
	public static void main(String[] args) {
		int num = 123;
		
		System.out.println("Antes: "+num);
		
		num = Util.inverteNum(num,"");
		
		System.out.println("Depois: "+num);
	}
}
