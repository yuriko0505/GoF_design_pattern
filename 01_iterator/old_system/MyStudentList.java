package old_system;
import my_interface.Aggregate;
import my_interface.Iterator;

public class MyStudentList extends StudentList implements Aggregate{
	public MyStudentList(){
		super();
	}
	public MyStudentList(int studentCount){
		super(studentCount);
	}

	public Iterator iterator(){
		return new MyStudentListIterator(this);
	}
}