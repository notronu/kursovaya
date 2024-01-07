// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Employee[] employees = {
            new Employee("Котюхин Сергей Васильевич", 1, 35000),
            new Employee("Шершина Наталия Викторовна", 1, 76500),
            new Employee("Сумасбродов Павел Ахтимьевич", 2, 48000),
            new Employee("Рукоплясов Данил Альбертович", 4, 34000),
            new Employee("Неприплясова Екатерина Дмитриевна", 5, 38500),
            new Employee("Отдыхатова Ольга Александровна", 3, 43000),
            new Employee("Отвертеплюхова Надежда Алексеевна", 2, 66000),
            new Employee("Костыгин Рустам Акбарович", 4, 80000),
            new Employee("Широкоруков Андрей Иисусович", 5, 26000),
            new Employee("Голимова Софья Владимировна", 3, 30000)
    };
    public static void main(String[] args) {
        System.out.println("------------");
        printEmployees();
        System.out.println("------------");
        System.out.println(totalSalary());
        System.out.println("------------");
        System.out.println(maxSalary());
        System.out.println("------------");
        System.out.println(minSalary());
        System.out.println("------------");
        System.out.println(averageSalary());
        System.out.println("------------");
        printFullNames();
        System.out.println("------------");
        moreSalary(35);
        System.out.println("------------");
        printEmployees();
        System.out.println("------------");
        System.out.println(maxSalaryInDepartment(3));
        System.out.println("------------");
        System.out.println(minSalaryInDepartment(3));
        System.out.println("------------");
        System.out.println(totalSalaryInDepartment(1));
        System.out.println("------------");
        System.out.println(averageSalaryOfDepartment(1));
        System.out.println("------------");
        moreSalaryOfDepartment(20, 3);
        System.out.println("------------");
        printEmployeesOfDepartment(3);
        System.out.println("------------");
        printEmployeesWithMoreSalary(100000);
        System.out.println("------------");
        printEmployeesWithLessSalary(50000);
        System.out.println("------------");


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee minSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }


        private static Employee maxSalary() {
            Employee result = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() > result.getSalary()) {
                    result = employee;
                }
            }
            return result;
        }

        private static float averageSalary() {
        return(float) totalSalary() / employees.length;
    }
    private static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    private static void moreSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    private static Employee minSalaryInDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if(employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                result = employee;
                minSalary = employee.getSalary();
            }
        }
        return result;
    }

    private static Employee maxSalaryInDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                result = employee;
                maxSalary = employee.getSalary();
            }
        }
        return result;
    }
    private static int totalSalaryInDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static float averageSalaryOfDepartment(int department) {
        float sum = 0;
        int membersCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return sum / membersCount;
    }

    private static void moreSalaryOfDepartment(int percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

        private static void printEmployeesOfDepartment(int department) {
            for (Employee employee : employees) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee);
                }
            }
        }

        private static void printEmployeesWithMoreSalary(int salary) {
            for (Employee employee : employees) {
                if (employee.getSalary() >= salary) {
                    System.out.println(employee.getId() + " " + employee.getSalary() + " " + employee.getFullName());

                }
            }
        }
        private static void printEmployeesWithLessSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getSalary() + " " + employee.getFullName());

            }
        }
    }













}