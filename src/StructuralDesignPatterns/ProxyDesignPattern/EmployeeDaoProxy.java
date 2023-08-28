package StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            return  employeeDao.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
