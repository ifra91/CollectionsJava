package demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int rollNo;
    int marks;

    public Student(int rollNo, int marks){
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
}

public class ComparatorPt2 {
    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(1,39));
        stuList.add(new Student(2,49));
        stuList.add(new Student(3,59));
        stuList.add(new Student(4,39));
        stuList.add(new Student(5,19));

        //by using comparator we are sorting the data
        Collections.sort(stuList,(s1,s2)->{
            return s1.marks> s2.marks ? -1 : s1.marks< s2.marks?1:0;
        });

        for(Student s : stuList){
            System.out.println(s);
        }

    }
}
