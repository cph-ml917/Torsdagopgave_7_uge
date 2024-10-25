package Task_3;

import java.util.ArrayList;

//3.2
public abstract class Teacher extends Person {

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;


    //3.3
    public Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }


    //3.4
    @Override
    public boolean addCourse(String course){
        if (canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
