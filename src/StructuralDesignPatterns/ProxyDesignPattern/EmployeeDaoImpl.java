package StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("fetching");
        return new Employee();
    }
}
