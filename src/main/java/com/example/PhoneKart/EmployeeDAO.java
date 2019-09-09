package com.example.PhoneKart;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO {

private static Employees list = new Employees();
    
    static {
    
    	list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
     
    public Employees getAllEmployees() {
    	return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
    
    public Employee getEmployee(Integer id) {
    	
    	/*
    	for(Employee l : list.getEmployeeList()) {
    		
    		System.out.println(l.getId() + "  " +  id);
    		if(l.getId() == id) {
    		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
    		System.out.println(l);
    			return l;
    		}
    			
    	}
    	*/
    	return  list.getEmployeeList().stream().filter(i -> i.getId() == id ).findAny().orElse(null);
    	
    	
    }
}
