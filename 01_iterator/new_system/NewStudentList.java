package new_system;
import java.util.Vector;

import old_system.Student;

public class NewStudentList{
	protected Vector<Student> students;

	public NewStudentList(){
		this.students = new Vector<>();
	}
	public void add(Student student){
    	students.add(student);
    }
    public Student getStudentAd(int index){
    	return students.get(index);
    }
	public int getLastNum() {
		return students.size();
	}
}