package hrapp;

/**
 *
 * @author eduardsb
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LA APLICACIÓN SE ESTÁ INICIANDO....");

        Employee e1 = new Employee(1, "Eduard", 1000.2);
        Employee e2 = new Employee(2, "Cristian", 3265.15);
        Employee e3 = new Employee(3, "Samuel", 4895.165);

        Department department1 = new Department("Departamento de educación");

        //System.out.println(e1.toString());

        //Employee[] employees = {e1, e2, e3};
        //department1.addEmployee(employees);
        
        department1.addEmployee(e1);
        department1.addEmployee(e2);
        department1.addEmployee(e3);
        
        

        for (Employee e : department1.getEmployees()) {
            //System.out.println(e.getId() + "," + e.getName() + "," + e.getSalary());
            System.out.println("Employee: " + e);

        }
        
        System.out.println("total salary is: " + department1.salaryTotal());
        System.out.println("average salary is: "+ department1.salaryAverage());
        
        System.out.println("Employee By Id: " + department1.identifyEmployeeById(2));
    }

}
