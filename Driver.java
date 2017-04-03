// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.menu();
	}

	public void menu() {
		Stack<Student> fullStack = new Stack<Student>(10);
		int menuInput = 0;

		while(menuInput != 3) {
			System.out.println("\nStacks upon Stacks\n\n1. Load students from file \n2. Print stack \n3. Exit program \nEnter your selection: ");
			Scanner scan = new Scanner(System.in);
			menuInput = scan.nextInt();

			if (menuInput == 1) {
				fullStack = readFile();
			} else if (menuInput == 2) {
				printStack(fullStack);
			} else if (menuInput == 3) {
				System.out.println("Now exiting...");
			} else {
				System.out.println("Please enter valid input");
			}
		}
	}

	public Stack readFile() {
		String line = "";
		String delims = "[,]";
		String[] studentInfo;
		Stack<Student> stack = new Stack<Student>(10);

		try {
			InputStream inputStream = new FileInputStream("students.txt");

			InputStreamReader reader = new InputStreamReader(inputStream);

			BufferedReader buffer = new BufferedReader(reader);

			while(line != null) {
					line = buffer.readLine();
					studentInfo = line.split(delims);

					Address address = new Address(studentInfo[2], studentInfo[3], studentInfo[4], studentInfo[5], studentInfo[6]);

					Student student = new Student(studentInfo[0], studentInfo[1], address, studentInfo[7], studentInfo[8]);
					if (student.getFirstName() != "FirstName") {
						stack.push(student);
					} else {
						System.out.println("I'm skipping the first line of the file");
					}
				}
				buffer.close();

			} catch (IOException ex) {
			System.err.println(ex);
			}

			System.out.println("Students loaded from file!");

		return stack;
	}

	public void printStack(Stack stack) {
		Student poppedStudent = new Student();
		//
		// while (poppedStudent != null) {
		// 	String infoLine;
		// 	poppedStudent = stack.pop();
		// 	Address poppedAddress = poppedStudent.getAddress();
		//
		// 	infoLine = "ID: " + poppedStudent.getStudentId() + "          Name: " + poppedStudent.getFirstName() + " " + poppedStudent.getLastName() + "          Address: " + poppedAddress.getAddressLineOne() + " ";
		// 	if(poppedAddress.getAddressLineTwo() != "") {
		// 		infoLine += poppedAddress.getAddressLineTwo();
		// 	}
		// 	infoLine += " " + poppedAddress.getCity() + ", " + poppedAddress.getState() + " " + poppedAddress.getZipCode() + "          GPA: " + poppedStudent.getGpa();
		// 	System.out.println(infoLine);
		// }
	}
}
