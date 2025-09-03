package org.example.task.ComparableCompare;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());
        if (result == 0) {
            result = Double.compare(s1.getGpa(), s2.getGpa());
            if(result == 0) {
                result = s1.getDepartment().compareTo(s2.getDepartment());
            }
            return result;
        }
        return result;
    }
}
