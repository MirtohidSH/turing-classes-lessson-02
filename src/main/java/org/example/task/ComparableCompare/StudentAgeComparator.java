package org.example.task.ComparableCompare;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getAge() - s2.getAge();
        if (result == 0) {
            result = s1.getClassNumber() - s2.getClassNumber();
            if (result == 0) {
                result = s1.getLessonsNumber() - s2.getLessonsNumber();
            }
            return result;
        }
        return result;
    }
}
