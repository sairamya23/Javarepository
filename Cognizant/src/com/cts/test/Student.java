package com.cts.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now().plusDays(7);
		String indate = dtf.format(ldate); 
			System.out.println(indate);
		
	}

}
