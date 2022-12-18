package com.glDepartments.Departments;
import com.Interface.*;

public abstract class SuperDepartment implements Department{

	public String departmentName()
	{
		return "Super Department";
		
	}
	public String getTodaysWork()
	
	{
		return "No work as of Now";
	}
	public String getWorkDeadline()
	{
		return "nil";
	}
	public String isTOdayAHoliday()
	
	{
		return "Today is not a Holiday";
	}
}