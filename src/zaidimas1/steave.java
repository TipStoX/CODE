package zaidimas1;

import java.util.Scanner;

public class steave {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ar jus turite geleziniu bluoku ?");
		String klausimas;
		klausimas = input.next();

		if (klausimas.equalsIgnoreCase("taip")) {

			System.out.println("Vienas gelezinis blokas sveria 7874 kg");
			System.out.print("Iveskite gelezini bloku skaiciu: ");

			int IronStone = input.nextInt();
			int ONEstone = IronStone * 9;
			int none = 7874 / 9;
			int stone = ONEstone * 7874;
			int allstone = IronStone * 9;

			System.out.println("vienas glezis  sveria: " + none + " kg");
			System.out.println("jus turite: " + allstone + " gelezes");
			System.out.println("Jus turit: " + stone + " kg gelezes" + " savo inventoriuje");
			System.out.println("Ar jus turite gelezinius sarvus : ");

			klausimas = input.next();

			if (klausimas.equalsIgnoreCase("taip")) {
				int vs = stone * 21;
				System.out.println("tada jus turite " + vs + " kg");
			}
			if (klausimas.equalsIgnoreCase("ne")) {
				int ne = stone;
				System.out.println("tada jus turite: " + ne + " kg" + "savo invetoriuje");
			}
		}

		if (klausimas.equalsIgnoreCase("ne")) {

			int none1 = 7874 / 9;

			System.out.println("vienas glezis  sveria: " + none1 + " kg");
			System.out.println("Kiek jus turite gelezes? : ");

			int Vstone = input.nextInt();
			int viskas = Vstone * 7874;

			System.out.println("jus turite: " + viskas + " kg gelezes");
			System.out.println("Ar jus turite gelezinius sarvus : ");

			klausimas = input.next();

			if (klausimas.equalsIgnoreCase("taip")) {
				int viskasS = viskas * 21;
				System.out.println("tada jus turite " + viskasS + " kg gelezes savo inventuriuje");
			}
			if (klausimas.equalsIgnoreCase("ne")) {
				int ne2 = viskas;
				System.out.println("tada jus turite: " + ne2 + " kg gelezes" + " savo invetoriuje");
			}
		}
	}
}
