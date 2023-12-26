class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0.05 * salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public void reporting() {
        System.out.println(getName() + " is managing a team of " + teamSize + " employees.");
    }
    public double calculateBonus() {
        return 0.08 * getSalary() + 0.02 * teamSize;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(getName() + " is coding in " + programmingLanguage + ".");
    }
    public double calculateBonus() {
        return 0.1 * getSalary();
    }
}

public class BusinessScenarios {
    public static void main(String[] args) {
        Manager manager = new Manager("John Manager", 101, 80000, 10);
        Developer developer = new Developer("Alice Developer", 201, 60000, "Java");

        manager.reporting();
        developer.code();
        System.out.println("Bonus for " + manager.getName() + ": $" + manager.calculateBonus());
        System.out.println("Bonus for " + developer.getName() + ": $" + developer.calculateBonus());
    }
}
