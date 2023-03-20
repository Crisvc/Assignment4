package coderscampus4;

import java.io.IOException;


public class Application {

	public static void main(String[] args) throws IOException {
		
		FileService fileSerice = new FileService ();
		Student[] masterList = FileService.readStudents("student-master-list.csv");
		StudentService.writeStudents(masterList);
	}

}
