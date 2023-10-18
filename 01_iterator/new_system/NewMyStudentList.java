package new_system;
import my_interface.Aggregate;
import my_interface.Iterator;

public class NewMyStudentList extends NewStudentList implements Aggregate {
    public NewMyStudentList(){
        super();
    }
    
    public Iterator iterator() {
        return new NewMyStudentListIterator(this);
    }
}