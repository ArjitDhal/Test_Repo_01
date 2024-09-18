package in.arjit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	public MessageRestController() {
		super();
		// TODO Auto-generated constructor stub
		
		
		System.out.println("OBJECT cONSTRUCTED FOR MESSAGE CONTROLLER ");
	}
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg()
	{
		
		String msg= "welcome to Arjit IT";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
	
	@GetMapping("/greet")
	public String grretMsg()
	{
		return "Good Morning";
		
	}
	 

}
