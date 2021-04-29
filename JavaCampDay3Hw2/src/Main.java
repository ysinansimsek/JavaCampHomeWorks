
public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("Sinan");
		person.setLastName("Şimşek");
		Person person2=new Person();
		person2.setFirstName("Engin");
		person2.setLastName("Demiroğ");
		StudentManager studentManager=new StudentManager();
		studentManager.add(person);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(person2);
		UserManager userManager = new UserManager();
		userManager.add(person);

	}

}
