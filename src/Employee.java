public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;

    private static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
//        setSalary(salary);
//        if (salary < 0) {
//            throw new IllegalArgumentException("Значение зарплаты должно быть положительным.");
//        }
//        setDepartment(department);
//        if (department < 0 || department > 5) {
//            throw new IllegalArgumentException("Значение департамента должно быть от 1 до 5");
//        }
    }

    public int getId() {
        return id;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Значение департамента должно быть от 1 до 5");
        }
        this.department = department;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Значение зарплаты должно быть положительным.");
        }
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ФИО: " + fullName +
                ". Отдел: " + department +
                ". Зарплата: " + salary +
                " рублей. ID: " + id;
    }
}
