/*
Author: Kawser Wazed Nafi

The main purpose of this class is to give an architecture to the student and listed its features.

The student class has three members: Name, BatchNo and CGPA. CGPA is the average of the GPAs each student has got
in their last 8 semesters.

At first, you have to create the skeleton of the Student class with their own members and have to use this
skeleton throughout the program.

 */
public class Student {
    String name; // This variable will store student name
    int batchNo; // This variable will store student's batchNo
    double CGPA; // This variable will store student's CGPA

    Student(String name, int batchNo, String gpas){ // this is a constructor. This constructor will get the values whenever
                                                    // any object is created.
        this.name = name;
        this.batchNo = batchNo;
        String [] temp = gpas.split(" "); // This line divides the input String in their space character. Whenever it gets
                                                // a space in the input string, it divides them into two seperate arrays. As in the input
                                                // there are 7 characters to seperate 8 GPAs, it will create 8 individual array elements
        double total = 0;
        /*
        * In the file, GPAs are posted for each student. And there are GPAs for the last eight semesters. We have to calcualte
        * the average GPAs, which is called CGPAs for each of the students. We have to add all the GPAs together and then
        * need to divide the total with the number of semesters.
        * */
        for (int i = 0; i < temp.length; i++)
            total += Double.parseDouble(temp[i]);
        CGPA = total/temp.length;
    }
}
