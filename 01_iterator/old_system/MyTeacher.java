package old_system;
import my_interface.Iterator;

public class MyTeacher extends Teacher{
	private MyStudentList studentList;

	public void createStudentList(){
		studentList = new MyStudentList(5);
		studentList.add(new Student("赤井亮太",1));
		studentList.add(new Student("赤羽里美",2));
		studentList.add(new Student("岡田美央",2));
		studentList.add(new Student("西森俊介",1));
		studentList.add(new Student("中ノ森玲菜",2));
	}
	public void callStudents(){
		Iterator itr = studentList.iterator();
		while(itr.hasNext()){
			System.out.println(((Student)itr.next()).getName());
		}
	}
}