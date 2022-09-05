package demo.List;

import java.util.ArrayList;
import java.util.List;

class StudentMarks implements Comparable<StudentMarks>{
    int rollNo;
    int marks;

    public StudentMarks(int rollNo, int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        return this.marks>=this.marks? -1 : this.marks <= this.marks? 1:0 ;
    }
}


public class ComparableDemo {

    public static void main(String[] args) {

        List<StudentMarks> stuList = new ArrayList<StudentMarks>();
        stuList.add(new StudentMarks(1, 39));
        stuList.add(new StudentMarks(2, 49));
        stuList.add(new StudentMarks(3, 59));
        stuList.add(new StudentMarks(4, 39));
        stuList.add(new StudentMarks(5, 19));

        //by using comparable Interface we are sorting the data


        for (StudentMarks s : stuList) {
            System.out.println(s);
        }

    }
}
