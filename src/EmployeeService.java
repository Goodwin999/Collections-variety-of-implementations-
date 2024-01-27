import java.util.Collection;

public interface EmployeeService {

    Employee addEmployee(String surname, String name);

    Employee removeEmployee(String surname, String name);

    Employee searchEmployee(String surname, String name);

    Collection<Employee> printAll();


}
