package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {
	//create some student object
	Student s1 = new Student("2020ICT48","Ilma",23,"IT",3.70);
	Student s2 = new Student("2020CS31","Ruwini",24,"CS",3.80);
	Student s3 = new Student("2020ASB88","Nimna",23,"BIO Sceince",4.0);
	Student s4 = new Student("2020ICT56","Pabodha",25,"IT",3.59);
	Student s5 = new Student("2020ICT95","Saduni",30,"AMC",3.25);
	
	private static List<Student> students = new ArrayList<Student>();
	private Map<String,Student> mstudents = new HashMap<String,Student>();
	
	
	public AppController()
	{
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		mstudents.put(s1.getRegNo(),s1);
		mstudents.put(s2.getRegNo(),s2);
		mstudents.put(s3.getRegNo(),s3);
		mstudents.put(s4.getRegNo(),s4);
		mstudents.put(s5.getRegNo(),s5);
		
		
	}
	@GetMapping("/msg")
	public String Mymessage() {
		return "Hello Spring Boot!";
	}
	
	@GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag") int age)
	{
		return "My Age is " +age;
	}
    
	
	//a method  to return student
	@GetMapping("/student1")
	public Student getStudent()
	{
		return s1;
	}
	
	//return multiple students
	@GetMapping("/students")
	public Map<String,Student> getStudents()
	{
		return mstudents;
	}
	
	//find a student from the list by regNo
	@GetMapping("/students/{regNo}")
	public Student getStudentsReg(@PathVariable("regNo") String regNo )
	{
		
		return mstudents.get(regNo);  
	}
	
	
	//Add a New Student 
	@PostMapping("/add")
	public String addstudent(@RequestBody Student student)
	{
		mstudents.put(student.getRegNo(), student);
		return "New Student added";
		
	}
	
	//Delete the Student
	@DeleteMapping("/students/{id}")
	public String DeleteStudent(@PathVariable("id") String regno)
	{
		if(mstudents.get(regno) != null)
		{
			mstudents.remove(regno);
			return "The Student removed";
		}
		return "404 couldn't find the student";
	}
	
	//Update the student
	@PutMapping("/update/{id}")
	public String UpdateStudent(@PathVariable("id") String regNo,@RequestBody Student student)
	{
		if(mstudents.get(regNo) != null)
		{
			mstudents.put(student.getRegNo(), student);
			return "The Student Details are Updated";
		}
		return "404 couldn't find the student";
	}
	
	//find the student whose age is between 20 and 23
	@GetMapping("/findage")
	public Student getStudentAge(int age)
	{
		
			return null; 
	}
	
	
 
	
	
	
	
}
