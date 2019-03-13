package curso_spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee {

	@Autowired
	private HobbyService hobbyService;
	
	public Developer(HobbyService hobbyService) {
		this.hobbyService = hobbyService;
	}

	public String getDailyTasks() {
		return "Implement methods for BD connectivity";
	}

	public String getHobby() {
		return hobbyService.getHobby();
	}
	
}
