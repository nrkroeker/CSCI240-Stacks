// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.menu();
	}

	public void menu() {
		System.out.println("\nStacks upon Stacks\n\n1. Load students from file \n2. Print stack \n3. Exit program \nEnter your selection: ");
		Scanner scan = new Scanner(System.in);
		int menuInput = scan.nextInt();

		if (menuInput == 1) {
			System.out.println("Students loaded from file!");
			readFile();
		} else if (menuInput == 2) {

		} else if (menuInput == 3) {
			System.out.println("Now exiting...");
		} else {
			System.out.println("Please enter valid input");
		}
	}

	public void readFile() {
		String line = "";

		try {
			InputStream inputStream = new FileInputStream("students.txt");

			InputStreamReader reader = new InputStreamReader(inputStream);

			BufferedReader buffer = new BufferedReader(reader);

			while(line != null) {
				line = buffer.readLine();
				System.out.println(line);
			}


			buffer.close();
		}
		catch (IOException ex) {
			System.err.println(ex);
		}

	}
}
