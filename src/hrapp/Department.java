/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author eduardsb
 */
public class Department {

    private String nameDep;

    public Department(String nameDep) {
        this.nameDep = nameDep;
    }

    private Employee[] employees = new Employee[10];

    private int lastAddEmployeeIndex = -1;

    public void addEmployee(Employee someEmployees) {

        if (lastAddEmployeeIndex < employees.length) {
            lastAddEmployeeIndex++;
            employees[lastAddEmployeeIndex] = someEmployees;
        }

    }

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddEmployeeIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getNumEmployees() {
        return lastAddEmployeeIndex + 1;
    }

    public Employee identifyEmployeeById(int id) {
        for (Employee e : employees) {
            if (e != null) {
                if (e.getId() == (id)) {

                    return e;
                }
            }
        }
        return null;

    }

    public double salaryTotal() {

        double totalSalary = 0.0;
        /*
        
        for (Employee e : employees) {
            totalSalary += e.getSalary();
        }
        
         */

        for (int i = 0; i < lastAddEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double salaryAverage() {
        double averageSalary = 0.0;

        /*int count = 0;
        for (Employee e : employees) {
            averageSalary += e.getSalary();
            count++;

        }
        averageSalary = averageSalary / count;
        return averageSalary;
         */
        if (lastAddEmployeeIndex > -1) {
            return salaryTotal() / (lastAddEmployeeIndex + 1);
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Department " + nameDep;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

}
