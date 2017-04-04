// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {

	public Stack<Student> stack = new Stack<Student>(10);

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.menu();
	}

	public void menu() {
		int menuInput = 0;

		System.out.println("\nStacks upon Stacks\n\n");

		while(menuInput != 3) {
			System.out.println("1. Load students from file \n2. Print stack \n3. Exit program \nEnter your selection: ");
			Scanner scan = new Scanner(System.in);
			menuInput = scan.nextInt();

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
		String line = "";
		String delims = "[,]";
		String[] studentInfo;

		try {
			InputStream inputStream = new FileInputStream("students.txt");

			InputStreamReader reader = new InputStreamReader(inputStream);

			BufferedReader buffer = new BufferedReader(reader);
			buffer.readLine();
			while(line != null) {
					line = buffer.readLine();
					if (line != null) {
						studentInfo = line.split(delims);

						Address address = new Address(studentInfo[2], studentInfo[3], studentInfo[4], studentInfo[5], studentInfo[6]);

						Student student = new Student(studentInfo[0], studentInfo[1], address, studentInfo[7], studentInfo[8]);

						stack.push(student);
					}
				}
				buffer.close();

			} catch (IOException ex) {
			System.err.println(ex);
			}

			System.out.println("\nStudents loaded from file!\n\n");
	}

	public void printStack() {
		Student poppedStudent = new Student();
		System.out.println("\n");

		while (!stack.isEmpty()) {
			String infoLine;
			poppedStudent = (Student)stack.pop();
			Address poppedAddress = poppedStudent.getAddress();

			infoLine = "ID: " + poppedStudent.getStudentId() + "\tName: " + poppedStudent.getFirstName() + " " + poppedStudent.getLastName() + "\tAddress: " + poppedAddress.getAddressLineOne() + " ";
			if(poppedAddress.getAddressLineTwo() != "") {
				infoLine += poppedAddress.getAddressLineTwo() + " ";
			}
			infoLine += poppedAddress.getCity() + ", " + poppedAddress.getState() + " " + poppedAddress.getZipCode() + "\tGPA: " + poppedStudent.getGpa();
			System.out.println(infoLine);
		}
	}
}
