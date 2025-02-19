/**
 * 
 */
package ntu.duongngoclenh;

import java.util.Scanner;

/**
 * 
 */
public class CTTinhTong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("CT Tinh tong \n");
		//chuan bi cho viec nhap
		Scanner banPhim = new Scanner(System.in);
		//Yeu cau nhap a
		System.out.println("Moi nhap a:");
		double a = banPhim.nextDouble();
		System.out.println("Moi nhap b:");
		double b = banPhim.nextDouble();
		//Tinh toan
		double tong = a + b;
		System.out.print("Tong la:");
		System.out.print(tong);
	}
}
