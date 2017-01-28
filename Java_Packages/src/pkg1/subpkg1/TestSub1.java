package pkg1.subpkg1;

import teacher.TeacherLogin;
import teacher.TeacherSubject;

public class TestSub1 {
	
	public static void main(String[] args) {
		
		 TeacherLogin teacher = new  TeacherLogin();
		 teacher.testTeacherLogin();
		 teacher.name= "Raman";
		 TeacherSubject subject = new  TeacherSubject();
		 subject.subject="Selenium";
		
	}

}
