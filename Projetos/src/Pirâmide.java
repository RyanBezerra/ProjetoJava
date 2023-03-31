public class Pirâmide {

	public static void main(String[] args) {
		String[] piramide = "98 12 31 09 21 20 77 65 10 11".split(" ");

        for (int a = 0, c = 0; a < (piramide.length / 2); a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(piramide[c++] + " ");
            }
            System.out.print("\n");
        }
	}
}
