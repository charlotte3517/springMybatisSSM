package net.mycompany.service.impl;

import java.util.Optional;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import net.mycompany.dao.IEmpDao;
import net.mycompany.pojo.Emp;
import net.mycompany.service.IEmpService;

@Service("empService") 
public class EmpServiceImpl implements IEmpService { 
 @Resource
 private IEmpDao empDao; 
 private static Logger logger = Logger.getLogger(EmpServiceImpl.class); 
 @Override
 public Emp getEmpById(int empId) { 
 return this.empDao.selectByPrimaryKey(empId); 
 } 
 
 @Override
 public Emp setEmpById(Emp emp) { 
	 try {		 
		 if(null != this.empDao.selectByPrimaryKey(emp.getId())) {
			 this.empDao.updateByPrimaryKeySelective(emp);
		 }else {
			 this.empDao.insert(emp);
		 }
	 }catch(Exception e){
		 logger.info("setEmpById exeption: " + e);
	 }	 
	 
	 return this.empDao.selectByPrimaryKey(emp.getId()); 
 }  
}
