import java.util.Scanner;

public class hadiahPraktikumPBO3_Lingkaran{
		static double pi=3.14;
		public static void main (String[] arg){
			Scanner input = new Scanner (System.in);
			double jari,luas;
			System.out.print("Jari-jari lingkaran = ");
			jari=input.nextDouble();
			luas=pi*jari*jari;
			System.out.println();
			System.out.println("Luas = " +pi+ " x "+jari+" x " +jari);
			System.out.println("Luas Lingkaran = "+luas);
		}
}