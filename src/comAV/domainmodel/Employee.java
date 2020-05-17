package comAV.domainmodel;
// Телескопические конструкторы статический и нестатический инициализатор
public class Employee {
    private static int id ;
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    private String department;
    static {
        id = 50;
        System.out.println("static init block");
    }
    {
        department = "proger";
        System.out.println("Non-static init block");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String position, int salary) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("Конструктор с 3 параметрами");
    }

    public Employee(String name, String position, int salary, String department) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;

        this.department = department;
        System.out.println("Конструктор с 4 параметрами");
    }

    public Employee(String name, String position) {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
