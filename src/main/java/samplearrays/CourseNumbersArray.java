package samplearrays;
import java.util.ArrayList;
import java.util.Arrays;

public class CourseNumbersArray {
    private static int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
    public static ArrayList<Integer> updatedCourses = new ArrayList<Integer>();
    public static void addNewCourse(int new_course){


        updatedCourses.add(new_course);


    }
    public static boolean check_course_number(int course_number){
        for (int i=0;i<updatedCourses.size();i++){
            if (updatedCourses.get(i)==course_number){
                System.out.println("the course number exist : "+updatedCourses.get(i));
                return true;
            }

        }
        return false;
    }
    public static void fill_updated_courses(){
        for (int i=0;i<registeredCourses.length;i++){
            updatedCourses.add(registeredCourses[i]);
        }
    }

    public static void main(String[] args) {
        fill_updated_courses();
        addNewCourse(10);
        for(int elem : updatedCourses){
            System.out.print(elem+" ");
        }
        System.out.println();
        addNewCourse(20);
        for(int elem : updatedCourses){
            System.out.print(elem+" ");
        }
        System.out.println();
        addNewCourse(30);
        for(int elem : updatedCourses){
            System.out.print(elem+" ");
        }
        System.out.println();
        check_course_number(30);
        check_course_number(10);

    }
}
