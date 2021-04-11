import org.springframework.streotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {
	
	@RequestMapping("/")
	public String loginHomePage() {
		return "Hello, You are in Home Page!!";
	}
}