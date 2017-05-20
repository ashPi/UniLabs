/**
 *
 * @author 1600502
 */
public class TestLecturerSet {
    public static void main(String[] args) {
        LecturerSet rguLecturers = new LecturerSet();
        rguLecturers.addName("Roger");
        rguLecturers.addName("John");
        rguLecturers.addName("Mark");
        rguLecturers.addName("Yang");
        rguLecturers.addName("Patrik");
        rguLecturers.addName("Jay");
        rguLecturers.addName("David");
        rguLecturers.addName("Roger");
        System.out.println(rguLecturers.toString());
        System.out.println("For Each Loop:");
        rguLecturers.printForEach();
        System.out.println("\nItrerator: ");
        rguLecturers.printIterator();
        rguLecturers.removeName("Sisi");
        rguLecturers.addName("Sisi");
        System.out.println(rguLecturers.toString());
        rguLecturers.removeName("Sisi");
    }
    
}
