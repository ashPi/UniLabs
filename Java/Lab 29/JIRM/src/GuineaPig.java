/**
 *
 * @author s4et0
 */
public class GuineaPig extends Contestant{
    private String furType;

    public GuineaPig(String name, double weight, String furType) {
        super(name, weight);
        this.furType = furType;
    }

    public GuineaPig() {
        super();
        this.furType = "not assigned";
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    public String toString() {
        return super.toString() + "GuineaPig{" + "furType=" + furType + '}';
    }
}
