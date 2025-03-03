package com.belajar.spring_boot_backend;

import com.belajar.spring_boot_backend.model.Company;
import com.belajar.spring_boot_backend.model.Employee;
import com.belajar.spring_boot_backend.repository.CompanyRepository;
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

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public void run(String... args) throws Exception {
		Company company = new Company();
		company.setName("PT. Telekomunikasi Indonesia Maju");
		company.setLocation("Jl. Veteran No.10-11, Ketawanggede, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145");
		company = companyRepository.save(company);

		Employee employee = new Employee();
		employee.setFirstName("Muhammad");
		employee.setLastName("Satrio");
		employee.setEmailId("satrio.ajinoto@gmail.com");
		employee.setCompany(company);
		employeeRepository.save(employee);
	}
}
