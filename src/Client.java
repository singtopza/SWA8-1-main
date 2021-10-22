
public class Client {
	public static void main(String[]args) {
		Person john = new Person("Ma","John",25);
		Employee emp = new Employee(john,50000);
		emp.showDetail();
	}
}
