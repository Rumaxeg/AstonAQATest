package lesson_06;

import java.util.HashSet;
import java.util.Set;

public class StudentsCollection<T> {

    Set<Student> students = new HashSet<>();

    public void removeStudentWithBadScore(Set<Student> students){
        for(Student s : students){
            if(s.getAverageScore() < 3){
                students.remove(s);
            }
        }
    }

    public void setCourseForStudentWithGoodScore(Set<Student> students){
        for(Student s : students){
            if(s.getAverageScore() >= 3){
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public void printStudents(Set<Student> students, int course){
        for(Student s : students){
            if(s.getCourse() == course){
                System.out.println(s.getName());
            }
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }
}
