package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

public class MonthDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		System.out.println("Application context created");
		
		
		FinancialYearDetails financialYearDetails=applicationContext.getBean("financial",FinancialYearDetails.class);
		financialYearDetails.setYearId(1);
		financialYearDetails.setYearStartDate(LocalDate.of(2022, 05, 19));
		financialYearDetails.setYearEndDate(LocalDate.of(2022, 05, 19));
		System.out.println(financialYearDetails);
		
		MonthsDetails monthsDetails=applicationContext.getBean("month",MonthsDetails.class);
		monthsDetails.setMonthId(111);
		monthsDetails.setMonthStartDate(LocalDate.of(2012, 01, 03));
		monthsDetails.setMonthEndDate(LocalDate.of(1525, 02, 06));
		
		monthsDetails.setFinancialYearDetails(financialYearDetails);
		System.out.println(monthsDetails);
		

	}

}
