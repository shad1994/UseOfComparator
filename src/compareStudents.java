import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class compareStudents implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		if (o1.getCGPA() > o2.getCGPA()) {
			return -1;
		} else if (o1.getCGPA() < o2.getCGPA()) {
			return 1;
		} else {
			if (o1.getName().compareTo(o2.getName()) == 0) {
				if (o1.getId() > o2.getId()) {
					return 1;
				} else if (o1.getId() < o2.getId()) {
					return -1;
				}
			}
			return o2.getName().compareTo(o1.getName());
		}

	}

}
