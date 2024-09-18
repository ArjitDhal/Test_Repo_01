package in.arjit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.arjit.binding.Customer;

@RestController
public class CustomerRestController {
	
	
	@GetMapping(value = "/customer", produces={"application/xml","application/json"})
	public Customer getCustomer()
	{
		
		Customer cs= new Customer();
		
		cs.setCity("BBSR");
		cs.setGender("Male");
		cs.setName("Arjit");
		
		return cs;
	}

	@PostMapping(value = "/customer" ,consumes = {"application/xml","application/json"},produces = "tesxt/plain")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c)
	{
		
		System.out.println("print customer data"+c);
		return new ResponseEntity<String>("Data get inserted",HttpStatus.OK);
	}
	
	
}
