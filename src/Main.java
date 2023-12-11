public class Main {
    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        Employee one = new Employee("Мичурин Александр Вячеславович", 1, 80_000);
        Employee two = new Employee("Козлов Максим Андреевич", 5, 60_000);
        Employee three = new Employee("Буев Дмитрий Игоревич", 4, 70_000);
        Employee four = new Employee("Шеременьтев Игорь Александрович", 3, 100_000);
        Employee five = new Employee("Дубровский Виктор Дмитриевич", 2, 40_000);
        Employee six = new Employee("Леонов Никита Андреевич", 5, 90_000);
        Employee seven = new Employee("Невский Вячеслав Олегович", 1, 85_000);
        Employee eight = new Employee("Бажанов Артем Дмитриевич", 1, 82_000);
        Employee nine = new Employee("Войнолович Юрий Владимирович", 4, 65_000);
        Employee ten = new Employee("Дубровский Владимир Анатольевич", 2, 60_000);


        employee[0] = one;
        employee[1] = two;
        employee[2] = three;
        employee[3] = four;
        employee[4] = five;
        employee[5] = six;
        employee[6] = seven;
        employee[7] = eight;
        employee[8] = nine;
        employee[9] = ten;

        printInfo();
        printSalary();
        printMinSalary();
        printMaxSalary();
        printAverageSalary();
        printFullName();
        indexingSalary(6);
        printMinDepartment(1);
        printMaxDepartment(1);
        printTotalDepartment(1);
        printAverageDepartment(1);
        indexingDepartment(1,3);
        printAllEmployees(1);
        printMinNumber(67000);
        printMaxNumber(67000);

        printNumber(9);
    }

    public static void printInfo() {
        System.out.println("Базовая сложность:\na)");
        System.out.println("Список сотрудников со всеми данными:");
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static void printSalary() {
        System.out.println("b)");
        int sum = 0;
        for (Employee value : employee) {
            sum += value.getSalary();
        }
        System.out.println("Общая сумма затрат на зарплату в месяц = " + sum + " рублей.");
    }

    public static void printMinSalary() {
        System.out.println("c)");
        int min = Integer.MAX_VALUE;
        String name = "";
        for (Employee value : employee) {
            if (value.getSalary() < min) {
                min =value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + min + " рублей. Это " + name);
    }

    public static void printMaxSalary() {
        System.out.println("d)");
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee value : employee) {
            if (value.getSalary() > max) {
                max = value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в " + max + " рублей. Это " + name);
    }

    public static void printAverageSalary() {
        System.out.println("e)");
        int sum = 0;
        int total = employee.length;
        int average = 0;
        for (Employee value : employee) {
            sum += value.getSalary();
            average = sum / total;
        }
        System.out.println("Среднее значение зарплат = " + average + " рублей.");
    }

    public static void printFullName() {
        System.out.println("f)");
        System.out.println("Ф.И.О. сотрудников");
        for (Employee value : employee) {
            System.out.println(value.getFullName());
        }
    }

    public static void indexingSalary(int percent) {
        System.out.println("Повышенная сложность:\n1)");
        int sum = 0;
        String name = "";
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getSalary();
            name = employee[i].getFullName();
            total = sum;
            total = total + (total * percent / 100);
            employee[i].setSalary(total);
            System.out.println("Зарплата сотрудника: " + name + ". При индексации зарплаты в 2% составляет: "
                    + total + " рублей.");
        }
    }

    public static void printMinDepartment(int department) {
        System.out.println("2. a)");
        int min = Integer.MAX_VALUE;
        String name = "";
        for (Employee value : employee) {
            if (value.getSalary() < min && department == value.getDepartment() && value.getDepartment() != 0) {
                min = value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + min + " рублей. В отделе №1, это " + name);
    }

    public static void printMaxDepartment(int department) {
        System.out.println("2. b)");
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee value : employee) {
            if (value.getSalary() > max && department == value.getDepartment()) {
                max =value.getSalary();
                name = value.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в " + max + " рублей. В отделе № 1, это " + name);
    }

    public static void printTotalDepartment(int department) {
        System.out.println("2. c)");
        int sum = 0;
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                sum += value.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в отделе №1, составляет = "
                + sum + " рублей.");
    }

    public static void printAverageDepartment(int department) {
        System.out.println("2. d)");
        int sum = 0, average = 0, counter = 0;
        for (Employee value : employee) {
            if (value != null) {
                if (value.getDepartment() == department) {
                    counter++;
                    sum += value.getSalary();
                    average = sum / counter;
                }
            }
        }
        System.out.println(average);
    }

    public static void indexingDepartment(int department, int percent) {
        System.out.println("2. e)");
        int sum = 0, total = 0;
        String name = "";
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                sum = value.getSalary();
                name = value.getFullName();
                total = sum + (sum * percent / 100);
                System.out.println("Зарплата сотрудника: " + name + ". При индексации зарплаты в 2% составляет: "
                        + total + " рублей.");
            }
        }
    }

    public static void printAllEmployees(int department) {
        System.out.println("2. f)");
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                System.out.println("ID: " + value.getId() + ". Ф.И.О. " + value.getFullName()
                        + ". Зарплата: " + value.getSalary() + " рублей.");
            }
        }

    }

    public static void printMinNumber(int number) {
        System.out.println("3. a)");
        int sum = 0;
        String name = "";
        int id = 0;
        for (Employee value : employee) {
            sum = value.getSalary();
            id = value.getId();
            name = value.getFullName();
            if (number > sum) System.out.println("ID: " + id + ". Ф.И.О. " + name + ". Зарплата: " + sum);
        }
    }

    public static void printMaxNumber(int number) {
        System.out.println("3. b)");
        int sum = 0, id = 0;
        String name = "";
        for (Employee value : employee) {
            sum = value.getSalary();
            id = value.getId();
            name = value.getFullName();
            if (sum >= number) System.out.println("ID: " + id + ". Ф.И.О. " + name + ". Зарплата: " + sum);
        }
    }

    public static void printNumber(int number) {
        System.out.println("Билет №6:");
        int square = 0;
        square = number * number;
        System.out.println("9 в квадрате = " + square);
    }
}