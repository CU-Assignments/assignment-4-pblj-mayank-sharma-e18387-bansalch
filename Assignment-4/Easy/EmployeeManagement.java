
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Employee\n2. Update Employee\n3. Remove Employee\n4. Search Employee\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new Employee(id, name, salary));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    for (Employee emp : employees) {
                        if (emp.getId() == uid) {
                            sc.nextLine();
                            System.out.print("New Name: ");
                            emp.setName(sc.nextLine());
                            System.out.print("New Salary: ");
                            emp.setSalary(sc.nextDouble());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    employees.removeIf(emp -> emp.getId() == rid);
                    break;
                case 4:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    for (Employee emp : employees) {
                        if (emp.getId() == sid) {
                            System.out.println(emp);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
