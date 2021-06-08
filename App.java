import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int panjang,lebar,tinggi,luas,volume,a,b,c;
        char yn;

        do{

            System.out.println("Program menghitung volume dan luas balok");
            System.out.println("========================================");

            System.out.print("Input panjang : ");
            panjang = masukan.nextInt();
            a = panjang;
            System.out.println("Panjang : "+  a  + "\n");

            System.out.print("Input lebar : ");
            lebar = masukan.nextInt();
            b = lebar;
            System.out.println("Lebar : "+  b  + "\n");

            System.out.print("Input tinggi : ");
            tinggi = masukan.nextInt();
            c = tinggi;
            System.out.println("Tinggi : "+  c  + "\n");
            
            System.out.println("Rumus luas : (2*a*b)+(2*a*c)+(2*b*c)");
            System.out.println("Rumus luas : (2*" + a + "*" + b + ")" + "+" + "(2*" + a + "*" + c + ")" + "+" + "(2*" + b + "*" + c + ")");
            luas = (2*a*b)+(2*a*c)+(2*b*c); 
            System.out.println("Luas : "+  luas  + " m^2" + "\n");

            System.out.println("Rumus volume : a*b*c");
            System.out.println("Rumus volume : " + a + "*" + b + "*" + c);
            volume = a*b*c; 
            System.out.println("Volume : "+  volume  + " m^3" + "\n");

            System.out.print("Ulangi perhitungan ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();
    }
}