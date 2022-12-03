import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentAccess {
    ArrayList<Student> objectList = new ArrayList<Student>();

    public ArrayList<Student> readFile(String fileName) throws IOException {
        File file  = new File(fileName);
        Scanner sc = new Scanner(file);
        int count = 0;

        while(sc.hasNext()){
            Student std = new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            objectList.add(std);
        }
        return objectList;
    }

    public ArrayList<Student> getSortedStudents(){
        double highestCGPA = objectList.get(0).CGPA;
        for(int j = 0; j < objectList.size(); j++) {
            int index = 0;
            for (int i = j + 1; i < objectList.size(); i++) {
                if (highestCGPA < objectList.get(i).CGPA) {
                    highestCGPA = objectList.get(i).CGPA;
                    index = i;
                }
                Student temp = objectList.get(j);
                objectList.set(j, objectList.get(index));
                objectList.set(index, temp);
            }
        }
        return objectList;
    }
}
