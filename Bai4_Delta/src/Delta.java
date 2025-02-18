/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble(); 
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Delta = %.2f\n", delta);
        if (delta >= 0) {
            double CanDelta = Math.sqrt(delta);
            System.out.printf("Căn delta = %.2f\n", CanDelta);
        } else {
            System.out.println("Delta âm, Phương trình vô nghiệm.");
        }       
        scanner.close();
	}

}
