package edu.pnu.admin;
import edu.pnu.collection.*;
public class School {
    private final String name;
    private GenericList<Student> students = new GenericList<Student>();
    private int studentCount;
    private int limit;

    public School(final String name, int limit){
        this.name = name;
        this.limit = limit;
    }

    @Override
    public String toString() {
        String msg = "School Name: " + name + " Student Count: " + studentCount + "\n";
        for (int i = 0; i < studentCount; i++) {
            msg +=  students.get(i) + "\n";
        }
        return msg;
    }


    public Student findStudent(String name, int year) {
        Student otherStudent = new Student(name, year);
        int flag = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students.get(i).equals(otherStudent)) {
                break;
            }
            flag++;
        }
        if( flag == studentCount){
            otherStudent = null;
        }
        return otherStudent;
    }

    public void addStudent(Student student){
        students.add(student);
        this.studentCount = students.getSize();
    }

    public void removeAllStudent(){
        students.clear();
        students.setSize(0);
        this.studentCount = 0;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        School other = (School) o;
        return name.equals(other.name);
    }
    @Override
    public int hashCode(){
        int result = 1;
        result = 31*result + name.hashCode();
        return result;
    }

}
