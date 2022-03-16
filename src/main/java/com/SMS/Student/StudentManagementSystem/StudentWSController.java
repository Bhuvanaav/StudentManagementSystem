package com.SMS.Student.StudentManagementSystem;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;



@Path("/SMS")
public class StudentWSController {
	
	StudentService studentService = new StudentService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String addStudent(Student student) {
        return studentService.addStudent(student);
    }
	
	@GET
	@Path("/{rollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	  	  public String getAllStudents(@PathParam("rollNo") String rollNo){
	    return "student rollNo is : " + rollNo;
	  }
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getstudentsInfo(@QueryParam("rollNo") String rollNo) {
		return "Got rollNo using query parameter" +rollNo;
	}*/

}
