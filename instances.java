import java.util.Scanner;
 public class apples {
		public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		nutella bread = new nutella();
		System.out.println("Enter name of first bf here: ");
		String temp = input.nextLine();
		bread.setName(temp);
		bread.saying();
		}
	}
