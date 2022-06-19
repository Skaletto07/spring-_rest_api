package com.kostkin.rest;

import com.kostkin.rest.configuration.MyConfig;
import com.kostkin.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);
/*        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);*/

       /* Employee employeeByID = communication.getEmployee(1);
        System.out.println(employeeByID);*/

//        Employee employee = new Employee("Sveta", "Putina", "Sales", 800);
//        employee.setId(12);
//
//        communication.saveEmployee(employee);

        communication.deleteEmployee(12);


    }
}
