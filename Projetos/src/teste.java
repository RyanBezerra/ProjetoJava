import java.util.Random;

public class teste {

    public static void main(String[] args) {
    	
    	Random gerador = new Random();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(100));
        }
    	
		String[] piramide = "51 98 12 31 09 21 20 77 65 54".split(" ");
		
        for (int a = 0, c = 0; a < (piramide.length / 2); a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(piramide[c++] + " ");
            }
            System.out.print("\n");
        }
    }

}
