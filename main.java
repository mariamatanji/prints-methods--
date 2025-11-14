import java.util.Scanner;

public class Earnings {

	public static void printEarnings(String name, int salary) {
		System.out.println(name + " earns " + salary + " dollars per year.");
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

      /* Your code goes here */
      
      String name1;
      name1 = scnr.next();
      String name2;
      name2 = scnr.next();
      int salary1;
      salary1 = scnr.nextInt();
      int salary2;
      salary2 = scnr.nextInt();
      printEarnings(name1,salary1);
      printEarnings(name2,salary2);
	}
}
