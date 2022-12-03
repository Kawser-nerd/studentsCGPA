import java.io.IOException;
import java.util.ArrayList;

public class StudentDriver {
    private static String toPrint(Student std, int index)
    {
        return "Student Name: "+ std.name + ", batch no: "+ std.batchNo+" has got CGPA: "+ std.CGPA
                + " & his position in the Class is: "+ index;
    }

    public static void main(String[] args) throws IOException {
        StudentAccess stdacs = new StudentAccess();
        stdacs.readFile("result.txt");
        ArrayList<Student> studentSortedList = stdacs.getSortedStudents();
        for(int i = 0; i < studentSortedList.size(); i++) {
            System.out.println(toPrint(studentSortedList.get(i), i));
        }
    }
}
