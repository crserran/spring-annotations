package curso_spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sport")
public class SportHobbyService implements HobbyService {

	public String getHobby() {
		return "I enjoy playing Handball!";
	}

}
