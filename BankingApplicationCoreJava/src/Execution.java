import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer Id: ");
		int cid = sc.nextInt();
		System.out.println("Enter customer name: ");
		String cname = sc.next();
		Account ac = new Account(cid, cname); // constructor of account class
		ac.showMenu(); // showMenu() method
		sc.close();

	}

}
