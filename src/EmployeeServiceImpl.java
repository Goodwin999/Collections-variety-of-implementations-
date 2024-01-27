import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employeeMap;

    public EmployeeServiceImpl() {
        this.employeeMap = new HashMap<>();
    }

    private String generateKey(String firstName, String lastName) {
        return firstName + lastName;
    }

    @Override
    public Employee addEmployee(String surname, String name) {
        String key = generateKey(surname, name);
        Employee newEmployee = new Employee(surname, name);
        employeeMap.put(key, newEmployee);
        return newEmployee;

    }

    @Override
    public Employee removeEmployee(String surname, String name) {
        String key = generateKey(surname, name);
        return employeeMap.remove(key);

    }

    @Override
    public Employee searchEmployee(String surname, String name) {
        String key = generateKey(surname, name);
        return employeeMap.get(key);
    }

    @Override
    public Collection<Employee> printAll() {
        return employeeMap.values();
    }
}
