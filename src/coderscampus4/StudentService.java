package coderscampus4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StudentService {
	
	public static void writeStudents(Student[] studentList) throws IOException {
		Student[] apmthStudents = new Student[33];
		Student[] compSciStudents = new Student[34];
		Student[] statStudents = new Student[33];
		
	
		try (BufferedWriter apmthWriter = new BufferedWriter(new FileWriter("course1.csv"));
			 BufferedWriter compSciWriter = new BufferedWriter(new FileWriter("course2.csv"));
			 BufferedWriter statWriter = new BufferedWriter(new FileWriter("course3.csv"))) {
				
			
			int apmth = 0;
			int compSci = 0;
			int stat = 0;
			
				
			for (Student student : studentList) {
				
				if (student.getCourse().contains("APMTH")) {
					   apmthStudents[apmth] = student;
					   apmth++;
				}
				
			   if (student.getCourse().contains("COMPSCI")) {
				   compSciStudents[compSci] = student;
				   compSci++;
			   }
			   if (student.getCourse().contains("STAT")) {
				   statStudents[stat] = student;
				   stat++;
			   }
			   
			   
			}
			Arrays.sort(apmthStudents);
			apmthWriter.write("StudentID, Student Name, Course, Grade \n");
			for (Student student : apmthStudents) {
				apmthWriter.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade() + "\n");
			}
			
			Arrays.sort(compSciStudents);
			compSciWriter.write("StudentID, Student Name, Course, Grade \n");
			for (Student student : compSciStudents) {
				compSciWriter.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade() + "\n");
			}
			Arrays.sort(statStudents);
			statWriter.write("StudentID, Student Name, Course, Grade \n");
			for (Student student : statStudents) {
				statWriter.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade() + "\n");
			}
			
			}
		
	}

}

