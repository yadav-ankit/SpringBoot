package com.example.PhoneKart;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/employees")
public class MyController {

	
	@Autowired
    private EmployeeDAO employeeDao;
	
	
	@GetMapping(path="/test/", produces = "application/json")
    public String getEmployeesd()
    {  
		return "Ankit Yadav";
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
