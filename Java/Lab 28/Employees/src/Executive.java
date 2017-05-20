/**
 *
 * @author s4et0
 */
public class Executive extends Manager{
    private String plan;

    public Executive(String name, double salary, String department, String plan) {
        super(name, salary, department);
        this.plan = plan;
    }

    public Executive() {
        this.plan = "not assigned";
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "plan=" + plan + '}';
    }
}
