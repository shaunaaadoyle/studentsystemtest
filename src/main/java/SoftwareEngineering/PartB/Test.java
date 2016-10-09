package SoftwareEngineering.PartB;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import Assignment1.SoftwareEngineering.*;
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList();
		Student s1 = new Student("Shauna","Doyle", 13417068, 20, "1995-11-20", "CS&IT");
		Student s2 = new Student("Sean","Long", 13312307, 21, "1994-12-12", "Commerce");
		Student s3 = new Student("John","Colleran", 1313968, 20, "1996-09-01", "CS&IT");
		Student s4 = new Student("Nelly","Harrington", 12310694, 23, "1993-09-12", "Commerce");
		Student s5 = new Student("Harry","Moran", 12234124, 21, "1995-10-05", "CS&IT");
		Student s6 = new Student("James","Lohan", 129687375, 25, "1991-05-20", "CS&IT");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
  
		ArrayList<Module> commModules = new ArrayList();
		Module Economics = new Module("Economics", "EC416", studentList);
		Module Accounting = new Module("Accounting", "AC492", studentList);
		CourseProgramme Comm = new CourseProgramme("Commerce", new LocalDate ("2016-09-06"), new LocalDate ("2017-05-12"), commModules);
		commModules.add(Economics);
		commModules.add(Accounting);
		
		
		ArrayList<Module> csitModules = new ArrayList();
		Module Programming = new Module("Programming", "CT427", studentList);
		Module SoftEng = new Module("Software Engineering", "CT412", studentList);
		CourseProgramme csit = new CourseProgramme("CS&IT", new LocalDate ("2016-09-10"), new LocalDate ("2017-05-15"), csitModules);
		csitModules.add(Programming);
		csitModules.add(SoftEng);
		
		//System.out.println(studentList);
		for( Student  student : studentList) {
			
			System.out.println(student);
			
		}
	
	}
	
}
