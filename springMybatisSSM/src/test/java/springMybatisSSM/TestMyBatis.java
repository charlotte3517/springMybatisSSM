package springMybatisSSM;
import javax.annotation.Resource; 
import org.apache.log4j.Logger; 
import org.junit.Before; 
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import org.springframework.test.context.ContextConfiguration; 
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 
import com.alibaba.fastjson.JSON;

import net.mycompany.pojo.Emp;
import net.mycompany.service.IEmpService; 
 
@RunWith(SpringJUnit4ClassRunner.class) //表示繼承了SpringJUnit4ClassRunner類 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestMyBatis { 
 private static Logger logger = Logger.getLogger(TestMyBatis.class); 
// private ApplicationContext ac = null; 
 @Resource
 private IEmpService empService = null; 
// @Before 
// public void before() { 
// ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
// empService = (IEmpService) ac.getBean("empService"); 
// } 
 @Test
 public void test1() {
	Emp emp = empService.getEmpById(1); 
//  System.out.println(emp.getUserName()); 
//  logger.info("值："+emp.getUserName()); 
 logger.info(JSON.toJSONString(emp)); 
 } 
}
