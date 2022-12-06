/*
* Author: Kawser Wazed Nafi
*
* This program helps to access the Student class and send the values to it by reading the provided file "result.txt".
* I used ArrayList to create dynamic array. You can use regular Arrays.
*
* This program first read the file where the first three lines represent records of each student. The records are:
* Name, BatchNo and GPAs in the last 8 semesters/terms.
*
* Two seperate methods are created. The first method, readFile() will open the given file and read it. As the first three
* lines in the file record a single student, I first check the EOF and then read each of the three lines one by one
* using nextLine(). At the same time, I created an object of the Student class and send my read text to them. I assumed
* that the file is complete, means records of each student is properly given. This is the reason I didn't check each line
* seperately, whether they are present or not.
*
* Another method is getSortedStudents(). This method will sort the studentList/objectList array based on their CGPA. The student
* who has achieved highest CGPA will appear at the beginning. As, the objectList is holding the class object, I get the
* CGPA for each of the student stored in the class, compare them and use them to sort the Whole ObjectList array, not only
* the CGPAs.
*
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentAccess {
    ArrayList<Student> objectList = new ArrayList<Student>();

    /*
    * This method is going to read the given file, result.txt from the Driver class. It will first check the file's validity
    * and then start reading the file line by line.
    *
    * As I mentioned before, I considered that all the records in the file are perfectly given. So once I checked that
    * I am not at the EOF, I read the next three lines directly without any further checking.
    *
    * Integer.ParseInt() method will convert a string value to an Integer one. As our class member is Integer, I am converting
    * the string from String to Integer value and storing it in the class.
    * */
    public ArrayList<Student> readFile(String fileName) throws IOException {
        File file  = new File(fileName);
        Scanner sc = new Scanner(file);
        int count = 0;
        // The following section read the file and then send three values, Name, BatchNo and GPA records to the student
        // class constructor to record them properly.
        while(sc.hasNext()){
            Student std = new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            objectList.add(std);
        }
        return objectList;
    }

    /*
    * The following method sort the ObjectList based on the CGPA. CGPA is now stored in class and class instances/objects
    * are pointing that value. Each object is pointing each student in the class.
    *
    * So, to sort the objectList/student list, you have to sort the list with help of CGPA value stored in each object.
    * I used selection sort to sort the object list based on the CGPA values.
    * */
    public ArrayList<Student> getSortedStudents(){
        double highestCGPA = objectList.get(0).CGPA;
        for(int j = 0; j < objectList.size(); j++) {
            int index = 0;
            for (int i = j + 1; i < objectList.size(); i++) {
                if (highestCGPA < objectList.get(i).CGPA) {
                    highestCGPA = objectList.get(i).CGPA;
                    index = i; // storing the index/positive of the highest CGPA student/object.
                }
                Student temp = objectList.get(j);
                objectList.set(j, objectList.get(index));
                objectList.set(index, temp);
            }
        }
        return objectList;
    }
}
