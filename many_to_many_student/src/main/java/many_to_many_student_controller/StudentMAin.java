package many_to_many_student_controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.many_to_one_uni_dto.Student;

import many_to_many_student_dto.Course;

public class StudentMAin {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Course course1=new Course();
		course1.setId(101);
		course1.setCouse_name("java");
		course1.setFees(35000);
		course1.setDuration(3);
		
		Course course2=new Course();
		course2.setId(102);
		course2.setCouse_name("Advance java");
		course2.setFees(55000);
		course2.setDuration(2);
		
		Course course3=new Course();
		course3.setId(103);
		course3.setCouse_name("Sql");
		course3.setFees(35000);
		course3.setDuration(1);
		
		Student s=new Student();
		s.setId(1);
		s.setName("Adya");
		s.setPhone(739278937);
		s.setAddress("BLR");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("rAdya");
		s1.setPhone(739278937);
		s1.setAddress("BLR");
		
		Student s2=new Student();
		s2.setId(3);
		s2.setName("raj");
		s2.setPhone(739278937);
		s2.setAddress("HSN");
		
		List<Course>c=new ArrayList<Course>();
		 c.add(course1);
		 c.add(course2);
		 
		 List<Course>c1=new ArrayList<Course>();
		 c1.add(course3);
		 c1.add(course2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		System.out.println("enter the course id");
//		int course_id=scanner.nextInt();
//		
//		System.out.println("enter the couse name");
//		String course_name=scanner.next();
//		
//		System.out.println("enter the fees");
//		double fees=scanner.nextDouble();
//		
//		System.out.println("enter the duration");
//		int duration =scanner.nextInt();
		
//		Course course1=new Course();
//		course1.setCouse_name(course_name);
//		course1.setId(course_id);
//		course1.setDuration(duration);
//		course1.setFees(fees);
		
		//student details
//		System.out.println("enter the student id");
//		int sid=scanner.nextInt();
//		
//		System.out.println("enter the name");
//		String name=scanner.next();
//		
//		System.out.println("enter the address");
//		String address =scanner.next();
				
		
		
		
	}
}
