package com.example.PhoneKart.resource;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.PhoneKart.DTO.LifeProducts;
import com.example.PhoneKart.DTO.MembersTO;
import com.example.PhoneKart.DTO.ProductTO;
import com.example.PhoneKart.DTO.ResponseTO;
import com.example.PhoneKart.Security.Encryption;
import com.example.PhoneKart.configurations.PhoneConfig;
import com.example.PhoneKart.model.Employee;
import com.example.PhoneKart.model.Employees;
import com.example.PhoneKart.model.Members;
import com.example.PhoneKart.repository.EmployeeDAO;
import com.example.PhoneKart.repository.MySQLRepository;
import com.example.service.FutureService;

@RestController
@RequestMapping(path = "/play")
public class MyController {

	@Autowired
	private EmployeeDAO employeeDao;

	
	MySQLRepository mySQLRepository;

	@Autowired
	FutureService futureService;

	@GetMapping(path = "/nothing", produces = "application/json")
	public void doNothing() {
		// This will call interface method which do not know if call math or physics
		futureService.testPlay();
	}
	
	private static Cookie setCookie(HttpServletResponse response, String nom, String valeur) throws IOException {
		Cookie cookie = new Cookie(nom, URLEncoder.encode(valeur, "UTF-8"));

		response.addCookie(cookie);

		int arr[] = new int[20];

		// cookie.setSecure(true); only works with HTTPS;

		return cookie;
	}

	@GetMapping(path = "/kutte/{id}", produces = "application/json")
	public String getAllPerso(@PathVariable Integer id, HttpServletResponse response) throws IOException {

		Cookie c = setCookie(response, "Usrname", "yadav");

		Cookie another = setCookie(response, "OPIILOOO", "SAPNA");

		Encryption e = new Encryption();

		response.addCookie(c);
		response.addCookie(another);

		List<Members> mem = null; //mySQLRepository.findAll();

		mem.forEach(s -> {
			System.out.println(s.getFull_name());
		});

		return "Ankit";
	}

	@GetMapping(path = { "/test/", "/play/", "/rate/" }, produces = "application/json")
	public ResponseEntity<ProductTO> getEmpl(HttpServletResponse response) throws IOException {
		ProductTO productTO = new ProductTO();

		productTO.setId(23);
		productTO.setName("I am returning this name");
		productTO.setPlaying(32342222L);
		productTO.setTools("Tools to Play");

		LifeProducts l = new LifeProducts();
		l.setItemID(98);
		l.setItemName("Anything will do");

		productTO.setLifeProducts(l);

		System.out.println(productTO.getLifeProducts().getItemName());

		Cookie c = setCookie(response, "Product", "yadav_Ankit");

		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Ankit-Example-Header", "Value-ResponseEntity_BuilderWithHttpHeaders");

		response.addCookie(c);

		return new ResponseEntity<ProductTO>(productTO, responseHeaders, HttpStatus.ACCEPTED);
	}

	@GetMapping(path = "/birthday/{id}", produces = "application/json")
	public HttpServletResponse getAllPersons(@PathVariable Integer id, HttpServletResponse response)
			throws IOException {

		Cookie c = setCookie(response, "Usrname", "yadav");

		Cookie another = setCookie(response, "OPIILOOO", "SAPNA");

		response.addCookie(c);
		response.addCookie(another);

		List<Members> mem = null ;//mySQLRepository.findAll();

		mem.forEach(s -> {
			System.out.println(s.getFull_name());
		});

		return response;
	}

	@PostMapping(path = "/addMembers", produces = "application/json")
	public ResponseEntity<ResponseTO> addMembers(@RequestBody MembersTO memberTO) throws IOException {
		HttpHeaders responseHeaders = new HttpHeaders();
		ResponseTO responseTO = new ResponseTO();
		try {
			responseTO.setMessage(" New Record Succesfully added !!!");
			responseTO.setRandomNumber(Math.random());
			responseHeaders.set("Ankit-Example-Header", "Value-ResponseEntity_BuilderWithHttpHeaders");

			futureService.addMembers(memberTO);
		}catch(Exception e) {
			responseTO.setError(e.toString());
		}
		
		return new ResponseEntity<ResponseTO>(responseTO, responseHeaders, HttpStatus.ACCEPTED);
	}

	@SuppressWarnings("unchecked")
	@GetMapping(path = "/sample", produces = "application/json")
	public ResponseEntity<Object> getEmployees() {
		
		Employees employeeList = employeeDao.getAllEmployees();

		List<JSONObject> entities = new ArrayList<JSONObject>();
		
		AnnotationConfigApplicationContext cntxt = new AnnotationConfigApplicationContext(PhoneConfig.class);

		FutureService fck = (FutureService) cntxt.getBean(FutureService.class);

		System.out.println(fck.hashCode());
		cntxt.close();
		
		/*
		for (Employee emp : employeeList.getEmployeeList()) {
			JSONObject entity = new JSONObject();

			entity.put("id", emp.getId());
			entity.put("email", emp.getEmail());
			entity.put("firstName", emp.getFirstName());
			entity.put("lastName", emp.getLastName());

			entities.add(entity);
		}
		 */
		return new ResponseEntity<Object>(entities, HttpStatus.OK);
	}
}
