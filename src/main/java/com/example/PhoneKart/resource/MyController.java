package com.example.PhoneKart.resource;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.PhoneKart.model.Employee;
import com.example.PhoneKart.model.Employees;
import com.example.PhoneKart.model.Members;
import com.example.PhoneKart.repository.EmployeeDAO;
import com.example.PhoneKart.repository.MySQLRepository;


@RestController
@RequestMapping(path = "/employees")
public class MyController {

	
	@Autowired
    private EmployeeDAO employeeDao;
	
	@Autowired
	MySQLRepository mySQLRepository;
	
	
	@GetMapping(path="/birthday/", produces = "application/json")
    public String getAllPersons()
    {  
		 List<Members>  mem = mySQLRepository.findAll();
			
			mem.forEach(s ->{
				System.out.println(s.getFull_name());
			});
		
		return "Inside PhoneKart";
    }
	
	@GetMapping(path="/test/", produces = "application/json")
    public String getEmployeesd()
    {  
		RestTemplate rr = new RestTemplate();
		
		rr.getForObject("http://localhost:8085/rest/", null);
		
		
		return "Inside PhoneKart";
    }
	
	@SuppressWarnings("unchecked")
	@GetMapping(path="/", produces = "application/json")
    public ResponseEntity<Object> getEmployees()
    {  Employees employeeList =  employeeDao.getAllEmployees();
        
        
        List<JSONObject> entities = new ArrayList<JSONObject>();
     
        for (Employee emp : employeeList.getEmployeeList()) {
        	JSONObject entity = new JSONObject();
        	
            entity.put("id", emp.getId());
            entity.put("email", emp.getEmail());
            entity.put("firstName", emp.getFirstName());
            entity.put("lastName", emp.getLastName());
            
            entities.add(entity);
        }
        
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
}
