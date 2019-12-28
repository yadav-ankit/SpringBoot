package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;
import org.mockito.*;


public class FutureServiceTest {

	@Test
	public void play() {
		
		FutureService future = mock(FutureService.class);
	
		List<String> value = new ArrayList<String>(); 
		List<String> value1 = new ArrayList<String>(); 
		List<String> value2 = new ArrayList<String>(); 
		
		value.add("Ankit");
		value.add("Hemant");
		
		value1.add("Ankit");
		
		//when(future.getSomeData(Mockito.anyInt(), Mockito.anyString() )).thenReturn(value);
		
		//when(future.getSomeData()).thenReturn(value).thenReturn(value1).thenReturn(value2);
		
		assertEquals(2, value.size());
		assertEquals(value1, value.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()));
		
		
		assertEquals(0, value2.size());
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockListGetToThrowException() {
		List<String> list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenThrow(
				new RuntimeException("Something went wrong"));
		list.get(0);
	}

	
}
