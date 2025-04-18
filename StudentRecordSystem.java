// StudentRecordSystem.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentRecordSystem {
    private List<Student> students;
    private Scanner scanner;

    public StudentRecordSystem() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("\nStudent Record System Menu:");
        System.out.println("1. Add New Student Record");
        System.out.println("2. Display All Student Records");
        System.out.println("3. Search Student Record");
        System.out.println("4. Update Student Record");
        System.out.println("5. Delete Student Record");
        System.out.println("6. Display Specific Student Information");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public void addStudent() {
        // ... (rest of the addStudent method)
    }

    public void displayAllStudents() {
        // ... (rest of the displayAllStudents method)
    }

    public void searchStudent() {
        // ... (rest of the searchStudent method)
    }

    public void updateStudent() {
        // ... (rest of the updateStudent method)
    }

    public void deleteStudent() {
        // ... (rest of the deleteStudent method)
    }

    public void displayStudentInfo() {
        // ... (rest of the displayStudentInfo method)
    }

    public void run() {
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    displayStudentInfo();
                    break;
                case 7:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }

    public static void main(String[] args) {
        StudentRecordSystem system = new StudentRecordSystem();
        system.run();
    }
}