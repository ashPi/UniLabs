/**
 *
 * @author s4et0
 */
public class Owner {
    private String name;
    private String nationality;
    private boolean member;

    public Owner(String name, String nationality, boolean member) {
        this.name = name;
        this.nationality = nationality;
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + getName() + ", nationality=" + getNationality() + ", member=" + isMember() + '}';
    }
    
}
