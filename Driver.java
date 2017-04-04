// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {
	// Create global stack
	public Stack<Student> stack = new Stack<Student>(10);

	public static void main(String[] args) {
		// Instantiate driver and begin menu
		Driver driver = new Driver();
		driver.menu();
	}

	public void menu() {
		int menuInput = 0;

		// Print out menu and options
		System.out.println("\nStacks upon Stacks\n\n");

		while(menuInput != 3) {
			System.out.println("1. Load students from file \n2. Print stack \n3. Exit program \nEnter your selection: ");

			// Receive input
			Scanner scan = new Scanner(System.in);
			menuInput = scan.nextInt();

			// Check chosen menu input
			if (menuInput == 1) {
				readFile();
			} else if (menuInput == 2) {
				printStack();
			} else if (menuInput == 3) {
				System.out.println("\nNow exiting...");
			} else {
				System.out.println("\n\nPlease enter valid input\n\n");
			}
		}
	}

	public void readFile() {
		// Declare variables
		String line = "";
		String delims = "[,]";
		String[] studentInfo;

		try {
			// Read in the file
			InputStream inputStream = new FileInputStream("students.txt");

			InputStreamReader reader = new InputStreamReader(inputStream);

			BufferedReader buffer = new BufferedReader(reader);
			buffer.readLine();

			// Check each line and make student option
 			while(line != null) {
					line = buffer.readLine();
					if (line != null) {
						studentInfo = line.split(delims);

						Address address = new Address(studentInfo[2], studentInfo[3], studentInfo[4], studentInfo[5], studentInfo[6]);

						Student student = new Student(studentInfo[0], studentInfo[1], address, studentInfo[7], studentInfo[8]);

						// Push student to the stack
						stack.push(student);
					}
				}
				buffer.close();
			// Check for errors
			} catch (IOException ex) {
			System.err.println(ex);
			}

			System.out.println("\nStudents loaded from file!\n\n");
	}

	public void printStack() {
		// Declare new empty student
		Student poppedStudent = new Student();
		System.out.println("\n");

		// Until stack is empty...
		while (!stack.isEmpty()) {
			// Pop student off of stack
			String infoLine;
			poppedStudent = (Student)stack.pop();
			Address poppedAddress = poppedStudent.getAddress();

			// Make line of all parts of student
			infoLine = "ID: " + poppedStudent.getStudentId() + "\tName: " + poppedStudent.getFirstName() + " " + poppedStudent.getLastName() + "\tAddress: " + poppedAddress.getAddressLineOne() + " ";
			if(poppedAddress.getAddressLineTwo() != "") {
				infoLine += poppedAddress.getAddressLineTwo() + " ";
			}
			infoLine += poppedAddress.getCity() + ", " + poppedAddress.getState() + " " + poppedAddress.getZipCode() + "\tGPA: " + poppedStudent.getGpa();

			// Print student line
			System.out.println(infoLine);
		}
	}
}
