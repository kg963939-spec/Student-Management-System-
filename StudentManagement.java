import java.util.*;

class StudentManagement {

    Scanner sc = new Scanner(System.in);

    int studentId;
    String studentName;
    String course;
    String branch;
    double marks;

    void menu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Exit");
    }

    void addStudent() {

        System.out.println("Enter Student ID : ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name : ");
        studentName = sc.nextLine();

        System.out.println("Enter Course : ");
        course = sc.nextLine();

        System.out.println("Enter Branch : ");
        branch = sc.nextLine();

        System.out.println("Enter Marks : ");
        marks = sc.nextDouble();

        System.out.println("Student Added Successfully");
    }

    void viewStudent() {

        System.out.println("\n===== Student Details =====");

        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course : " + course);
        System.out.println("Branch : " + branch);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {

        StudentManagement obj = new StudentManagement();

        int choice;

        do {

            obj.menu();

            System.out.println("Enter Choice : ");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addStudent();
                    break;

                case 2:
                    obj.viewStudent();
                    break;

                case 3:
                    System.out.println("Thanks for using Student Management System");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);
    }
}