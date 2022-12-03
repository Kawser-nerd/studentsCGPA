public class Student {
    String name;
    int batchNo;
    double CGPA;

    Student(String name, int batchNo, String gpas){
        this.name = name;
        this.batchNo = batchNo;
        String [] temp = gpas.split(" ");
        double total = 0;
        for (int i = 0; i < temp.length; i++)
            total += Double.parseDouble(temp[i]);
        CGPA = total/temp.length;
    }
}
