import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nim : 10116430 
 * Nama : Wisnu Bayu Aji 
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double diameter = 0; 
        double phi = 3.14;
        
        try {
            
            System.out.println("=====Perhitungan Lingkaran=====");
            
                System.out.print("Masukan nilai diameter lingkaran : ");
                diameter = sc.nextDouble();
                System.out.println("");
                System.out.println("Jari-jari Lingkaran = " + (diameter / 2) + "cm");
                System.out.println("Luas Lingkaran = " + (phi * (diameter / 2) * (diameter / 2)) + "cm");
                System.out.println("Keliling Lingkaran = " + (phi * diameter) + "cm");
            } catch (Exception e) {
            //TODO: handle exception                
        }

    }
}
