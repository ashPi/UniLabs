/**
 *
 * @author s4et0
 */
public class TestEmployees {
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.setName("Vicky Y");
        emp.setSalary(170000);
        System.out.println("Manager: " + emp.toString());
        
        Manager mgr = new Manager("Svosvo K", 20000, "IT");
        System.out.println("Manager: " + mgr.toString());
        
        Executive me = new Executive("Sis Tach", 7777777, "IT", "Rule the world");
        System.out.println("Executive: " + me.toString());
    }
    
}
