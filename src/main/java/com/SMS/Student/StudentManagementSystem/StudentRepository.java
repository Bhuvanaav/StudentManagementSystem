package com.SMS.Student.StudentManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
	
	Map<Long, Student> students = new HashMap<>();
    
    @PostConstruct
    public default  void init() {
        students.put((long) 1,new Student(1,1001, "Ally","J",12,"ComputerScience","LXM","571671245","female",true));
        students.put((long) 2, new Student(2,1002, "Martin", "A", 12, "BioMaths","LXM","5468728","male", true));
        students.put((long) 3, new Student(3,1003, "Roy", "B", 12,"Accounce","LXM","89567826","male",false));
    }   

	public String addStudent(Student student);

	public List<Student> getAllStudents();

}
