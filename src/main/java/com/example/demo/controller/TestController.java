package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/*
	 * @Autowired EmployeeRepository repo;
	 */
	@GetMapping("view")
	public String test() {

		return "WEL COME TO DOCKER LEARNING";
	}
	
	/*
	 * @GetMapping("allEmp") public String empAll() { Employee emp=new
	 * Employee(0,"Pravat","BBSR","Emp001"); emp=repo.save(emp); List<Employee>
	 * list=repo.findAll(); ObjectMapper mapper=new ObjectMapper(); String
	 * employee=null; try { employee =
	 * mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list); } catch
	 * (JsonProcessingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return employee; }
	 */
}
