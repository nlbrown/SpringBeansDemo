package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");       
        Employee employee = ctx.getBean(Employee.class);
        Ramp ramp = ctx.getBean(Ramp.class);

        System.out.println(ramp.toString());
        System.out.println(employee.toString());

	}

}
