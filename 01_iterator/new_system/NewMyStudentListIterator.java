package new_system;
import my_interface.Iterator;
import old_system.Student;

public class NewMyStudentListIterator implements Iterator {
    private NewMyStudentList myStudentList;
    private int index;
    public NewMyStudentListIterator(NewMyStudentList list){
        this.myStudentList = list;
        this.index = 0;
    }
    public boolean hasNext() {
        if (myStudentList.getLastNum() > index){
            return true;
        } else {
            return false;
        }
    }
    public Student next(){
        Student s =  myStudentList.getStudentAd(index);
        index++;
        return s;
    }
}