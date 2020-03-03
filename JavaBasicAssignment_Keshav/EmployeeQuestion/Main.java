package EmployeeQuestion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Employee, Employee> employeeHashMap = new HashMap<>();
    public static void main(String args[]){
        Manager manB = new Manager("manB");
        Manager manA = new Manager("manA");
        Employee empA = new TemporaryEmployee("empA");
        Employee empB = new PermanentEmployee("empB");
        Employee empC = new PermanentEmployee("empC");
        Employee empD = new PermanentEmployee("empD");
        Employee empE = new PermanentEmployee("empE");
        Employee empF = new TemporaryEmployee("empF");
        CEO ceo = CEO.getInstance("CEO");

        employeeHashMap.put(empA, manA);
        employeeHashMap.put(empB, manB);
        employeeHashMap.put(empC, manA);
        employeeHashMap.put(empD, manA);
        employeeHashMap.put(empE, manB);
        employeeHashMap.put(empF, manB);
        employeeHashMap.put(manA, manB);
        employeeHashMap.put(manB, ceo);

        System.out.println("INITIAL ORGANIZATION STRUCTURE");
        printStructure();
        removeEmployee(empA);
        System.out.println("ORGANIZATION STRUCTURE WHEN EMP A LEAVES");
        printStructure();
        removeEmployee(manA);
        System.out.println("ORGANIZATION STRUCTURE WHEN MAN A LEAVES");
        printStructure();
    }

    // Prints the Organization Structure
    public static void printStructure() {
        for(Map.Entry<Employee,Employee> kvp : employeeHashMap.entrySet()) {
            System.out.println(kvp.getKey().name + " reports to " + kvp.getValue().name);
        }
        System.out.println();
    }

    // Removes an Employee from the organization
    public static void removeEmployee(Employee emp){
        if(!(emp instanceof Manager)){
            employeeHashMap.remove(emp);
        }
        else{
            for(Map.Entry<Employee,Employee> kvp : employeeHashMap.entrySet()) {
                if(kvp.getValue().name.equalsIgnoreCase(emp.name)) {
                    employeeHashMap.replace(kvp.getKey(),employeeHashMap.get(emp));
                }
            }
            employeeHashMap.remove(emp);
        }

    }
}