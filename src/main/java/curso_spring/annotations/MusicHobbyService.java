package curso_spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("music")
public class MusicHobbyService implements HobbyService {

	public String getHobby() {
		return "I enjoy listening Rock music!";
	}

}
