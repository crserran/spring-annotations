package curso_spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // read spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// get the bean from spring container
    	Employee employee = context.getBean("developer", Employee.class);
    	
    	// call a method on the bean
    	System.out.println(employee.getDailyTasks());
    	
    	System.out.println(employee.getHobby());
    	
    	// close the context
    	context.close();
    }
}
