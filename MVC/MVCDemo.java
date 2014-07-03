public class MVCDemo {

	private static Student retrieveStudentInformation() {
		Student student = new Student();
		student.setName("Mike");
		student.setRollNo("5");
		return student;
	}

	public static void main (String[] args) {
		Student model = retrieveStudentInformation(); // Pulls information from data source
		StudentView view = new StudentView(); // Generates kind of view
		StudentController controller = new StudentController(model, view); // Unites model and view, also allows updating values
		
		controller.updateView();
		
		// Same details, different name
		controller.setStudentName("Ricky");
		
		controller.updateView();
		
		
	}
}