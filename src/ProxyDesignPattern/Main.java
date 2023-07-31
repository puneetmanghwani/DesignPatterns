package ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new Employee());
            System.out.println("success");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
