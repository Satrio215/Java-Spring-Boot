package com.belajar.spring_boot_backend;

import com.belajar.spring_boot_backend.model.Employee;
import com.belajar.spring_boot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Muhammad");
//		employee.setLastName("Satrio");
//		employee.setEmailId("satrio.ajinoto@gmail.com");
//		employeeRepository.save(employee);
	}
}
