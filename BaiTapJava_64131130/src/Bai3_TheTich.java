/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhập cạnh: ");
        double canh = scanner.nextDouble();
        double TheTich1 = canh * canh *canh;
        double TheTich2 = Math.pow(canh,3);
        System.out.printf("Thể tích 1: %.2f\n", TheTich1);
        System.out.printf("Thể tích 2: %.2f\n", TheTich2);
        
        scanner.close();
	}

}
