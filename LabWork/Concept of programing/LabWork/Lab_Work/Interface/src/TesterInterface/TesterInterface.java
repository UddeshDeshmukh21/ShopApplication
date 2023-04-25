package TesterInterface;

import com.Interface.Date;
import com.Interface.Employee;
import com.Interface.Iprintable;
import com.Interface.Shape;

public class TesterInterface {

	public static void disply(Iprintable obj) {

		obj.print();
	};

	public static void main(String[] args) {
		System.out.println("\n");

		Employee emp = new Employee();
		emp.print();

		Shape sh = new Shape();
		sh.print();

		Date dt = new Date();
		dt.print();

		System.out.println("Using Display Static Method");

		disply(emp);
		disply(sh);
		disply(dt);

	}

}
