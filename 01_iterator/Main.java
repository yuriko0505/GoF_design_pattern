import old_system.MyTeacher;
import old_system.Teacher;
import new_system.NewMyTeacher;
import new_system.NewTeacher;

public class Main{
	public static void main(String args[]){
		System.out.println("--- old system ---");
		Teacher you = new MyTeacher();
		you.createStudentList();
		you.callStudents();

		System.out.println("\n--- new system ---");
		NewTeacher you2 = new NewMyTeacher();
		you2.createStudentList();
		you2.callStudents();
	}
}