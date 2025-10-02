package samplearrays;
import java.util.Arrays;
public class ManageStudent {


        // 2) Find the Oldest Student
        public static Student findOldest (Student[] students){
            if (students.length==0 ){
                return null;
            }
            Student oldest = students[0];
            for (int i = 0; i < students.length; i++) {
                if (oldest.getAge()<students[i].getAge()){
                    oldest = students[i];
                }

            }
            return oldest;
        }

        // 3) Count Adult Students (age >= 18)
        public static int countAdults (Student[]students){
            if (students.length==0){
                return 0;
            }
            int counter=0;
            for(int i=0;i<students.length;i++){
                if (students[i].getAge()>=18){
                    counter+=1;
                }
            }
            return counter;
        }

        // 4) Average Grade (returns NaN if no students or grades)
        public static double averageGrade (Student[]students){
            if (students.length==0){
                return 0;
            }
            double average =0;
            for(int i=0;i<students.length;i++){
                average +=students[i].getGrade();
            }
            average /=students.length;
            return average;
        }

        // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
        public static Student findStudentByName (Student[]students, String name){
            if (students.length==0){
                return null;
            }
            Student stud=null;
            for(int i=0;i<students.length;i++){
                if (name.equalsIgnoreCase(students[i].getName())){
                    stud=students[i];
                }
            }
            return stud;

        }

        // 6) Sort Students by Grade (descending)
        public static void sortByGradeDesc (Student[]students){
            if (students.length==0){
                return;
            }
            Arrays.sort(students);
            System.out.println(students);

        }

        // 7) Print High Achievers (grade >= 15)
        public static void printHighAchievers (Student[]students){
            if  (students.length==0){
                return;
            }
            for(int i=0;i<students.length;i++){
                if (students[i].getGrade()>=15){
                    System.out.println(students[i]);
                }
            }
        }

        // 8) Update Student Grade by id
        public static boolean updateGrade (Student[]students,int id, int newGrade){
            if  (students.length==0){
                return false;
            }
            for(int i=0;i<students.length;i++){
                if(students[i].getId()==id){
                    students[i].setGrade(newGrade);
                    return true;
                }
            }
            return false;
        }

        // 9) Find Duplicate Names
        public static boolean hasDuplicateNames (Student[]students){
            Student student1=students[0];
            for (int i = 1; i < students.length; i++) {
                if (students[i].getName().equals(student1.getName())) {
                    System.out.println("duplicates found");
                    return true;
                }
            }
            return false;
        }

        // 10) Expandable Array: return a new array with one more slot and append student
        public static Student[] appendStudent (Student[]students, Student newStudent){
            Student[] newarray= new Student[students.length+1];
            for(int i=0;i<students.length;i++){
                newarray[i]=students[i];
            }
            newarray[students.length]=newStudent;
            return newarray;
        }

        // 1) Create an Array of Students + demos for all tasks
        public static void main (String[]args){

            //representing a school
            System.out.println("representing a school :  ");
            Student[][] school = new Student[2][1];
            school[0][0]=new Student(9,"iostre");
            school[0][1]=new Student(8,"elem2");
            school[1][0]=new Student(9,"elem3");
            school[1][1]=new Student(8,"elem4");
            school[2][0]=new Student(9,"elem5");
            school[2][1]=new Student(8,"scoco");


            // Create & initialize array of 5 students
            Student[] students = new Student[5];
            students[0] = new Student(1, "halima");
            students[1] = new Student(2, "bro", 19);
            students[2] = new Student(3, "hal", 20, 12);
            students[3] = new Student(4, "sis", 14);
            students[4] = new Student(5, "assia");


            // Print all
            System.out.println("== All Students ==");
            for (Student s : students) System.out.println(s);
            System.out.println("Total created: " + Student.getNumStudent());

            // 2) Oldest
            System.out.println("oldest student is :"+ManageStudent.findOldest(students));

            // 3) Count adults
            System.out.println("number of adults is :"+ManageStudent.countAdults(students));

            // 4) Average grade
            System.out.println("average grade is:"+ManageStudent.averageGrade(students));

            // 5) Find by name
            System.out.println("this student is : "+ManageStudent.findStudentByName(students, "halima"));

            // 6) Sort by grade desc
            ManageStudent.sortByGradeDesc(students);
            // sort function
            System.out.println("\n== Sorted by grade (desc) ==");
            for (Student s : students) System.out.println(s);

            // 7) High achievers >= 15
            System.out.println("\nHigh achievers:");
            printHighAchievers(students);

            // 8) Update grade by id
            boolean updated=ManageStudent.updateGrade(students, 1, 12);
            // function
            System.out.println("\nUpdated id=4? " + updated);
            System.out.println(findStudentByName(students, "Dina"));

            // 9) Duplicate names
            System.out.println("check if it has duplicates names :"+ManageStudent.hasDuplicateNames(students));

            // 10) Append new student
            Student std1 = new Student(1,"ino",19,20);
            Student[] newarray=  ManageStudent.appendStudent(students,std1);
            for(Student s : newarray){
                System.out.println(s);
            }

        }
    }


