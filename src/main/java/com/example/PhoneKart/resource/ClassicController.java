package com.example.PhoneKart.resource;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PhoneKart.DTO.MembersTO;
import com.example.PhoneKart.DTO.ResponseTO;
import com.example.service.FutureService;

@RestController
@RequestMapping(path = "/classic")
public class ClassicController {

	@Autowired
	FutureService futureService;
	
	@GetMapping(path = "/orders", produces = "application/json")
	public ResponseEntity<ResponseTO> getOrders() throws IOException {
		HttpHeaders responseHeaders = new HttpHeaders();
		ResponseTO responseTO = new ResponseTO();
		try {
			responseTO.setMessage(" New Record Succesfully added !!!");
			responseTO.setRandomNumber(Math.random());
			responseHeaders.set("Ankit-Example-Header", "Value-ResponseEntity_BuilderWithHttpHeaders");

			futureService.getSomeData();
			
		}catch(Exception e) {
			responseTO.setError(e.toString());
		}
		
		return new ResponseEntity<ResponseTO>(responseTO, responseHeaders, HttpStatus.ACCEPTED);
	}
}
