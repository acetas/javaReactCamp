package intro;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu ="Ýnternet Þubesi";
		
		System.out.println(internetSubeButonu);
		
		String mesaj = "Bugün hava çok güzel.";
		String mesaj2 = " Hey!";
		System.out.println(mesaj.concat(mesaj2));
		System.out.println(mesaj.length());
		System.out.println(mesaj.charAt(6));
		System.out.println(mesaj.startsWith("b"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('e'));
		
		
		int number = 25;
		int remainder = 25 % 2;
		System.out.println(remainder);
				
	}
	
	
}