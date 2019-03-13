package curso_spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class MusicHobbyService implements HobbyService {

	public String getHobby() {
		return "I enjoy listening Rock music!";
	}

}
