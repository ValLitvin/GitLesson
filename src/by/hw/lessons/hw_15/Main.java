package by.hw.lessons.hw_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Агриппиина ", "Котлеткина", 21,  3100);
        Employee emp2 = new Employee(2, "Добрыня", "Александров", 28, 3500);
        Employee emp3 = new Employee(3, "Ульяна", "Давидович", 41, 4300);
        Employee emp4 = new Employee(4, "Иван", "Тихомиров", 25, 3800);
        Employee emp5 = new Employee(5, "Константин", "Петров", 36 , 5130);
        Employee emp6 = new Employee(6, "Агафья", "Тарасова", 48, 3500);
        Employee emp7 = new Employee(7, "Никита", "Кумпан", 38, 4700);
        Employee emp8 = new Employee(8, "Евгения", "Махорина", 35, 2500);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(emp1, "Терапевт");
        employees.put(emp2, "Офтальмолог");
        employees.put(emp3, "Терапевт");
        employees.put(emp4, "Педиатр");
        employees.put(emp5, "Гинеколог");
        employees.put(emp6, "Офтальмолог");
        employees.put(emp7, "Педиатр");
        employees.put(emp8, "Терапевт");

        raiseSalaryForProfession(employees, 250);

        Map<String, Collection<Employee>> professionMap = createProfessionMap(employees);

        for (Map.Entry<String, Collection<Employee>> entry : professionMap.entrySet()) {
        System.out.println("------------------------------");
            System.out.println("Профессия: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println(employee);
            }
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals("Педиатр")) {
                int newSalary = entry.getKey().getSalary() + amountOfIncrease;
                entry.getKey().setSalary(newSalary);
                System.out.println("Зарплата сотрудника " + entry.getKey().getFirstName() + " " + entry.getKey().getLastName() + " повышена до " + newSalary);
            }
        }
    }

    private static Map<String, Collection<Employee>> createProfessionMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> professionMap = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String profession = entry.getValue();
            if (!professionMap.containsKey(profession)) {
                professionMap.put(profession, new ArrayList<>());
            }
            professionMap.get(profession).add(entry.getKey());
        }

        return professionMap;
    }
}
