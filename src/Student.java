import java.util.ArrayList;

public class Student {
    String name;
    int batchNo;
    int[] GPA = new int[8];

    Student(String name, int batchNo, int[] GPA){
        this.name = name;
        this.batchNo = batchNo;
        this.GPA = GPA;
    }
}
