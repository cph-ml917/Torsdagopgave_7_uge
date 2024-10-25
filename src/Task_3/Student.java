package Task_3;

import java.util.ArrayList;

//3.2
public abstract class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    //3.3
    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    //3.4
    @Override
    public boolean addCourse(String course){
        if (passedCourses.contains(course)){
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}
