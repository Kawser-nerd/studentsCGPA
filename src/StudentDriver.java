/*
* Author: Kawser Wazed Nafi
*
* This is the driver/main class. This class is going to control all the other classes in this
* program; i.e. Student class, StudentAccess class.
*
* This program is going to access the member of StudentAccess class member readFile and sorted Array.
*  */
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
