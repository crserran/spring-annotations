package curso_spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee {

	private HobbyService musicHobbyService;
	
	private HobbyService sportHobbyService;
	
	@Autowired
	public Developer(@Qualifier("music") HobbyService musicHobbyService, 
					 @Qualifier("sport") HobbyService sportHobbyService) {
		this.musicHobbyService = musicHobbyService;
		this.sportHobbyService = sportHobbyService;
	}

	public String getDailyTasks() {
		return "Implement methods for BD connectivity";
	}

	public String getHobby() {
		return musicHobbyService.getHobby() + "\n" + sportHobbyService.getHobby();
	}
	
}
