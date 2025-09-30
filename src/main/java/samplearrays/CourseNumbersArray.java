package samplearrays;
import java.util.Arrays;

public class CourseNumbersArray {
    private static int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
    private static int[] updatedCourses = new int[registeredCourses.length+1];
    public static void addNewCourse(int new_course){
        for (int i=0;i<registeredCourses.length;i++){
            updatedCourses[i] = registeredCourses[i];
        }
        Arrays.fill(updatedCourses,new_course);


    }
    public static boolean check_course_number(int course_number){
        for (int i=0;i<updatedCourses.length;i++){
            if (updatedCourses[i]==course_number){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        addNewCourse(10);
        addNewCourse(20);
        addNewCourse(30);
        check_course_number(30);
        check_course_number(10);
        check_course_number(1010);

    }
}
