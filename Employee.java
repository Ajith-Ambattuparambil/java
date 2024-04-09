import java.util.Scanner;
class Employee {
    private int eNo;
    private String eName;
    private double eSalary;
    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    public void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: $" + eSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Employee Salary: $");
            double eSalary = scanner.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("\nEnter the employee number to search: ");
        int searchNo = scanner.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.eNo == searchNo) {
                System.out.println("\nEmployee found:");
                emp.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nEmployee with eNo " + searchNo + " not found.");
        }
    }
}
