package com.codegnan.factories;
import com.codegnan.service.EmployeeServiceImpl;
 
public class EmployeeServiceFactory {
  	private static EmployeeServiceImpl employeeService = null;
  	static {
        	employeeService = new EmployeeServiceImpl();
  	}
 
  	public static EmployeeServiceImpl getEmployeeService() {
        	return employeeService;
  	}
}
