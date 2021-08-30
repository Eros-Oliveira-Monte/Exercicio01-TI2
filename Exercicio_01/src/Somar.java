import java.util.*;

class Somar {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int somar, num1, num2;
		
		System.out.print("Digite um número: ");
		num1 = scan.nextInt();
		System.out.print("Digite outro número: ");
		num2 = scan.nextInt();
		
		somar = num1 + num2;
		
		System.out.println("Soma: " + somar);
	}
	
}
