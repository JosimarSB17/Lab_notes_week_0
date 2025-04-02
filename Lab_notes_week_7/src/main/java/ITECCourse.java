import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }


    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0){
            return;
        }

        this.maxStudents = maxStudents;
    }

    public ITECCourse(String Coursename, int Coursecode, int coursemaxStudents) {
        name = Coursename;
        code = Coursecode;
        maxStudents = coursemaxStudents;
        students = new ArrayList<>();
    }

    public void addStudent(String StudentName) {
        if (students.size() == maxStudents){
            System.out.println(name  + " is full cannot add " + StudentName);
        }else {
        students.add(StudentName);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: " + students);
        for (String s : students) {
            System.out.println(s);
        }
        System.out.println("There are " + maxStudents + " students");
        System.out.println("The max number of students is " + maxStudents);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void removeStudent(String StudentName) {
        if (students.contains(StudentName)) {
            students.remove(StudentName);
            System.out.println("Student " + StudentName + " removed");
        } else {
            System.out.println("Student " + StudentName + " not found in " + name);
        }
    }
}
