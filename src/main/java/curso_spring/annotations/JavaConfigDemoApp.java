package curso_spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp 
{
    public static void main( String[] args )
    {
        // read spring config java class
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(OfficeConfig.class);
    	
    	// get the bean from spring container
    	Employee employee = context.getBean("developer", Employee.class);
    	
    	// call a method on the bean
    	System.out.println(employee.getDailyTasks());
    	
    	System.out.println(employee.getHobby());
    	
    	// close the context
    	context.close();
    }
}
