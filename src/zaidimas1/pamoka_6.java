package zaidimas1;

import java.util.Scanner;

public class pamoka_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("iveskite 5 skaicius");
		
		int[] ms = new int[5];

		ms[0] = input.nextInt();  
		ms[1] = input.nextInt();
		ms[2] = input.nextInt();
		ms[3] = input.nextInt();
		ms[4] = input.nextInt();

		int suma = ms[0] + ms[1] + ms[2] + ms[3] + ms[4];

		System.out.println("suma yra: " + suma);
 
	}

}
