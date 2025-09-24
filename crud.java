import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class CRUD {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add  2.View  3.Update  4.Delete  5.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                list.add(new Student(id, name, marks));
            } 
            else if (choice == 2) {
                for (Student s : list) System.out.println(s);
            } 
            else if (choice == 3) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt(); sc.nextLine();
                for (Student s : list) {
                    if (s.id == id) {
                        System.out.print("New Name: ");
                        s.name = sc.nextLine();
                        System.out.print("New Marks: ");
                        s.marks = sc.nextDouble();
                    }
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                list.removeIf(s -> s.id == id);
            }
        } while (choice != 5);
    }
}
