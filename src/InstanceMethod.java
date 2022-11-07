
class Student{
// name of student
    public void name_of_student(String name){
        System.out.println(String.format("Student name is: %s", name));
    }

//    grade of student
    public void grade(double grade){
        System.out.println(String.format("Student grade is: %.2f", grade));
    }

//    static method
    public static void className(){
        System.out.println(String.format("Class name is: %s", "Student"));
    }
}
public class InstanceMethod {
    public static void main(String args[]) {
//        create student1 object
        Student student1 = new Student();
        student1.name_of_student("Stacy");
        student1.grade(4.25);

//        create student2 object
        Student student2 = new Student();
        student2.name_of_student("Kevin");
        student2.grade(5.67);

//        create student3 object
        Student student3 = new Student();
        student3.name_of_student("Bree");
        student3.grade(6.70);
    }
}
