import java.util.scanner


public class Calc{
	public static void main(String args[]){
		scanner sc = new scanner(System.in);
		System.out.println("Enter the two values");
		System.out.println("Enter the first double number:");
		double num1 = sc.nextDouble();
		System.out.println("Enter the Second double number:");
		double num2 = sc.nextDouble();

		boolean exit = false;
		while(!exit) {
			System.out.println("Choose the operation to perform "
					+ "1. add"
					+ "0. exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("the addition of two number"+ num1 +" "+ num2 +" is "+ (num1 + num2));
				break;
			case 0:
				exit = true
				break;

			}
		}

}

}
