package net.mycompany.service;

import net.mycompany.pojo.Emp;

public interface IEmpService {
	public Emp getEmpById(int empId); 
	public Emp setEmpById(Emp emp); 
}
